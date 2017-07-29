package com.adanac.ssm.common.domain.util;

import com.adanac.ssm.common.domain.constant.StringConstants;
import com.adanac.ssm.common.domain.dto.PageResDto;
import com.adanac.ssm.common.domain.enums.ResultStateEnum;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-02-25
 * Desc:    分页查询的响应
 */
public class PageRespJson extends RespJson {

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
     * 构建成功响应
     *
     * @param data         返回的数据对象 (JSon数组 或 Json对象)
     * @param reqId        JQuery DataTable 对象后端分页需要带的参数，代表请求编号
     * @param totalRecords 符合条件的记录总数
     */
    public static PageRespJson buildSuccessResponse(Object data, long reqId, long totalRecords) {
        PageRespJson pageRespJson = new PageRespJson();
        pageRespJson.setResultCode(String.valueOf(ResultStateEnum.SUCCESS.getCode()));
        pageRespJson.setResultMsg("");
        pageRespJson.setData(data == null ? ResultStateEnum.SUCCESS.getDesc() : data);
        pageRespJson.setDraw(reqId);
        pageRespJson.setRecordsTotal(totalRecords);
        pageRespJson.setRecordsFiltered(totalRecords);
        return pageRespJson;
    }

    /**
     * 构建失败响应
     *
     * @param resultCode 响应代码
     * @param errorMsg   返回给前端的错误信息
     * @param reqId      JQuery DataTable 对象后端分页需要带的参数，代表请求编号
     */
    public static PageRespJson buildFailureResponse(String resultCode, String errorMsg, long reqId) {
        PageRespJson pageRespJson = new PageRespJson();
        pageRespJson.setResultCode(StringUtils.isEmpty(resultCode) ? String.valueOf(ResultStateEnum.FAIL.getCode()) : resultCode);
        pageRespJson.setResultMsg(StringUtils.getValidString(errorMsg));
        pageRespJson.setData("");
        pageRespJson.setDraw(reqId);
        pageRespJson.setRecordsTotal(0L);
        pageRespJson.setRecordsFiltered(0L);
        return pageRespJson;
    }

    /**
     * 构建失败响应
     *
     * @param errorMsg 返回给前端的错误信息
     * @param reqId    JQuery DataTable 对象后端分页需要带的参数，代表请求编号
     */
    public static PageRespJson buildFailureResponse(String errorMsg, long reqId) {
        return buildFailureResponse(null, errorMsg, reqId);
    }

    /**
     * 根据 PageResDto 构建返回的Json对象
     *
     * @param pageResDto 响应Dto
     * @return 构建的Json对象
     */
    public static PageRespJson buildResponseFromPageResDto(PageResDto pageResDto) {
        PageRespJson pageRespJson = new PageRespJson();
        if (pageResDto != null) {
            boolean isSuccess = String.valueOf(ResultStateEnum.SUCCESS.getCode()).equals(pageResDto.getResultCode());
            boolean hasErrorMsg = StringUtils.isNotEmpty(pageResDto.getResultMsg());

            pageRespJson.setResultCode(isSuccess ? String.valueOf(ResultStateEnum.SUCCESS.getCode()) :
                    StringUtils.getValidString(pageResDto.getResultCode()));
            pageRespJson.setResultMsg(hasErrorMsg ? pageResDto.getResultMsg() : StringConstants.EMPTY_STRING);
            pageRespJson.setData(isSuccess ? pageResDto : StringConstants.EMPTY_STRING);
            pageRespJson.setDraw(isSuccess ? pageResDto.getDraw() : -1);
            pageRespJson.setRecordsTotal(isSuccess ? pageResDto.getRecordsTotal() : 0);
            pageRespJson.setRecordsFiltered(isSuccess ? pageResDto.getRecordsFiltered() : 0);
        }
        return pageRespJson;
    }

    /**
     * 获得 draw
     */
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