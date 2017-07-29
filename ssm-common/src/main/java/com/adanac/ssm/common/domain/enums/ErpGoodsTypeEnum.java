package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-03-25
 * Desc:    ERP 的商品类型
 */
public enum ErpGoodsTypeEnum {

    NORMAL("1", "普通商品"),
    GIFT("2", "赠品"),;

    /**
     * 状态编码
     */
    private String code;

    /**
     * 状态名称
     */
    private String name;

    /**
     * 构造函数
     */
    ErpGoodsTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 获得 code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置 code
     */
    public void setCode(String code) {
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
}
