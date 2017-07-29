package com.adanac.ssm.common.domain.enums;

/**
 * 盘点单状态
 * Copyright：2016 Haiziwang
 *
 * @author wangjin
 * 2016年6月17日
 */
public enum CcStatusTypeEnum {
	
	INIT(1, "初始"),
	WORKING(2, "已派工"),
	DURING(3, "盘点中"),
	CLOSE(4, "已关闭");

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

    public static CcStatusTypeEnum getByCode(Integer code)
    {
        for (CcStatusTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private CcStatusTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
