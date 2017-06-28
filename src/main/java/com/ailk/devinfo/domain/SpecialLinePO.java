package com.ailk.devinfo.domain;

import java.util.List;
import java.util.Map;

/**
 * @author zhuxb
 * @create 2017-05-04 21:27
 */
public class SpecialLinePO
{
    //前台CURD入参
    private String lineFlag;//VPN专线 ：VPN  \互联网专线：Internet
    private String customeName;//用户名称
    private String cityId;//属地 id
    private String barsOrSrIP;//bars/sr设备 ip
    private String vrfName;//vrfName
    private String circuitno;//电路编号
    private String pageNo;//第几页
    private String pageSize;//每页个数
    private String pageTotalCount;//总页数
    private String top;//查询前top条
    private List<Map<String, Object>> lineInfoList;
    private SpecialDetailPO specialDetailPO;


    public SpecialDetailPO getSpecialDetailPO()
    {
        return specialDetailPO;
    }

    public void setSpecialDetailPO(SpecialDetailPO specialDetailPO)
    {
        this.specialDetailPO = specialDetailPO;
    }

    public List<Map> getCityList()
    {
        return cityList;
    }

    public void setCityList(List<Map> cityList)
    {
        this.cityList = cityList;
    }




    private List<Map> cityList;


    public String getCircuitno()
    {
        return circuitno;
    }

    public void setCircuitno(String circuitno)
    {
        this.circuitno = circuitno;
    }

    public String getLineFlag()
    {
        return lineFlag;
    }

    public void setLineFlag(String lineFlag)
    {
        this.lineFlag = lineFlag;
    }

    public String getCustomeName()
    {
        return customeName;
    }

    public void setCustomeName(String customeName)
    {
        this.customeName = customeName;
    }

    public String getCityId()
    {
        return cityId;
    }

    public void setCityId(String cityId)
    {
        this.cityId = cityId;
    }

    public String getBarsOrSrIP()
    {
        return barsOrSrIP;
    }

    public void setBarsOrSrIP(String barsOrSrIP)
    {
        this.barsOrSrIP = barsOrSrIP;
    }

    public String getVrfName()
    {
        return vrfName;
    }

    public void setVrfName(String vrfName)
    {
        this.vrfName = vrfName;
    }

    public String getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(String pageNo)
    {
        this.pageNo = pageNo;
    }

    public String getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(String pageSize)
    {
        this.pageSize = pageSize;
    }

    public String getPageTotalCount()
    {
        return pageTotalCount;
    }

    public void setPageTotalCount(String pageTotalCount)
    {
        this.pageTotalCount = pageTotalCount;
    }

    public String getTop()
    {
        return top;
    }

    public void setTop(String top)
    {
        this.top = top;
    }

    public List<Map<String, Object>> getLineInfoList()
    {
        return lineInfoList;
    }

    public void setLineInfoList(List<Map<String, Object>> lineInfoList)
    {
        this.lineInfoList = lineInfoList;
    }

}
