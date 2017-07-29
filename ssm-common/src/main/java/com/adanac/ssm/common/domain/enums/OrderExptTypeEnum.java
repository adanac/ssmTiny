package com.adanac.ssm.common.domain.enums;

public enum OrderExptTypeEnum {

    CANCEL(1, "客户取消"),
    LOC_FAIL(2, "分配失败"),
    STOCK_CARGO(3, "缺货/货损");

    private final Integer code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    OrderExptTypeEnum(Integer code, String description) {
        this.code = code;
        this.desc = description;
    }

    /**
     * @return
     * @desc 返回code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return
     * @desc 返回desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 通过code获取枚举
     *
     * @param code
     */
    public static OrderExptTypeEnum getByCode(Integer code) {
        for (OrderExptTypeEnum yesNo : values()) {
            if (yesNo.getCode().intValue() == code) {
                return yesNo;
            }
        }
        return null;
    }
}
