package com.ailk.devinfo.web;

import com.ailk.devinfo.domain.DevInfoPO;
import com.ailk.devinfo.serv.DevInfoServ;
import com.alibaba.fastjson.JSON;
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
 * 设备资源
 *
 * @author zhuxb3(74637)
 * @version 1.0
 * @category com.ailk.devinfo.web
 * @copyright Ailk NBS-Network Mt. RD Dept.
 * @since 2017/3/30 15:58
 */
@Controller
public class DevInfoControl
{
    public static final Logger logger =Logger.getLogger(DevInfoControl.class);
    @Autowired
    private DevInfoServ devInfoServ;

    /**
     * 测试
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        logger.info("index enter ...");
        return "index111.html";
    }

    /**
     * 查询设备信息 以Array[{object}]方式入参
     *  var dataAry = [];
     *  var reqObj = {};
     *  reqObj.deviceId="100000";
     *  reqObje.xx=xx;
     *  dataAry.push(reqObj);
     *  $.ajax({data: JSON.stringify(dataAry)});
     * @param devInfoPOs
     * @return
     */
    @RequestMapping("/devInfo")
    @ResponseBody
    public List<DevInfoPO> selectDevInfo(@RequestBody List<DevInfoPO> devInfoPOs)
    {
        logger.info("DevInfoControl enter ..."+ JSON.toJSONString(devInfoPOs));
       return devInfoServ.selectDevInfo(devInfoPOs);
    }

    /**
     * 查询设备信息 以{object}方式入参
     *  var reqObj = {};
     *  reqObj.deviceId="100000";
     *  reqObje.xx=xx;
     *  $.ajax({data: JSON.stringify(reqObj)});
     * @param devInfoPO
     * @return
     */

    @RequestMapping("/qryDevInfo")
    @ResponseBody
    public DevInfoPO qryDevInfo(@RequestBody DevInfoPO devInfoPO)
    {
        logger.info("qryDevInfo enter ..."+ JSON.toJSONString(devInfoPO));
        return devInfoServ.qryDevInfo(devInfoPO);
    }

    @RequestMapping("/qryVendors")
    @ResponseBody
    public List<Map<String, Object>> qryVendors(){

        return devInfoServ.qryVendors();
    }

    @RequestMapping("/qryDeviceModels")
    @ResponseBody
    List<Map<String, Object>> qryDeviceModels(@RequestParam(name="vendor_id",required = false) String vendor_id){

        logger.info("vendor_id:"+vendor_id);
        return devInfoServ.qryDeviceModels(vendor_id);
    }

    @RequestMapping("/qryCitys")
    @ResponseBody
    List<Map<String, Object>> qryCitys(){
        return devInfoServ.qryCitys();
    }
    @RequestMapping("/qryOffices")
    @ResponseBody
    List<Map<String, Object>> qryOffices(@RequestParam(name="city_id",required = false) String city_id){
        logger.info("city_id:"+city_id);
        return devInfoServ.qryOffices(city_id);
    }
    @RequestMapping("/qryZones")
    @ResponseBody
    List<Map<String, Object>> qryZones(){
        return devInfoServ.qryZones();
    }

    /**
     * 设备层次列表
     *
     * @return
     */
    @RequestMapping("/qryResourceTypes")
    @ResponseBody
    public List<Map<String, Object>> qryResourceTypes()
    {
        return devInfoServ.qryResourceTypes();
    }

    /**
     * MIB 版本列表
     *
     * @return
     */
    @RequestMapping("/qryOsVersions")
    @ResponseBody
    public List<Map<String, Object>> qryOsVersions()
    {
        return devInfoServ.qryOsVersions();
    }

    /**
     * 采集机列表
     *
     * @return
     */
    @RequestMapping("/qryGathers")
    @ResponseBody
    public List<Map<String, Object>> qryGathers()
    {

        return devInfoServ.qryGathers();
    }

