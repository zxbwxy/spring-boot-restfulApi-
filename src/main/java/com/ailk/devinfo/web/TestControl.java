package com.ailk.devinfo.web;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @author zhuxb
 * @create 2017-06-19 16:38
 */
public class TestControl
{
    public static void main(String[] args)
    {
        int[] ints=new int[]{1,2,3,4,5,6};
        System.out.println(JSON.toJSONString(Arrays.copyOf(ints, 9)));
    }
}
