package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-05-31
 * Desc:    入库类型
 */
public enum ReceiptTypeEnum {

    SALE(1, "采购入库"),
    TRANSFER(2, "调拨入库"),
    REJECT_OFFLINE(3, "退货入库(线下)"),
    REJECT_ONLINE(4, "退货入库(线上)");

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
    ReceiptTypeEnum(Integer code, String name) {
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
    public static ReceiptTypeEnum getByCode(Integer code) {
        for (ReceiptTypeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
