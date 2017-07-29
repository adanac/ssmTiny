package com.adanac.ssm.common.domain.enums;

/**
 * 盘点类型
 * Copyright：2016 Haiziwang
 *
 * @author wangjin
 * 2016年6月12日
 */
public enum CcPlanTypeEnum {
	
	DYNAMIC(1, "动态盘点"),
	STATIC(2, "静态盘点");

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

    public static CcPlanTypeEnum getByCode(Integer code)
    {
        for (CcPlanTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private CcPlanTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
