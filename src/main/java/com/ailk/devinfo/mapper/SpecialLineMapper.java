
package com.ailk.devinfo.mapper;

import com.ailk.devinfo.domain.SpecialDetailPO;
import com.ailk.devinfo.domain.SpecialLinePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SpecialLineMapper
{
	List<Map<String, Object>> qryVPNOrInternetData(SpecialLinePO po);

    List<Map<String,String>> qryCitys();

    List<Map<String,String>> qryCusInfoByCircuitno(String circuitno);

    List<Map<String,String>> qryVpnInfoByCircuitno(String circuitno);

    int isExistInCustomInfo(String circuitno);

    int updCustomerInfo(SpecialDetailPO specialDetailPO);

    int addCustomerInfo(SpecialDetailPO specialDetailPO);
}
