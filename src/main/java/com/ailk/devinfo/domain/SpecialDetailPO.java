package com.ailk.devinfo.domain;

import com.alibaba.fastjson.JSON;

/**
 * @author zhuxb
 * @create 2017-05-09 16:49
 */
public class SpecialDetailPO
{
    private String circuitno;//电路编号
    //tab_vpncustome_info:用户导入信息表、tp_mplsvpn_info:专线信息表 、tp_mplsvpn_link:专线链路信息表（汇聚设备和接入设备信息来自于专线链路信息表）
    //tab_vpncustome_info 用户信息表
    private String city_name;//属地
    private String custome_name;//客户名称
    private String custome_leve;//客户等级
    private String vrfname;//Vrfname
    private String custome_speed;//
    private String custome_type;
    private String if_man_bear;
    private String bus_type;
    private String bars_sr_pe_ip;
    private String bars_sr_pe_port;
    private String bars_sr_pe_physicalport;
    private String access_type;
    private String access_ip;
    private String access_port;
    private String cus_manager;
    private String cus_manager_phone;
    private String open_acc_addr;
    private String open_acc_name;
    private String open_acc_phone;
    private String open_acc_time;
    private String rd;
    private String import_rt;
    private String export_rt;
    private String svlan;
    private String cvlan;
    private String cusipnet;
    private String cusip;
    private String odf1;
    private String odf2;
    //tp_mplsvpn_info 专线信息表字段  前缀mpls_
    private String mpls_device_name;//PE设备名称
    private String mpls_pe_ip;//PE IP
    private String mpls_pe_port_desc;//PE端口描述
    private String mpls_city_id;
    private String mpls_arp_ip;
    private String mpls_vrfname;//
    private String mpls_rd;//RD
    private String mpls_import_rt;
    private String mpls_pe_port;
    private String mpls_physicalport;
    private String mpls_export_rt;
    private String mpls_svlan;
    private String mpls_cvlan;
    private String mpls_ceipnet;
    private String mpls_fir_switch_ip;
    private String mpls_fir_switch_up_port;
    private String mpls_fir_switch_down_port;
    private String mpls_sec_switch_ip;
    private String mpls_sec_switch_up_port;
    private String mpls_sec_switch_down_port;
    private String mpls_access_ip;
    private String mpls_access_name;
    private String mpls_access_up_port;
    private String mpls_access_down_port;
    private String mpls_fir_switch_name;
    private String mpls_sec_switch_name;

    public String getCircuitno()
    {
        return circuitno;
    }

    public void setCircuitno(String circuitno)
    {
        this.circuitno = circuitno;
    }

    public String getCity_name()
    {
        return city_name;
    }

    public void setCity_name(String city_name)
    {
        this.city_name = city_name;
    }

    public String getCustome_name()
    {
        return custome_name;
    }

    public void setCustome_name(String custome_name)
    {
        this.custome_name = custome_name;
    }

    public String getCustome_leve()
    {
        return custome_leve;
    }

    public void setCustome_leve(String custome_leve)
    {
        this.custome_leve = custome_leve;
    }

    public String getVrfname()
    {
        return vrfname;
    }

    public void setVrfname(String vrfname)
    {
        this.vrfname = vrfname;
    }

    public String getCustome_speed()
    {
        return custome_speed;
    }

    public void setCustome_speed(String custome_speed)
    {
        this.custome_speed = custome_speed;
    }

    public String getCustome_type()
    {
        return custome_type;
    }

    public void setCustome_type(String custome_type)
    {
        this.custome_type = custome_type;
    }

    public String getIf_man_bear()
    {
        return if_man_bear;
    }

    public void setIf_man_bear(String if_man_bear)
    {
        this.if_man_bear = if_man_bear;
    }

    public String getBus_type()
    {
        return bus_type;
    }

    public void setBus_type(String bus_type)
    {
        this.bus_type = bus_type;
    }

    public String getBars_sr_pe_ip()
    {
        return bars_sr_pe_ip;
    }

    public void setBars_sr_pe_ip(String bars_sr_pe_ip)
    {
        this.bars_sr_pe_ip = bars_sr_pe_ip;
    }

    public String getBars_sr_pe_port()
    {
        return bars_sr_pe_port;
    }

    public void setBars_sr_pe_port(String bars_sr_pe_port)
    {
        this.bars_sr_pe_port = bars_sr_pe_port;
    }

    public String getBars_sr_pe_physicalport()
    {
        return bars_sr_pe_physicalport;
    }

    public void setBars_sr_pe_physicalport(String bars_sr_pe_physicalport)
    {
        this.bars_sr_pe_physicalport = bars_sr_pe_physicalport;
    }

