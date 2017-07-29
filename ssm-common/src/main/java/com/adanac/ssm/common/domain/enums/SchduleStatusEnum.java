package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/6/1.
 */
public enum SchduleStatusEnum {
    INIT(0,"初始"),
    SHIPED(1,"发货完成"),
    SIGNED(2,"已签收"),
    ;

    private final Integer code;
    private final String desc;

    private SchduleStatusEnum(Integer code, String desc)
    {
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
    public static SchduleStatusEnum getByCode(Integer code)
    {
        for (SchduleStatusEnum status : values())
        {
            if (status.getCode().intValue() == code)
            {
                return status;
            }
        }
        return null;
    }
}
