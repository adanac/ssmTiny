package com.adanac.ssm.common.domain.enums;

/**
 * 抽盘类型
 * Copyright：2016 Haiziwang
 *
 * @author wangjin
 * 2016年6月15日
 */
public enum CcPlanSamplingTypeEnum {
	
	BYSKU(1, "按商品"),
	BYLOCATION(2, "按储位"),
	BYSKUANDLOCATION(3, "按商品和储位");
	
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

    public static CcPlanSamplingTypeEnum getByCode(Integer code)
    {
        for (CcPlanSamplingTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private CcPlanSamplingTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
