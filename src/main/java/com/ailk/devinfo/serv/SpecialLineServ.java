package com.ailk.devinfo.serv;

import com.ailk.devinfo.domain.SpecialDetailPO;
import com.ailk.devinfo.domain.SpecialLinePO;
import com.ailk.devinfo.mapper.SpecialLineMapper;
import com.ailk.devinfo.util.CityUtils;
import com.ailk.devinfo.util.PropertiesUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhuxb3(74637)
 * @version 1.0
 * @category com.ailk.devinfo.serv
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2017/05/05 16:22
 */
@Service
public class SpecialLineServ
{
    public static final Logger logger = Logger.getLogger(SpecialLineServ.class);
    @Autowired
    private SpecialLineMapper specialLineMapper;

    public static final String MATCH_FILE = "configuration/match.properties";

    public SpecialLinePO qryVPNOrInternetData(SpecialLinePO specialLinePO)
    {
        logger.info("SpecialLineServ qryVPNOrInternetData enter...cityId:" + specialLinePO.getCityId());
        List<Map<String, Object>> lst = null;
        int pageNo = 0;
        int pageSize = 0;
        int pageTotalCount = 0;
        int lstSize = 0;
        String poCityId = specialLinePO.getCityId();
        List<String> allCityIdList = new ArrayList<String>();
        //status状态含义对应Map
        Map<String, String> statusMatchMap = PropertiesUtils.getPropertiesMap(MATCH_FILE);

        List<Map<String, String>> allCityList = specialLineMapper.qryCitys();
        for (Map<String, String> city : allCityList)
        {
            allCityIdList.add(city.get("city_id"));
        }
        if (allCityIdList.contains(poCityId))
        {
            List<String> cityIdStr = CityUtils.getSubCityIdList(allCityList, specialLinePO.getCityId(), -1, true);
            specialLinePO.setCityId(CityUtils.weave(cityIdStr));
        }
        pageNo = !isEmpty(specialLinePO.getPageNo()) ? Integer.parseInt(specialLinePO.getPageNo()) : 1;
        pageSize = !isEmpty(specialLinePO.getPageSize()) ? Integer.parseInt(specialLinePO.getPageSize()) : 10;
        specialLinePO.setTop(pageNo * pageSize + "");
        lst = specialLineMapper.qryVPNOrInternetData(specialLinePO);
        logger.info("qryVPNOrInternetData lst.size" + lst.size());
        if (!CollectionUtils.isEmpty(lst))
        {
            for (Map<String, Object> m : lst)
            {
                m.put("status", statusMatchMap.get(m.get("status")));
            }
            lstSize = lst.size();
            pageTotalCount = lstSize / pageSize + 1;
            specialLinePO.setPageTotalCount(pageTotalCount + "");
            lst = lst.subList((pageNo - 1) * pageSize, pageNo * pageSize > lstSize ? lstSize : pageNo * pageSize);
            specialLinePO.setLineInfoList(lst);
        }
        //恢复cityId
        specialLinePO.setCityId(poCityId);
        return specialLinePO;
    }

    public List<Map<String, String>> qryCitys()
    {
        logger.info("SpecialLineServ qryCitys enter...");
        List<Map<String, String>> lst = specialLineMapper.qryCitys();
        return lst;
    }

    public Map<String, String> qryVPNOrInternetDetail(String circuitno)
    {
        logger.info("SpecialLineServ qryVPNOrInternetDetail --" + circuitno);

        List<Map<String, String>> infoList = specialLineMapper.qryCusInfoByCircuitno(circuitno);
        Map<String, String> infoMap = new HashMap<String, String>();
        if (infoList != null && infoList.size() > 0)
        {
            infoMap.putAll(infoList.get(0));
        }
        infoList = specialLineMapper.qryVpnInfoByCircuitno(circuitno);
        if (infoList != null && infoList.size() > 0)
        {
            infoMap.putAll(infoList.get(0));
        }

        return infoMap;
    }


    public int isExistInCustomInfo(String circuitno)
    {
        int i = specialLineMapper.isExistInCustomInfo(circuitno);
        return i;
    }

    public String updCustomerInfo(SpecialDetailPO specialDetailPO)
    {

        return specialLineMapper.updCustomerInfo(specialDetailPO) > 0 ? "SUCCESS" : "FAIL";
    }

    public String addCustomerInfo(SpecialDetailPO specialDetailPO)
    {
        return specialLineMapper.addCustomerInfo(specialDetailPO) > 0 ? "SUCCESS" : "FAIL";
    }

    /**
     * Map-->object
     *
     * @param retMap
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T populate(Map<String, String> retMap, Class<T> c)
    {
        T t = null;
        try
        {
            t = c.newInstance();
            BeanUtils.populate(t, retMap);
        } catch (Exception e)
        {
            logger.error("populate error", e);
        }
        return t;
    }

    /**
     * @param str
     * @return
     */
    public static boolean isEmpty(String str)
    {
        return str == null || str.length() == 0;
    }
}