    public String getAccess_type()
    {
        return access_type;
    }

    public void setAccess_type(String access_type)
    {
        this.access_type = access_type;
    }

    public String getAccess_ip()
    {
        return access_ip;
    }

    public void setAccess_ip(String access_ip)
    {
        this.access_ip = access_ip;
    }

    public String getAccess_port()
    {
        return access_port;
    }

    public void setAccess_port(String access_port)
    {
        this.access_port = access_port;
    }

    public String getCus_manager()
    {
        return cus_manager;
    }

    public void setCus_manager(String cus_manager)
    {
        this.cus_manager = cus_manager;
    }

    public String getCus_manager_phone()
    {
        return cus_manager_phone;
    }

    public void setCus_manager_phone(String cus_manager_phone)
    {
        this.cus_manager_phone = cus_manager_phone;
    }

    public String getOpen_acc_addr()
    {
        return open_acc_addr;
    }

    public void setOpen_acc_addr(String open_acc_addr)
    {
        this.open_acc_addr = open_acc_addr;
    }

    public String getOpen_acc_name()
    {
        return open_acc_name;
    }

    public void setOpen_acc_name(String open_acc_name)
    {
        this.open_acc_name = open_acc_name;
    }

    public String getOpen_acc_phone()
    {
        return open_acc_phone;
    }

    public void setOpen_acc_phone(String open_acc_phone)
    {
        this.open_acc_phone = open_acc_phone;
    }

    public String getOpen_acc_time()
    {
        return open_acc_time;
    }

    public void setOpen_acc_time(String open_acc_time)
    {
        this.open_acc_time = open_acc_time;
    }

    public String getRd()
    {
        return rd;
    }

    public void setRd(String rd)
    {
        this.rd = rd;
    }

    public String getImport_rt()
    {
        return import_rt;
    }

    public void setImport_rt(String import_rt)
    {
        this.import_rt = import_rt;
    }

    public String getExport_rt()
    {
        return export_rt;
    }

    public void setExport_rt(String export_rt)
    {
        this.export_rt = export_rt;
    }

    public String getSvlan()
    {
        return svlan;
    }

    public void setSvlan(String svlan)
    {
        this.svlan = svlan;
    }

    public String getCvlan()
    {
        return cvlan;
    }

    public void setCvlan(String cvlan)
    {
        this.cvlan = cvlan;
    }

    public String getCusipnet()
    {
        return cusipnet;
    }

    public void setCusipnet(String cusipnet)
    {
        this.cusipnet = cusipnet;
    }

    public String getCusip()
    {
        return cusip;
    }

    public void setCusip(String cusip)
    {
        this.cusip = cusip;
    }

    public String getOdf1()
    {
        return odf1;
    }

    public void setOdf1(String odf1)
    {
        this.odf1 = odf1;
    }

    public String getOdf2()
    {
        return odf2;
    }

    public void setOdf2(String odf2)
    {
        this.odf2 = odf2;
    }

    public String getMpls_device_name()
    {
        return mpls_device_name;
    }

    public void setMpls_device_name(String mpls_device_name)
    {
        this.mpls_device_name = mpls_device_name;
    }

    public String getMpls_pe_ip()
    {
        return mpls_pe_ip;
    }

    public void setMpls_pe_ip(String mpls_pe_ip)
    {
        this.mpls_pe_ip = mpls_pe_ip;
    }

    public String getMpls_pe_port_desc()
    {
        return mpls_pe_port_desc;
    }

    public void setMpls_pe_port_desc(String mpls_pe_port_desc)
    {
        this.mpls_pe_port_desc = mpls_pe_port_desc;
    }

    public String getMpls_city_id()
    {
        return mpls_city_id;
    }

    public void setMpls_city_id(String mpls_city_id)
    {
        this.mpls_city_id = mpls_city_id;
    }

    public String getMpls_arp_ip()
    {
        return mpls_arp_ip;
    }

    public void setMpls_arp_ip(String mpls_arp_ip)
    {
        this.mpls_arp_ip = mpls_arp_ip;
    }

    public String getMpls_vrfname()
    {
        return mpls_vrfname;
    }

    public void setMpls_vrfname(String mpls_vrfname)
    {
        this.mpls_vrfname = mpls_vrfname;
    }

    public String getMpls_rd()
    {
        return mpls_rd;
    }

    public void setMpls_rd(String mpls_rd)
    {
        this.mpls_rd = mpls_rd;
    }

    public String getMpls_import_rt()
    {
        return mpls_import_rt;
    }

