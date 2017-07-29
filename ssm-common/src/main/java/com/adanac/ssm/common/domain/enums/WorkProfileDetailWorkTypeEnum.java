package com.adanac.ssm.common.domain.enums;

public enum WorkProfileDetailWorkTypeEnum {
	
	/**上架 1、拣选2、移动3、补货4、盘点5*/
	
	PUTAWAY(1, "上架"),
    PICKED(2, "拣选"),
    MOVED(3, "移动"),
    REPLENISHMENT(4, "补货"),
	CC(5, "盘点");

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

    public static WorkProfileDetailWorkTypeEnum getByCode(Integer code)
    {
        for (WorkProfileDetailWorkTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private WorkProfileDetailWorkTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
