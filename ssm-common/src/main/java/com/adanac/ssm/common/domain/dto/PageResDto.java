package com.adanac.ssm.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-03-16
 * Desc:    带分页的响应对象
 */
public class PageResDto extends BaseResDto {

	/**
	 * JQuery DataTable 对象后端分页需要带的参数，代表请求编号
	 */
	private long draw;

	/**
	 * 响应返回的记录总数
	 */
	private long recordsTotal;

	/**
	 * 本次返回的记录数
	 */
	private long recordsFiltered;

	/**
	 * 无参构造函数
	 */
	public PageResDto() {
	}

	/**
	 * 全参构造函数
	 *
	 * @param resultCode 返回状态码
	 * @param msg        错误消息
	 */
	public PageResDto(String resultCode, String msg) {
		super(resultCode, msg);
	}

	/**
	 * 全参构造函数
	 *
	 * @param resultCode 返回状态码
	 * @param msg        错误消息
	 */
	public PageResDto(String resultCode, String msg, long draw, long recordsTotal, long recordsFiltered) {
		super(resultCode, msg);
		this.draw = draw;
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
	}

	/**
	 * 获得 draw
	 */
	@JsonIgnore
	public long getDraw() {
		return draw;
	}

	/**
	 * 设置 draw
	 */
	public void setDraw(long draw) {
		this.draw = draw;
	}

	/**
	 * 获得 recordsTotal
	 */
	@JsonIgnore
	public long getRecordsTotal() {
		return recordsTotal;
	}

	/**
	 * 设置 recordsTotal
	 */
	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	/**
	 * 获得 recordsFiltered
	 */
	@JsonIgnore
	public long getRecordsFiltered() {
		return recordsFiltered;
	}

	/**
	 * 设置 recordsFiltered
	 */
	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
}
