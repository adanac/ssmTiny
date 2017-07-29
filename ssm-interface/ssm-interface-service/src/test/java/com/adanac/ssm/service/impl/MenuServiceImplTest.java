package com.adanac.ssm.service.impl;

import com.adanac.ssm.service.MenuService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Feagle on 2017/7/30.
 */
@ContextConfiguration(locations = { "classpath:/config/test-spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuServiceImplTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    MenuService menuService;

    @Test
    public void listMenu() throws Exception {
        JSONObject jsonObject =
                menuService.listMenu();
        logger.info("jsonObject is {}", JSON.toJSONString(jsonObject));
    }

}