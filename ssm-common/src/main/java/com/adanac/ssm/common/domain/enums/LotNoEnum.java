package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Li GuangYang
 * Date:    2016-05-03
 * Desc:    批次枚举
 */
public enum LotNoEnum {

    DEFAULT(1, "20820210"),;

    private final Integer code;
    private final String desc;

    LotNoEnum(Integer code, String desc) {
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
    public static LotNoEnum getByCode(Integer code) {
        for (LotNoEnum status : values()) {
            if (status.getCode().intValue() == code)
                return status;
        }
        return null;
    }
}
