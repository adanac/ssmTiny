package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-05-03
 * Desc:    出库业务类型
 */
public enum WaveTypeEnum {

    SALE(1, "线上销售"),
    SHOP(2, "门店配送"),
    TRANSFER(3, "调拨出库"),
    BACK_TO_SUPPLIER(4, "退厂出库"),
    BACK_TO_WH(5, "门店发大仓"),;

    private final Integer code;
    private final String desc;

    WaveTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 通过code获取枚举
     *
     * @param code
     */
    public static WaveTypeEnum getByCode(Integer code) {
        for (WaveTypeEnum status : values()) {
            if (status.getCode().intValue() == code)
                return status;
        }
        return null;
    }
}
