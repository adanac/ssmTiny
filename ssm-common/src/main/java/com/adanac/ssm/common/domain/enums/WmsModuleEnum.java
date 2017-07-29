package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-03-25
 * Desc:    WMS模块
 */
public enum WmsModuleEnum {

    API(1, "wms-rpc"),
    ADMIN(2, "wms-web"),
    ORDER_DOWN(3, "wms-orderdown"),
    INTERFACE(4, "wms-interface"),
    SCHEDULE(5, "wms-schedule");

    /**
     * 状态编码
     */
    private Integer code;

    /**
     * 状态名称
     */
    private String name;

    /**
     * 构造函数
     */
    WmsModuleEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 获得 code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置 code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获得 name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 通过code获取枚举
     *
     * @param code
     */
    public static WmsModuleEnum getByCode(Integer code) {
        for (WmsModuleEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