    public void setMpls_import_rt(String mpls_import_rt)
    {
        this.mpls_import_rt = mpls_import_rt;
    }

    public String getMpls_pe_port()
    {
        return mpls_pe_port;
    }

    public void setMpls_pe_port(String mpls_pe_port)
    {
        this.mpls_pe_port = mpls_pe_port;
    }

    public String getMpls_physicalport()
    {
        return mpls_physicalport;
    }

    public void setMpls_physicalport(String mpls_physicalport)
    {
        this.mpls_physicalport = mpls_physicalport;
    }

    public String getMpls_export_rt()
    {
        return mpls_export_rt;
    }

    public void setMpls_export_rt(String mpls_export_rt)
    {
        this.mpls_export_rt = mpls_export_rt;
    }

    public String getMpls_svlan()
    {
        return mpls_svlan;
    }

    public void setMpls_svlan(String mpls_svlan)
    {
        this.mpls_svlan = mpls_svlan;
    }

    public String getMpls_cvlan()
    {
        return mpls_cvlan;
    }

    public void setMpls_cvlan(String mpls_cvlan)
    {
        this.mpls_cvlan = mpls_cvlan;
    }

    public String getMpls_ceipnet()
    {
        return mpls_ceipnet;
    }

    public void setMpls_ceipnet(String mpls_ceipnet)
    {
        this.mpls_ceipnet = mpls_ceipnet;
    }

    public String getMpls_fir_switch_ip()
    {
        return mpls_fir_switch_ip;
    }

    public void setMpls_fir_switch_ip(String mpls_fir_switch_ip)
    {
        this.mpls_fir_switch_ip = mpls_fir_switch_ip;
    }

    public String getMpls_fir_switch_up_port()
    {
        return mpls_fir_switch_up_port;
    }

    public void setMpls_fir_switch_up_port(String mpls_fir_switch_up_port)
    {
        this.mpls_fir_switch_up_port = mpls_fir_switch_up_port;
    }

    public String getMpls_fir_switch_down_port()
    {
        return mpls_fir_switch_down_port;
    }

    public void setMpls_fir_switch_down_port(String mpls_fir_switch_down_port)
    {
        this.mpls_fir_switch_down_port = mpls_fir_switch_down_port;
    }

    public String getMpls_sec_switch_ip()
    {
        return mpls_sec_switch_ip;
    }

    public void setMpls_sec_switch_ip(String mpls_sec_switch_ip)
    {
        this.mpls_sec_switch_ip = mpls_sec_switch_ip;
    }

    public String getMpls_sec_switch_up_port()
    {
        return mpls_sec_switch_up_port;
    }

    public void setMpls_sec_switch_up_port(String mpls_sec_switch_up_port)
    {
        this.mpls_sec_switch_up_port = mpls_sec_switch_up_port;
    }

    public String getMpls_sec_switch_down_port()
    {
        return mpls_sec_switch_down_port;
    }

    public void setMpls_sec_switch_down_port(String mpls_sec_switch_down_port)
    {
        this.mpls_sec_switch_down_port = mpls_sec_switch_down_port;
    }

    public String getMpls_access_ip()
    {
        return mpls_access_ip;
    }

    public void setMpls_access_ip(String mpls_access_ip)
    {
        this.mpls_access_ip = mpls_access_ip;
    }

    public String getMpls_access_name()
    {
        return mpls_access_name;
    }

    public void setMpls_access_name(String mpls_access_name)
    {
        this.mpls_access_name = mpls_access_name;
    }

    public String getMpls_access_up_port()
    {
        return mpls_access_up_port;
    }

    public void setMpls_access_up_port(String mpls_access_up_port)
    {
        this.mpls_access_up_port = mpls_access_up_port;
    }

    public String getMpls_access_down_port()
    {
        return mpls_access_down_port;
    }

    public void setMpls_access_down_port(String mpls_access_down_port)
    {
        this.mpls_access_down_port = mpls_access_down_port;
    }

    public String getMpls_fir_switch_name()
    {
        return mpls_fir_switch_name;
    }

    public void setMpls_fir_switch_name(String mpls_fir_switch_name)
    {
        this.mpls_fir_switch_name = mpls_fir_switch_name;
    }

    public String getMpls_sec_switch_name()
    {
        return mpls_sec_switch_name;
    }

    public void setMpls_sec_switch_name(String mpls_sec_switch_name)
    {
        this.mpls_sec_switch_name = mpls_sec_switch_name;
    }

    @Override
    public String toString()
    {
        return "SpecialDetailPO:"+JSON.toJSONString(this);
    }
}
