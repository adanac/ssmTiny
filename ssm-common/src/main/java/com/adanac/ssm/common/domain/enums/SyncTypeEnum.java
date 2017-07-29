package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-06-14
 * Desc:    同步类型
 */
public enum SyncTypeEnum {

    SKU(1, "商品"),
    WH(2, "仓库"),
    SHOP(3, "门店"),
    HUB(4, "分站"),
    ADDRESS(5, "四级地址"),
    VENDOR(6, "供应商"),
    CARRIER(7, "承运商"),
	CARRIER_SYNC_EXPRESS_ACCOUNT(8, "承运商同步计费系统"),
	WH_SYNC_EXPRESS_ACCOUNT(9, "仓库同步计费系统"),
	ADDRESS_SYNC_EXPRESS_ACCOUNT(10, "四级地址同步计费系统"),;

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
    SyncTypeEnum(Integer code, String name) {
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
}
