package com.adanac.ssm.service;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-12-12
 */
public interface MailNotifyService {

    /**
     * 发送通知邮件
     *
     * @param title   邮件标题
     * @param content 邮件正文
     */
    void sendMail(String title, String content);
}
