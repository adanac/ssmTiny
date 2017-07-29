package com.adanac.ssm.common.domain.enums;

public enum MstAllocationRule
{
    /**
     * 清空储位
     */
    MIN_INVENTORY(1, "清空储位"),
    /**
     * 最少拣货储位
     */
    MAX_INVENTORY(2, "最少拣货储位");

    private final Integer code;

    private final String desc;

    private MstAllocationRule(Integer code, String description)
    {
        this.code = code;
        this.desc = description;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getDesc()
    {
        return desc;
    }

    public static MstAllocationRule getByCode(String code)
    {
        for (MstAllocationRule yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }
}
