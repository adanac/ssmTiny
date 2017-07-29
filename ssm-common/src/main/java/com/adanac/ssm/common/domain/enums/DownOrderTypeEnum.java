package com.adanac.ssm.common.domain.enums;

import com.adanac.ssm.common.domain.constant.WmsConstants;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-03-25
 * Desc:    下发订单类型
 */
public enum DownOrderTypeEnum {

    OBD_SALE(1, "线上销售出库", WmsConstants.OMS),
    OBD_SHOP(2, "门店配送出库", WmsConstants.ERP),
    OBD_TRANSFER(3, "调拨出库", WmsConstants.ERP),
    OBD_BACK(4, "退供应商出库", WmsConstants.ERP),
    IBD_PURCHASE(5, "采购入库", WmsConstants.ERP),
    IBD_TRANSFER(6, "调拨入库", WmsConstants.ERP),
    IBD_BACK_OFFLINE(7, "退货入库(线下)", WmsConstants.ERP),
    IBD_BACK_ONLINE(8, "退货入库(线上)", WmsConstants.OMS);

    /**
     * 状态编码
     */
    private Integer code;

    /**
     * 状态名称
     */
    private String name;

    /**
     * 来源
     */
    private String origin;

    /**
     * 构造函数
     */
    DownOrderTypeEnum(Integer code, String name, String origin) {
        this.code = code;
        this.name = name;
        this.origin = origin;
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
     * 获得 origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 设置 origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }


    /**
     * 通过code获取枚举
     * @param code
     */
    public static DownOrderTypeEnum getByCode(Integer code) {
        for(DownOrderTypeEnum status : values()) {
            if(status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
