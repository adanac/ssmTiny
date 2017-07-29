package com.adanac.ssm.common.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-02-25
 * Desc:    所有后台管理页面查询请求的基类
 */
public class PageReqDto extends BaseReqDto {

	/**
	 * 请求ID （Datatable 后端分页功能需要该参数）
	 */
	private Integer draw;

	/**
	 * 待查询的开始索引 （例如：每页10条记录，查询第3页的时候，开始索引为 30）
	 * 该参数用于SQL查询语句 limit a, b 的 a 部分
	 */
	private Integer start;

	/**
	 * 返回记录条数
	 * 该参数用于SQL查询语句 limit a, b 的 b 部分
	 */
	private Integer rows;

	/**
	 * 无参构造函数
	 */
	public PageReqDto() {
	}

	/**
	 * 构造函数
	 *
	 * @param reqId 请求ID
	 * @param start 待查询的开始索引
	 * @param rows  返回记录条数
	 */
	public PageReqDto(Integer reqId, Integer start, Integer rows) {
		this.draw = reqId;
		this.start = start;
		this.rows = rows;
	}

	/**
	 * 获得 draw
	 */
	@JsonIgnore
	public Integer getDraw() {
		return draw;
	}

	/**
	 * 设置 draw
	 */
	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	/**
	 * 获得 start
	 */
	@JsonIgnore
	public Integer getStart() {
		return start;
	}

	/**
	 * 设置 start
	 */
	public void setStart(Integer start) {
		this.start = start;
	}

	/**
	 * 获得 rows
	 */
	@JsonIgnore
	public Integer getRows() {
		return rows;
	}

	/**
	 * 设置 rows
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}
}
