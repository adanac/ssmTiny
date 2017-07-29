package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/6/6.
 */
public enum PayTypeEnum {

    PAYONLINE(1, "在线支付"),
    COD(2, "货到付款"),;

    private final Integer code;
    private final String desc;

    private PayTypeEnum(Integer code, String desc) {
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
    public static PayTypeEnum getByCode(Integer code) {
        for (PayTypeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
    
}
