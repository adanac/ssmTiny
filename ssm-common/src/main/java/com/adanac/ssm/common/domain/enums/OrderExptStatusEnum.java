package com.adanac.ssm.common.domain.enums;

public enum OrderExptStatusEnum {

    INIT(1, "初始"),
    SIGNED(2, "已签收"),
    READY_TO_PICK(3, "待拣货"),
    PICKED(4, "已拣货"),
    CONFIRM_GOODS(5, "确认有货"),
    CONFIRM_STOCK(6, "确认缺货"),
    STAY_BACK_RACK(7, "待返架"),
    HAVE_BACK_RACK(8, "已返架"),
    HAVE_ALLOCATED(9, "已分配"),
    ;

    private final Integer code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    OrderExptStatusEnum(Integer code, String description) {
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
    public static OrderExptStatusEnum getByCode(Integer code) {
        for (OrderExptStatusEnum yesNo : values()) {
            if (yesNo.getCode().intValue() == code) {
                return yesNo;
            }
        }
        return null;
    }
}
