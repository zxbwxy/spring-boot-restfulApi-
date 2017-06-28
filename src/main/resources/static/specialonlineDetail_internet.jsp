<%@ page language="java" contentType="text/html; charset=GBK"
         pageEncoding="GBK" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="lk" uri="/linkage" %>
<%--
	/**
	 * 专线设备详细信息画面
	 *
	 * @author zhuxb3(74637)
	 * @version 1.0
	 * @since 2017-02-07  10:54:37
	 * 
	 */
 --%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <title>专线设备详细信息画面</title>
    <lk:res addRes="/Js/jQeuryCheckForm-linkage.js"/>
    <style type="text/css">
    </style>
    <script type="text/javascript">
        var column = "custome_name#city_name#custome_leve#vrfname#bars_sr_pe_ip#rd#import_rt#bars_sr_pe_port#export_rt#bars_sr_pe_physicalport#svlan#cusipnet#cvlan#custome_speed#open_acc_addr#open_acc_time#cus_manager#cus_manager_phone#open_acc_name#open_acc_phone#access_ip#access_port#cusip".split("#");
        var commonColumn = "cus_manager#open_acc_name".split("#");
        var regStr = /^[\w\:\.\/]*\([\w\:\.\/]*\)$/;
        var reg = new RegExp(regStr);
        $(function () {
            $("input").attr("readonly", true);

            var colObj;
            var tempValue;
            for (var col in column) {
                colObj = $("input[name='" + column[col] + "']");
                colObj.attr("readonly", false);
                colObj.focus(function () {
                    tempValue=  $(this).val()
                    $(this).val("");
                });
                colObj.blur(function () {
                    if($(this).val()=='')
                    $(this).val(tempValue);
                });
            }

        })
        function updCusInfo() {

            //splitNamePhone();
            var baseUrl = "<s:url value='/liposs/resource/specialonline/specialOnlineAction!'/>";
            $.ajax({
                type: "POST",
                url: baseUrl + "isExistInCustomInfo.action",
                data: {
                    "circuitno": $("input[name='circuitno']").val()
                },
                success: function (data) {
                    if (data == '0') {
                        if (confirm("用户信息表尚未录入，\n是否需要录入！")) {
                            doSubmit(baseUrl + "addCustomerInfo.action");
                        }

                    } else {
                        if (confirm("该数据在用户信息表中已存在，\n是否需要更新！")) {
                                doSubmit(baseUrl + "updCustomerInfo.action");

                        }
                    }
                },
                error: function (req, text, err) {
                    alert("获取数据失败");
                }
            });
        }

        function doSubmit(url){
            $.ajax({
                type: "POST",
                url: url,
                data:$("form").serialize(),
                success: function (data) {
                    alert(data);
                    window.close();
                },
                error: function (req, text, err) {
                    alert("获取数据失败");
                    window.close();
                }
            });



        }
    </script>
