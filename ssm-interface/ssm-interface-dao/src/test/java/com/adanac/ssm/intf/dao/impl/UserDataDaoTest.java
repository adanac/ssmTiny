package com.adanac.ssm.intf.dao.impl;

import com.adanac.ssm.intf.common.domain.bean.UserData;
import com.adanac.ssm.intf.dao.UserDataDao;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDataDaoTest {

    private static final Logger logger = LoggerFactory.getLogger(UserDataDaoTest.class);

    @Autowired
    private UserDataDao userDataDao;

    @Test
    public void test_selectAllUserData() throws Exception {
        List<UserData> userDataList = userDataDao.selectAllUserData();
        logger.info(JSON.toJSONString(userDataList));
    }

    @Test
    public void test_saveUserData() throws Exception {
        UserData record = new UserData();
        record.setUsername("余以松");
        record.setAddress("吉林省 延边朝鲜族自治州 敦化市");
        record.setAge(38);
        record.setSex(false);
        record.setCardid("222403197808225487");

        int tag = userDataDao.insert(record);
        logger.info(JSON.toJSONString(tag));
    }
}