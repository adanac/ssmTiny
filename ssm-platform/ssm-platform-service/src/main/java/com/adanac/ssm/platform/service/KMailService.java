package com.adanac.ssm.platform.service;

import com.adanac.ssm.common.domain.bean.EmailEntity;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-12-08
 */
public interface KMailService {

	/**
	 * 发送邮件
	 *
	 * @param mail 邮件对象
	 */
	void sendMail(EmailEntity mail);
}
