package com.adanac.ssm.service.impl;

import com.adanac.ssm.service.MailNotifyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:/config/test-spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMailNotifyServiceImpl {

	private static final Logger logger = LoggerFactory.getLogger(TestMailNotifyServiceImpl.class);

	@Autowired
	private MailNotifyService mailNotifyService;

	@Test
	public void test_sendMail() {
		String title = "测试title";
		String content = "测试content";
		mailNotifyService.sendMail(title, content);
	}

}
