package com.adanac.ssm.platform.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.adanac.ssm.common.domain.bean.EmailEntity;
import com.adanac.ssm.platform.service.KMailService;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-12-08
 * Desc:    邮件发送服务
 */
@Service("kMailService")
public class KMailServiceImpl implements KMailService {

	private static final Logger logger = LoggerFactory.getLogger(KMailServiceImpl.class);

	@Value("${sender.account}")
	private String SENDER_ACCOUNT;

	@Value("${sender.password}")
	private String SENDER_PASSWORD;

	/**
	 * 发送邮件
	 *
	 * @param mail 邮件对象
	 */
	public void sendMail(EmailEntity mail) {
		System.out.println("发送邮件成功:[" + SENDER_ACCOUNT + "]" + "[" + SENDER_PASSWORD + "]----" + mail.toString());
		// logger.info(JSON
		// .toJSONString("发送邮件成功:[" + SENDER_ACCOUNT + "]" + "[" +
		// SENDER_PASSWORD + "]----" + mail.toString()));
	}
}