</head>
<body>
<form name="frm" action="" method="post">
    <table border=0 cellspacing=0 cellpadding=0 width="100%">
        <tr>
            <td>
                <table class="querytable" width="98%" align="center">
                    <tr>

                            <th colspan="4" class="title_1">互联网专线信息</th>
                    </tr>

                        <tr>f
                            <td class="title_2" width="15%">电路编号</td>
                            <td width="35%"><input name="circuitno" value="<s:property value="circuitno"/>"/></td>
                            <td class="title_2" width="15%">客户名称</td>
                            <td width="35%"><input name="custome_name" value="<s:property value="custome_name"/>"/></td>

                        </tr>
                        <tr>
                            <td class="title_2" width="15%">属地</td>
                            <td width="35%">
                                    <input name="city_name" value="<s:property value="city_name" />"/>
                            </td>
                            <td class="title_2" width="15%">客户等级</td>
                            <td width="35%"><input name="custome_leve" value="<s:property value="custome_leve"/>"/></td>
                        </tr>
                        <tr>
                            <td class="title_2" width="15%">BRAS/SR设备IP</td>
                            <td width="35%"><input name="mpls_pe_ip"
                                                   value="<s:property value="mpls_pe_ip"/>"/><input
                                    name="bars_sr_pe_ip" value="<s:property value="bars_sr_pe_ip" />"/></td>
                            <td class="title_2" width="15%">BRAS/SR设备名称</td>
                            <td width="35%"><s:property value="device_name"/></td>
                        </tr>
                        <tr>
                            <td class="title_2" width="15%">BRAS/SR子接口</td>
                            <td width="35%"><input name="mpls_pe_port"
                                                   value="<s:property value="mpls_pe_port" />"/><input
                                    name="bars_sr_pe_port"
                                    value="<s:property value="bars_sr_pe_port" />"/></td>
                            <td class="title_2" width="15%">svlan</td>
                            <td width="35%"><input name="mpls_svlan"
                                                   value="<s:property value="mpls_svlan" />"/><input
                                    name="svlan" value="<s:property value="svlan" />"/></td>
                        </tr>
                        <tr>
                            <td class="title_2" width="15%">BRAS/SR物理端口</td>
                            <td width="35%"><input name="mpls_physicalport"
                                                   value="<s:property value="mpls_physicalport" />"/><input
                                    name="bars_sr_pe_physicalport"
                                    value="<s:property value="bars_sr_pe_physicalport" />"/></td>
                            <td class="title_2" width="15%">cvlan</td>
                            <td width="35%"><input name="mpls_cvlan"
                                                   value="<s:property value="mpls_cvlan" />"/><input
                                    name="cvlan" value="<s:property value="cvlan" />"/></td>
                        </tr>
                        <tr>
                            <td class="title_2" width="15%">速率</td>
                            <td width="35%"><input name="custome_speed" value="<s:property
                                    value="custome_speed"/>"/></td>
                            <td class="title_2" width="15%">ARPIP</td>
                            <td width="35%"><input name="arp_ip"
                                                   value="<s:property value="arp_ip" />"/><input name="cusip"
                                                   value="<s:property value="cusip" />"/></td>
                        </tr>
                        <tr>
                            <td class="title_2" width="15%">客户经理</td>
                            <td width="35%"><input name="cus_manager"
                                                   value="<s:property value="cus_manager" />"/><input name="cus_manager_phone"
                                                                                                      value="<s:property value="cus_manager_phone" />"/>
                            </td>
                            <td class="title_2" width="15%">用户网关</td>
                            <td width="35%"><input name="mpls_ceipnet"
                                                   value="<s:property value="mpls_ceipnet" />"/><input
                                    name="cusipnet" value="<s:property value="cusipnet" />"/></td>
                        </tr>
                        <tr>
                            <td class="title_2" width="15%">联系人</td>
                            <td width="35%"><input name="open_acc_name"
                                                   value="<s:property value="open_acc_name" />"/><input name="open_acc_phone"
                                                                                                        value="<s:property value="open_acc_phone" />"/>
                            </td>
                            <td class="title_2" width="15%">开通时间</td>
                            <td width="35%">
                                <lk:date id="open_acc_time" name="open_acc_time" type="hour" width="160px"
                                         defaultDate="%{open_acc_time}"/></td>
                        </tr>
                        <tr>
                            <td class="title_2" width="15%">开通地址</td>
                            <td width="35%"><input name="open_acc_addr"
                                                   value="<s:property value="open_acc_addr" />"/></td>
                            <td class="title_2" width="15%"></td>
                            <td></td>
                        </tr>

                </table>
            </td>
        </tr>
        <tr>
            <td height="20">&nbsp;</td>
        </tr>

        <tr>
            <td>
                <table class="querytable" width="98%" align="center">
                    <tr>
                        <th colspan="4" class="title_1">汇聚设备信息</th>
                    </tr>
                    <s:if test="fir_switch_ip!=null && fir_switch_ip!=''">
                    <tr>
                        <td class="title_2" width="15%">一级汇聚设备名称</td>
                        <td width="35%"><s:property
                                value="fir_switch_name"/></td>
                        <td class="title_2" width="15%">一级汇聚设备IP</td>
                        <td width="35%"><s:property value="fir_switch_ip"/></td>

                    </tr>


                    <tr>
                        <td class="title_2" width="15%">一级汇聚设备上联端口</td>
                        <td width="35%"><s:property
                                value="fir_switch_down_port"/></td>
                        <td class="title_2" width="15%">一级汇聚设备下联端口</td>
                    </tr>
                    </s:if>
                    <s:if test="sec_switch_ip!=null && sec_switch_ip!=''">
                    <tr>
                        <td class="title_2" width="15%">二级汇聚设备名称</td>
                        <td width="35%"><s:property
                                value="sec_switch_name"/></td>
                        <td class="title_2" width="15%">二级汇聚设备IP</td>
                        <td width="35%"><s:property value="sec_switch_ip"/></td>

                    </tr>
                    <tr>
                        <td class="title_2" width="15%">二级汇聚设备上联端口</td>
                        <td width="35%"><s:property
                                value="sec_switch_up_port"/></td>
                        <td class="title_2" width="15%">二级汇聚设备下联端口</td>
                        <td width="35%"><s:property
                                value="sec_switch_down_port"/></td>
                    </tr>
                    </s:if>
                </table>
            </td>
        </tr>

        <tr>
            <td height="20">&nbsp;</td>
        </tr>

        <tr>
            <td>
                <table class="querytable" width="98%" align="center">
                    <tr>
                        <th colspan="4" class="title_1">接入设备信息</th>
                    </tr>

                    <tr>
                        <td class="title_2" width="15%">接入设备名称</td>
                        <td width="35%"><s:property value="mpls_access_name"/></td>
                        <td class="title_2" width="15%">接入设备IP</td>
                        <td width="35%"><input name="mpls_access_ip" value="<s:property value="mpls_access_ip"/>"><input name="access_ip" value="<s:property value="access_ip"/>"></td>

                    </tr>
                    <tr>
                        <td class="title_2" width="15%">接入设备上联口</td>
                        <td width="35%"><s:property value="mpls_access_up_port"/></td>
                        <td class="title_2" width="15%">接入设备端口</td>
                        <td width="35%"><input name="mpls_access_down_port" value="<s:property value="mpls_access_down_port"/>"><input name="access_port" value="<s:property value="access_port"/>"></td>

                    </tr>
                </table>

            </td>
        </tr>

        <tr>
            <td height="20">&nbsp;</td>
        </tr>

        <tr>
            <td>
                <table class="querytable" width="98%" align="center">
                    <tr>
                        <th colspan="4" class="title_1">ODF架信息1</th>
                    </tr>

                    <tr>
                        <td class="title_2" colspan="4">
                            <textarea rows="3" cols="4" name="odf1" style="margin: 0px; width: 800px; height: 59px;"><s:property value="odf1"/></textarea>
							</textarea>

                        </td>
                    </tr>
                </table>

            </td>
        </tr>
        <tr>
            <td height="20">&nbsp;</td>
        </tr>

        <tr>
            <td>
                <table class="querytable" width="98%" align="center">
                    <tr>
                        <th colspan="4" class="title_1">ODF架信息2</th>
                    </tr>

                    <tr>
                        <td class="title_2" colspan="4">
                            <textarea rows="3" cols="4" name="odf2" style="margin: 0px; width: 800px; height: 59px;"><s:property value="odf2"/></textarea>
							</textarea>
                            <%--<input name="odf1" type="textarea" value="<s:property value="odf1"/>"/>--%>
                        </td>
                    </tr>
                </table>

            </td>
        </tr>

        <tr>
            <td>
                <table class="querytable" width="98%" align="center">
                    <tr>
                        <td class="foot" colspan="4" style="text-align: right">
                            <button
                                    name="btn" type="button"
                                    onclick="updCusInfo();">保存
                            </button>
                        </td>
                    </tr>

                </table>

            </td>
        </tr>
    </table>


</form>
</body>
</html>