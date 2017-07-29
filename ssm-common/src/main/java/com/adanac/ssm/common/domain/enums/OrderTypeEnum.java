package com.adanac.ssm.common.domain.enums;

/**
 * @author yejiabin
 * @date 2016-03-02
 * @desc 出库订单类型 枚举
 */
public enum OrderTypeEnum {

    SALE(1, "线上销售"),
    SHOP(2, "门店配送"),
    TRANSFER(3, "调拨出库"),
    BACK_TO_SUPPLIER(4, "退厂出库"),;

    private final Integer code;
    private final String desc;

    private OrderTypeEnum(Integer code, String desc) {
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
    public static OrderTypeEnum getByCode(Integer code) {
        for (OrderTypeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
