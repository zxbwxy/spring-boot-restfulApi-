package com.ailk.devinfo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ResTool中的部分属地得到子属地方法
 *
 * @author zhuxb
 * @create 2017-05-09 19:28
 */
public class CityUtils
{
    /**
     * 获取指定的子属地编号列表
     *
     * @param city_id
     *            属地的id
     * @param deepth
     *            向下获取几层,-1为当前属地的所有子属地
     * @param incn
     *            结果集合是否包含当前传入的city属地 true 为包含， false为不包含
     * @return 属地列表 Map内部字段<city_id,city_name,parent_id,staff_id,remark>
     */
    public static List<String> getSubCityIdList (List<Map<String,String>> allCityList,String city_id , int deepth ,
                                                 boolean incn )
    {
        List<Map<String,String>> alllist = allCityList;    //获取所有的属地
        List<String> reslist = new ArrayList<String>();
        if (incn)
        {
            reslist.add(city_id);
        }
        filterCityId(alllist, reslist, 1, deepth, city_id);// 过滤子属地,从第一层开始
        return reslist;
    }




    // 过滤子属地的内部方法
    private static void filterCityId ( List<Map<String,String>> allList , List<String> resList ,
                                       int curlevel , int deepth , String parent_id )
    {
        if ((curlevel > deepth) && (deepth != -1))
        {
            return;
        }
        for (Map c : allList)
        {
            String pid = String.valueOf(c.get("parent_id"));
            String cid = String.valueOf(c.get("city_id"));
            if (pid.equals(parent_id))
            {
                resList.add(cid);
                filterCityId(allList, resList, curlevel + 1, deepth, cid);
            }
        }
    }

    /**
     * list-->string "","",""
     * @param list
     * @return
     */
    public static String weave(List list) {
        StringBuffer sb = new StringBuffer(100);
        if(list.size() != 0) {
            sb.append("'").append(list.get(0)).append("'");

            for(int i = 1; i < list.size(); ++i) {
                sb.append(",'").append(list.get(i)).append("'");
            }
        }

        return sb.toString();
    }
}
