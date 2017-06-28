package com.ailk.devinfo.domain;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * @author zhuxb3(74637)
 * @version 1.0
 * @category com.ai.ngis.sysinf.bus.socserv.pojo
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2017-03-29 10:41:10
 */
public class DevInfoPO
{

    private String deviceId;
    private String deviceIdExQueryType; //--0：精确 ，--1：模糊
    private String deviceNameQueryType; //--0：精确 ，--1：模糊
    private String deviceIp;
    private String deviceIdEx;
    private String deviceName;
    private String vendorName;
    private String cityName;
    private String officeName;
    private String zoneName;
    private String loopBackIp;
    private String minIp;
    private String pageNo;//第几页
    private String pageSize;//每页个数
    private String pageTotalCount;//总页数
    private String top;
    private String resourceTypeId;
    private String vendorId;
    private String deviceModel;
    private String osVersion;
    private String snmpRoCommunity;
    private String snmpRwCommunity;
    private String cityId;
    private String officeId;
    private String zoneId;
    private String deviceSerialNumeric;
    private String staffId;
    private String gatherId;
    private String serviceYear;
    private String remark;

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getServiceYear()
    {
        return serviceYear;
    }

    public void setServiceYear(String serviceYear)
    {
        this.serviceYear = serviceYear;
    }

    public String getResourceTypeId()
    {
        return resourceTypeId;
    }

    public void setResourceTypeId(String resourceTypeId)
    {
        this.resourceTypeId = resourceTypeId;
    }

    public String getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(String vendorId)
    {
        this.vendorId = vendorId;
    }

    public String getOsVersion()
    {
        return osVersion;
    }

    public void setOsVersion(String osVersion)
    {
        this.osVersion = osVersion;
    }

    public String getSnmpRoCommunity()
    {
        return snmpRoCommunity;
    }

    public void setSnmpRoCommunity(String snmpRoCommunity)
    {
        this.snmpRoCommunity = snmpRoCommunity;
    }

    public String getSnmpRwCommunity()
    {
        return snmpRwCommunity;
    }

    public void setSnmpRwCommunity(String snmpRwCommunity)
    {
        this.snmpRwCommunity = snmpRwCommunity;
    }

    public String getCityId()
    {
        return cityId;
    }

    public void setCityId(String cityId)
    {
        this.cityId = cityId;
    }

    public String getOfficeId()
    {
        return officeId;
    }

    public void setOfficeId(String officeId)
    {
        this.officeId = officeId;
    }

    public String getZoneId()
    {
        return zoneId;
    }

    public void setZoneId(String zoneId)
    {
        this.zoneId = zoneId;
    }

    public String getDeviceSerialNumeric()
    {
        return deviceSerialNumeric;
    }

    public void setDeviceSerialNumeric(String deviceSerialNumeric)
    {
        this.deviceSerialNumeric = deviceSerialNumeric;
    }

    public String getStaffId()
    {
        return staffId;
    }

    public void setStaffId(String staffId)
    {
        this.staffId = staffId;
    }

    public String getGatherId()
    {
        return gatherId;
    }

    public void setGatherId(String gatherId)
    {
        this.gatherId = gatherId;
    }

    //private Map<String, Object> devInfoMap;
    private List<Map<String, Object>> devInfoList;

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

    public String getDeviceIdExQueryType()
    {
        return deviceIdExQueryType;
    }

    public void setDeviceIdExQueryType(String deviceIdExQueryType)
    {
        this.deviceIdExQueryType = deviceIdExQueryType;
    }

    public String getDeviceNameQueryType()
    {
        return deviceNameQueryType;
    }

    public void setDeviceNameQueryType(String deviceNameQueryType)
    {
        this.deviceNameQueryType = deviceNameQueryType;
    }

    public String getDeviceIdEx()
    {
        return deviceIdEx;
    }

    public void setDeviceIdEx(String deviceIdEx)
    {
        this.deviceIdEx = deviceIdEx;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getOfficeName()
    {
        return officeName;
    }

    public void setOfficeName(String officeName)
    {
        this.officeName = officeName;
    }

    public String getZoneName()
    {
        return zoneName;
    }

    public void setZoneName(String zoneName)
    {
        this.zoneName = zoneName;
    }

    public String getLoopBackIp()
    {
        return loopBackIp;
    }

    public void setLoopBackIp(String loopBackIp)
    {
        this.loopBackIp = loopBackIp;
    }

    public String getMinIp()
    {
        return minIp;
    }

    public void setMinIp(String minIp)
    {
        this.minIp = minIp;
    }


    public String getDeviceIp()
    {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp)
    {
        this.deviceIp = deviceIp;
    }

    public String getVendorName()
    {
        return vendorName;
    }

    public void setVendorName(String vendorName)
    {
        this.vendorName = vendorName;
    }

    public String getDeviceModel()
    {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel)
    {
        this.deviceModel = deviceModel;
    }

    public List<Map<String, Object>> getDevInfoList()
    {
        return devInfoList;
    }

    public void setDevInfoList(List<Map<String, Object>> devInfoList)
    {
        this.devInfoList = devInfoList;
    }

    public DevInfoPO()
    {
    }

    public DevInfoPO(String deviceIp, String vendorName, String deviceModel)
    {
        this.deviceIp = deviceIp;
        this.vendorName = vendorName;
        this.deviceModel = deviceModel;
    }


    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + "--toString--" + JSON.toJSONString(this);
    }


}