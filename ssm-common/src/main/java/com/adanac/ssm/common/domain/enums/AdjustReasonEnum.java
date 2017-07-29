package com.adanac.ssm.common.domain.enums;

public enum AdjustReasonEnum {
	CHECK(1, "盘点");

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

    public static AdjustReasonEnum getByCode(Integer code)
    {
        for (AdjustReasonEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private AdjustReasonEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
