package com.adanac.ssm.common.domain.enums;

public enum OrderExptSourceEnum {

    LOCATION(1, "分配"),
    PICK(2, "拣货"),
    REVIEW(3, "复核"),
    ALLOT(4, "分拨"),
    SHIP(5, "发货");

    private final Integer code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    OrderExptSourceEnum(Integer code, String description) {
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
    public static OrderExptSourceEnum getByCode(Integer code) {
        for (OrderExptSourceEnum yesNo : values()) {
            if (yesNo.getCode().intValue() == code) {
                return yesNo;
            }
        }
        return null;
    }
}
