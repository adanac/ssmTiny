package com.adanac.ssm.common.domain.enums;

public enum MoveStatusTypeEnum {
	INIT(1, "初始"),
	GENERATETASK(2, "已生成任务"),
    COMPLETED(3, "已完成"),
	CANCEL(4, "已作废");

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

    public static MoveStatusTypeEnum getByCode(Integer code)
    {
        for (MoveStatusTypeEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private MoveStatusTypeEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
