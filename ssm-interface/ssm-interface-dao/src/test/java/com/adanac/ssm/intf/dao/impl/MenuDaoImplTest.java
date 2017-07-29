package com.adanac.ssm.intf.dao.impl;

import com.adanac.ssm.intf.common.domain.bean.MenuBean;
import com.adanac.ssm.intf.dao.MenuDao;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Feagle on 2017/7/30.
 */
@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuDaoImplTest {
    @Test
    public void listMenuGroups() throws Exception {
        List<MenuBean> menuBeans = menuDao.listMenuGroups();
        logger.info("menuBeans is {}", JSON.toJSONString(menuBeans));
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void listMenuByGroupId() throws Exception {
        List<MenuBean> menuBeans = menuDao.listMenuByGroupId(1);
        logger.info("menuBeans is {}", JSON.toJSONString(menuBeans));
    }

    @Autowired
    MenuDao menuDao;
    @Test
    public void insert() throws Exception {
        MenuBean menuBean = new MenuBean();
        menuBean.setId(102L);
        menuBean.setGroupId(1);
        menuBean.setMenuName("insert for test2");
        menuBean.setMenuType(2);
        menuBean.setSort(8);
        int insert = menuDao.insert(menuBean);
        System.out.println(insert);
    }

    @Test
    public void insertSelective() throws Exception {
    }


}