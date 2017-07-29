package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/6/16.
 */
public enum IbdReceiptStatusEnum {
    INIT(1, "初始"),
    RECEIPTING(2, "收货中"),
    CLOSED(3, "已关闭 "),
    CANCELED(4, "客户取消");

    private final Integer code;
    private final String desc;

    private IbdReceiptStatusEnum(Integer code, String desc) {
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
    public static IbdReceiptStatusEnum getByCode(Integer code) {
        for(IbdReceiptStatusEnum status : values()) {
            if(status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
