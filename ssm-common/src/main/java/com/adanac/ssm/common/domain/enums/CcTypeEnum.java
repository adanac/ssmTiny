package com.adanac.ssm.common.domain.enums;

/**
 * 盘点单类型
 * Copyright：2016 Haiziwang
 *
 * @author wangjin
 * 2016年6月17日
 */
public enum CcTypeEnum {
	
	DYNAMIC(1, "动态盘点"),
    STATIC(2, "静态盘点"),
    SCROLL(3, "滚动盘点");

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

    public static CcTypeEnum getByCode(Integer code)
    {
        for (CcTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private CcTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
