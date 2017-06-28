package com.ailk.devinfo.test;

import com.linkage.system.utils.DateTimeUtil;

/**
 * @author zhuxb
 * @create 2017-05-09 20:17
 */
public class TT
{
    public static void main(String[] args)
    {
        DateTimeUtil dt = new DateTimeUtil("2017-04-30");
        String startTime = dt.getFirstDayOfWeek("CN")+" 00:00:00";
        String endTime = dt.getLastDayOfWeek("CN")+" 23:59:59";
        System.out.println(startTime+"   "+endTime);
    }

}