    /**
     * 更新设备
     *
     * @param devInfoPO
     * @return
     */
    @RequestMapping("/updOneDev")
    @ResponseBody
    public String updOneDev(@RequestBody DevInfoPO devInfoPO)
    {
        return devInfoServ.updOneDev(devInfoPO);
    }

    /**
     * 删除设备
     *
     * @return
     */
    @RequestMapping("/delOneDev")
    @ResponseBody
    public String delOneDev(@RequestParam(name="deviceId",required = true) String device_id)
    {
        return devInfoServ.delOneDev(device_id);
    }



    /**
     * 检测度口令
     *
     * @return
     */
    @RequestMapping("/verifyReadCommunity")
    @ResponseBody
    public String verifyReadCommunity()
    {
        return devInfoServ.verifyReadCommunity();
    }
    //checkSnmp(){
    //    request.setCharacterEncoding("GBK");
    //    System.out.println("*****************************");
    //
    //    String ip = request.getParameter("ip");
    //    String gather_id = request.getParameter("gather_id");
    //    String snmp_ro_community = request.getParameter("snmp_ro_community");
    //    String snmp_rw_community = request.getParameter("snmp_rw_community");
    //
    //
    //    Data ro[] = null;
    //    Data rw[] = null;
    //    WebCorba corba = null;
    //
    //
    //
    //    PerformanceManager performanceManager = null;
    //
    //    try
    //    {
    //
    //        corba = new WebCorba("SnmpGather", gather_id, "1");
    //
    //        performanceManager = (PerformanceManager) corba.getIDLCorba("SnmpGather");
    //
    //        if(null!=performanceManager){
    //            try{
    //                ro = performanceManager.VerifyReadCommunity(ip,snmp_ro_community);
    //                if(null!=snmp_rw_community&&!"".equals(snmp_rw_community))
    //                    rw = performanceManager.VerifyReadCommunity(ip,snmp_rw_community);
    //            }
    //            catch(Exception e){
    //                try{
    //                    corba.refreshCorba("c");
    //                    performanceManager = (PerformanceManager)corba.getIDLCorba("SnmpGather");
    //                    ro = performanceManager.VerifyReadCommunity(ip,snmp_ro_community);
    //                    if(null!=snmp_rw_community&&!"".equals(snmp_rw_community))
    //                        rw = performanceManager.VerifyReadCommunity(ip,snmp_rw_community);
    //                }catch(Exception e1){
    //                    e1.printStackTrace();
    //                }
    //            }
    //        }
    //    }
    //    catch(Exception e)
    //    {
    //        e.printStackTrace();
    //    }
    //    if(null!=snmp_rw_community&&!"".equals(snmp_rw_community)){
    //        if (ro!=null&&null!=rw){
    //            System.out.println("*****************************"+ro[0].dataStr);
    //            System.out.println("*****************************"+rw[0].dataStr);
    //            //1:读写口令皆不可读;2读口令准确,写口令不可读;3写口令可读,读口令错误;4读写口令皆可读
    //            if("NODATA".equals(ro[0].dataStr)&&"NODATA".equals(rw[0].dataStr))
    //
    //            else if(!"".equals(ro[0].dataStr)&&"NODATA".equals(rw[0].dataStr))
    //                out.println("2");
    //            else if(!"".equals(rw[0].dataStr)&&"NODATA".equals(ro[0].dataStr))
    //                out.println("3");
    //            else if(!"".equals(rw[0].dataStr)&&!"".equals(ro[0].dataStr))
    //                out.println("4");
    //        }else out.println("fail");
    //    }else{
    //        if (ro!=null){
    //            System.out.println("*****************************"+ro[0].dataStr);
    //            //5:读口可读;6读口令错误
    //            if("NODATA".equals(ro[0].dataStr))
    //                out.println("6");
    //            else if(!"".equals(ro[0].dataStr))
    //                out.println("5");
    //        }else out.println("fail");
    //    }
    //}
}
