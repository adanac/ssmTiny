package com.adanac.ssm.common.domain.bean;

import java.io.Serializable;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-04-29
 * Desc:    用于将枚举转JSONArray
 */
public class EnumBean implements Serializable {

	/**
	 * 键
	 */
	private String key;

	/**
	 * 值
	 */
	private String value;

	/**
	 * 获得 key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 设置 key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 获得 value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 设置 value
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
