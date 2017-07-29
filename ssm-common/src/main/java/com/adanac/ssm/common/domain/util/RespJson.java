package com.adanac.ssm.common.domain.util;

import com.adanac.ssm.common.domain.constant.StringConstants;
import com.adanac.ssm.common.domain.dto.BaseResDto;
import com.adanac.ssm.common.domain.enums.ResultStateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-02-25
 * Desc:    普通响应
 */
public class RespJson implements Serializable {

	private static final Logger logger = LoggerFactory.getLogger(RespJson.class);
	
    /**
     * 响应代码
     */
    protected String resultCode;

    /**
     * 错误消息
     */
    protected String resultMsg;

    /**
     * 响应的数据域
     */
    protected Object data;

    /**
     * 构建成功响应
     */
    public static RespJson buildSuccessResponse() {
        return buildSuccessResponse(null);
    }

    /**
     * 构建成功响应
     *
     * @param data 返回的数据对象 (JSon数组 或 Json对象)
     */
    public static RespJson buildSuccessResponse(Object data) {
        RespJson respJson = new RespJson();
        respJson.setResultCode(String.valueOf(ResultStateEnum.SUCCESS.getCode()));
        respJson.setResultMsg(ResultStateEnum.SUCCESS.getDesc());
        respJson.setData(data);
        return respJson;
    }

    /**
     * 构建失败响应
     *
     * @param resultCode 响应代码
     * @param errorMsg   返回给前端的错误信息
     */
    public static RespJson buildFailureResponse(String resultCode, String errorMsg) {
        RespJson respJson = new RespJson();
        respJson.setResultCode(StringUtils.isEmpty(resultCode) ? String.valueOf(ResultStateEnum.FAIL.getCode()) : resultCode);
        respJson.setResultMsg(errorMsg);
        respJson.setData(null);
        return respJson;
    }

    /**
     * 构建失败响应
     *
     * @param errorMsg 返回给前端的错误信息
     */
    public static RespJson buildFailureResponse(String errorMsg) {
        return buildFailureResponse(null, errorMsg);
    }

    /**
     * 从 BaseResDto 的子类构建返回的 Json
     *
     * @param resDto 业务逻辑返回的响应Dto
     * @return 根据响应Dto构建的返回 Json
     */
    public static RespJson buildResponseFromResDto(BaseResDto resDto) {
        RespJson respJson = new RespJson();
        if (resDto != null) {
            boolean isSuccess = (ResultStateEnum.SUCCESS.getCode().equalsIgnoreCase(resDto.getResultCode()) ||
                ResultStateEnum.INCOMPLETE_PARAM.getCode().equalsIgnoreCase(resDto.getResultCode()));
            boolean hasErrorMsg = StringUtils.isNotEmpty(resDto.getResultMsg());

            respJson.setResultCode(isSuccess ? resDto.getResultCode() : ResultStateEnum.FAIL.getCode());
            respJson.setResultMsg(hasErrorMsg ? resDto.getResultMsg() : StringConstants.EMPTY_STRING);
            respJson.setData(isSuccess ? resDto : null);
        }
//        logger.info("buildResponseFromResDto响应:"+ JSON.toJSONString(respJson));
        return respJson;
    }

    /**
     * 获得 resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置 resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 获得 resultMsg
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * 设置 resultMsg
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    /**
     * 获得 data
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置 data
     */
    public void setData(Object data) {
        this.data = data;
    }
}