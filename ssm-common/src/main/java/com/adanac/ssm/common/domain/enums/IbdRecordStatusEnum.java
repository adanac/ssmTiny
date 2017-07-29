package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/6/16.
 */
public enum IbdRecordStatusEnum {
    INIT(1, "初始"),
    RECEIPTING(2, "待上架"),
    CLOSED(3, "已上架"),
    CANCELED(5, "已取消");

    private final Integer code;
    private final String desc;

    private IbdRecordStatusEnum(Integer code, String desc) {
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
     * @param code
     */
    public static IbdRecordStatusEnum getByCode(Integer code) {
        for(IbdRecordStatusEnum status : values()) {
            if(status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
