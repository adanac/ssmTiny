package com.adanac.ssm.common.domain.enums;

/**
 * @author liuxunyang
 * @date 2016-12-20
 * @desc 出库单据类型 枚举
 */
public enum BillTypeEnum {

    SALE(1, "销售订单"),
    SHOP(2, "门店订单"),
    TRANSFER(3, "调拨订单"),
    BACK_TO_SUPPLIER(4, "退厂订单"),;

    private final Integer code;
    private final String desc;

    private BillTypeEnum(Integer code, String desc) {
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
    public static BillTypeEnum getByCode(Integer code) {
        for (BillTypeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
