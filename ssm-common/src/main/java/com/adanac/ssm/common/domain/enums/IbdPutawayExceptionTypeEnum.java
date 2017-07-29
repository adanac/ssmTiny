package com.adanac.ssm.common.domain.enums;

public enum IbdPutawayExceptionTypeEnum {

	NOTALLOWED(1, "验收数量不准"),
    MISS(2, "上架时丢失"),
    OTHER(3, "其他");

    private final Integer code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    IbdPutawayExceptionTypeEnum(Integer code, String description) {
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
    public static IbdPutawayExceptionTypeEnum getByCode(Integer code) {
        for (IbdPutawayExceptionTypeEnum yesNo : values()) {
            if (yesNo.getCode().intValue() == code) {
                return yesNo;
            }
        }
        return null;
    }
}
