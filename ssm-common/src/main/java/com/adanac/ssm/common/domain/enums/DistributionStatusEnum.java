package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/4/6.
 */
public enum DistributionStatusEnum {
    INIT(1,"初始"),
    DISTRIBUTED(2,"已发货"),
    INVALID(3,"已作废");

    private final Integer code;
    private final String desc;

    private DistributionStatusEnum(Integer code, String desc)
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
    public static DistributionStatusEnum getByCode(Integer code)
    {
        for (DistributionStatusEnum status : values())
        {
            if (status.getCode()==code)
            {
                return status;
            }
        }
        return null;
    }
}
