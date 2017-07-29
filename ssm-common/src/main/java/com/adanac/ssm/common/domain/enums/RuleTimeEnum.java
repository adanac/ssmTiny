package com.adanac.ssm.common.domain.enums;

/**
 * @author liuxy
 * @date 2016-05-25
 * @desc 时间定位规则 枚举
 */
public enum RuleTimeEnum {

    FIFO(1, "先进先出"),
    LIFO(2, "后进先出"),
    XDQFO(3, "先到期先出"),;

    private final Integer code;
    private final String desc;

    private RuleTimeEnum(Integer code, String desc) {
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
    public static RuleTimeEnum getByCode(Integer code) {
        for (RuleTimeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
