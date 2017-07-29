package com.adanac.ssm.service.impl;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.adanac.ssm.common.domain.bean.EmailEntity;
import com.adanac.ssm.common.domain.constant.StringConstants;
import com.adanac.ssm.common.domain.util.StringUtils;
import com.adanac.ssm.platform.service.KMailService;
import com.adanac.ssm.service.MailNotifyService;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-12-12
 */
@Service("mailNotifyService")
public class MailNotifyServiceImpl implements MailNotifyService {

	private static final Logger logger = LoggerFactory.getLogger(MailNotifyServiceImpl.class);
	private static final String ALERT_MAIL_RECEIVER = "alert_mail_receiver";

	@Autowired
	private KMailService kMailService;

	@Value("${sender.account}")
	private String SENDER_ACCOUNT;

	/**
	 * 发送通知邮件
	 *
	 * @param title   邮件标题
	 * @param content 邮件正文
	 */
	@Override
	public void sendMail(String title, String content) {
		String mailList = null;
		try {
			mailList = ALERT_MAIL_RECEIVER;
			if (StringUtils.isEmpty(mailList))
				mailList = SENDER_ACCOUNT;

		} catch (Exception e) {
			logger.error(e.getMessage());
			mailList = SENDER_ACCOUNT;
		}
		EmailEntity mail = new EmailEntity();
		mail.setMailSubject(title);
		mail.setMailBody(content);
		mail.setReceivers(Arrays.asList(mailList.split(StringConstants.COMMA)));
		kMailService.sendMail(mail);
	}
}
