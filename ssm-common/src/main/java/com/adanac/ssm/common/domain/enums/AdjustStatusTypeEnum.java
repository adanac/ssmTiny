package com.adanac.ssm.common.domain.enums;

public enum AdjustStatusTypeEnum {
	INIT(1, "初始"),
    COMPLETED(2, "已完成"),
	CANCEL(3, "已作废");

    private final Integer code;

    private final String name;

    public Integer getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public static AdjustStatusTypeEnum getByCode(Integer code)
    {
        for (AdjustStatusTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private AdjustStatusTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
