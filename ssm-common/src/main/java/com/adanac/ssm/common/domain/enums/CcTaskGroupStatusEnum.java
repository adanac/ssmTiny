package com.adanac.ssm.common.domain.enums;

public enum CcTaskGroupStatusEnum {
	
	/**初始、初盘释放、初盘开始、初盘完成、复盘释放、复盘开始、复盘完成、已关闭、已作废*/
	
	INIT(1, "初始"),
    FIRSTGROUP_RELEASE(2, "初盘释放"),
    FIRSTGROUP_START(3, "初盘开始"),
    FIRSTGROUP_COMPLETED(4, "初盘完成"),
    SECONDGROUP_RELEASE(5, "复盘释放"),
    SECONDGROUP_START(6, "复盘开始"),
    SECONDGROUP_COMPLETED(7, "复盘完成"),
    COMPLETED(8, "已关闭"),
    CANCELLED(9, "已作废");

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

    public static CcTaskGroupStatusEnum getByCode(Integer code)
    {
        for (CcTaskGroupStatusEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private CcTaskGroupStatusEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
