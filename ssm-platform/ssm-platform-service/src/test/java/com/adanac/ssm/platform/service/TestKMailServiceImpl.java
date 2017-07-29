package com.adanac.ssm.platform.service;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adanac.ssm.common.domain.bean.EmailEntity;
import com.adanac.ssm.common.domain.constant.StringConstants;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-12-08
 * Desc:    KMailService 的单元测试
 */
@ContextConfiguration(locations = { "classpath:/config/test-spring-platform-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestKMailServiceImpl {

	private static final Logger logger = LoggerFactory.getLogger(TestKMailServiceImpl.class);

	@Autowired
	private KMailService kMailService;

	@Test
	public void testSendMail() throws Exception {
		EmailEntity mail = new EmailEntity();
		mail.setMailSubject("测试标题");
		mail.setMailBody("<font style='color:red;'>天气不错哦</font>");
		mail.setReceivers(
				Arrays.asList("ming.kong@haiziwang.com,chao.zhai@haiziwang.com".split(StringConstants.COMMA)));
		kMailService.sendMail(mail);
	}
}
