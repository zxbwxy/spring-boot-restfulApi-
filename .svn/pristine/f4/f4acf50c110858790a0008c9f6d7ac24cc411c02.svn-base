package com.ailk.devinfo.test;

import com.ailk.devinfo.domain.DevInfoPO;
import com.ailk.devinfo.serv.DevInfoServ;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuxb3(74637)
 * @version 1.0
 * @category com.ailk.devinfo.test
 * @copyright Ailk NBS-Network Mgt. RD Dept.
 * @since 2017/3/30 17:04
 */
//@Component
public class TestCommandLineRunner implements CommandLineRunner
{
    public static final Logger logger =Logger.getLogger(TestCommandLineRunner.class);
    @Autowired
    private DevInfoServ devInfoServ;

    @Override
    public void run(String... strings) throws Exception
    {
        logger.info( "========================TestCommandLineRunner==================");
        logger.info( "devInfoServ:"+devInfoServ);
        List<DevInfoPO> lst=new ArrayList<DevInfoPO>();
        DevInfoPO po1=new DevInfoPO("59.51.182.94","华为","3352");
        lst.add(po1);
         po1=new DevInfoPO("10.245.24.33","ZTE","F820");
        lst.add(po1);
        po1=new DevInfoPO("10.245.32.81","ZTE","F820");
        lst.add(po1);

        logger.info( JSON.toJSONString(devInfoServ.selectDevInfo(lst)));

    }
}
