package com.adanac.ssm.common.domain.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-12-08
 * Desc:    邮件实体 (标题/正文/接收人)
 */
public class EmailEntity implements Serializable {

	/**
	 * 邮件标题
	 */
	private String mailSubject;

	/**
	 * 邮件正文
	 */
	private String mailBody;

	/**
	 * 邮件接收人
	 */
	private List<String> receivers;

	/**
	 * 邮件抄送人
	 */
	private List<String> ccReceivers;

	/**
	 * 邮件密送人
	 */
	private List<String> bccReceivers;

	/**
	 * 获得 mailSubject
	 */
	public String getMailSubject() {
		return mailSubject;
	}

	/**
	 * 设置 mailSubject
	 */
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	/**
	 * 获得 mailBody
	 */
	public String getMailBody() {
		return mailBody;
	}

	/**
	 * 设置 mailBody
	 */
	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

	/**
	 * 获得 receivers
	 */
	public List<String> getReceivers() {
		return receivers;
	}

	/**
	 * 设置 receivers
	 */
	public void setReceivers(List<String> receivers) {
		this.receivers = receivers;
	}

	/**
	 * 获得 ccReceivers
	 */
	public List<String> getCcReceivers() {
		return ccReceivers;
	}

	/**
	 * 设置 ccReceivers
	 */
	public void setCcReceivers(List<String> ccReceivers) {
		this.ccReceivers = ccReceivers;
	}

	/**
	 * 获得 bccReceivers
	 */
	public List<String> getBccReceivers() {
		return bccReceivers;
	}

	/**
	 * 设置 bccReceivers
	 */
	public void setBccReceivers(List<String> bccReceivers) {
		this.bccReceivers = bccReceivers;
	}

	@Override
	public String toString() {
		return "EmailEntity [mailSubject=" + mailSubject + ", mailBody=" + mailBody + ", receivers=" + receivers
				+ ", ccReceivers=" + ccReceivers + ", bccReceivers=" + bccReceivers + "]";
	}

}
