package com.ailk.devinfo.web;

import com.ailk.devinfo.domain.SpecialDetailPO;
import com.ailk.devinfo.domain.SpecialLinePO;
import com.ailk.devinfo.serv.SpecialLineServ;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * VPN、互联网专线 接口
 *
 * @author zhuxb
 * @create 2017-05-05 9:08
 */
@RequestMapping("/specialLine")
@Controller
public class SpecialLineController
{
    public static final Logger log = Logger.getLogger(SpecialLineController.class);
    @Autowired
    private SpecialLineServ specialLineServ;


    @ResponseBody
    @RequestMapping("/qryVPNOrInternetData")
    public SpecialLinePO qryVPNOrInternetData(@RequestBody SpecialLinePO specialLinePO)
    {
        log.info("SpecialLineController  qryVPNOrInternetData enter:" + specialLinePO);
        return specialLineServ.qryVPNOrInternetData(specialLinePO);
    }

    @ResponseBody
    @RequestMapping("/qryCitys")
    public List<Map<String, String>> qryCitys()
    {
        log.info("SpecialLineController  qryCitys enter:");
        return specialLineServ.qryCitys();
    }

    @ResponseBody
    @RequestMapping("/qryVPNOrInternetDetail")
    public SpecialLinePO qryVPNOrInternetDetail(@RequestBody SpecialLinePO specialLinePO)
    {
        log.info("SpecialLineController  qryVPNOrInternetDetail enter:" + specialLinePO.getCircuitno());
        Map<String, String> specialMap = specialLineServ.qryVPNOrInternetDetail(specialLinePO.getCircuitno());
        specialLinePO.setSpecialDetailPO(SpecialLineServ.populate(specialMap, SpecialDetailPO.class));
        return specialLinePO;
    }

    @RequestMapping("/isExistInCustomInfo")
    @ResponseBody
    public int isExistInCustomInfo(@RequestParam(name = "circuitno",required = true) String circuitno)
    {
        log.info("SpecialLineController  isExistInCustomInfo enter:" + circuitno);

        return specialLineServ.isExistInCustomInfo(circuitno);
    }


    @ResponseBody
    @RequestMapping("/updCustomerInfo")
    public String updCustomerInfo(@RequestBody SpecialDetailPO specialDetailPO)
    {


        return specialLineServ.updCustomerInfo(specialDetailPO);
    }

    @ResponseBody
    @RequestMapping("/addCustomerInfo")
    public String addCustomerInfo(@RequestBody SpecialDetailPO specialDetailPO)
    {
        return specialLineServ.addCustomerInfo(specialDetailPO);
    }
}
