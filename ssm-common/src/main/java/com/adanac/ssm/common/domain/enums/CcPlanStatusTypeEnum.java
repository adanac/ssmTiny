package com.adanac.ssm.common.domain.enums;

/**
 * 盘点计划状态
 * Copyright：2016 Haiziwang
 *
 * @author wangjin
 * 2016年6月12日
 */
public enum CcPlanStatusTypeEnum {
	
	ENABLED(1, "启用"),
	DISABLED(2, "禁用");

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

    public static CcPlanStatusTypeEnum getByCode(Integer code)
    {
        for (CcPlanStatusTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private CcPlanStatusTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
