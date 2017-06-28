package com.ailk.devinfo.web;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuxb
 * @create 2017-05-03 11:23
 */
public class Test
{
    public static void main(String[] args)
    {
        Map m=new HashMap();
        m.put("1","1");
        System.out.println(m);
        m.clear();
        System.out.println(m);
        m.put("2","1");
        System.out.println(m);
    }
}
