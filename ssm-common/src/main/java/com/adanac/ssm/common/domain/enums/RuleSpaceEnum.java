package com.adanac.ssm.common.domain.enums;

/**
 * @author liuxy
 * @date 2016-05-25
 * @desc 空间定位规则 枚举
 */
public enum RuleSpaceEnum {

    QKCW(1, "清空储位"),
    ZSJHCW(2, "最少拣货储位"),;

    private final Integer code;
    private final String desc;

    private RuleSpaceEnum(Integer code, String desc) {
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
    public static RuleSpaceEnum getByCode(Integer code) {
        for (RuleSpaceEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
