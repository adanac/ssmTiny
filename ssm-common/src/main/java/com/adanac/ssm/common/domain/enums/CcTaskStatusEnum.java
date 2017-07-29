package com.adanac.ssm.common.domain.enums;

/**
 * 盘点任务状态
 * Copyright：2016 Haiziwang
 *
 * @author wangjin
 * 2016年6月17日
 */
public enum CcTaskStatusEnum {
	
	/**初始、初盘释放、初盘开始、初盘完成、复盘释放、复盘开始、复盘完成、已关闭*/
	
	INIT(1, "初始"),
    FIRSTGROUP_RELEASE(2, "初盘释放"),
    FIRSTGROUP_START(3, "初盘开始"),
    FIRSTGROUP_COMPLETED(4, "初盘完成"),
    SECONDGROUP_RELEASE(5, "复盘释放"),
    SECONDGROUP_START(6, "复盘开始"),
    SECONDGROUP_COMPLETED(7, "复盘完成"),
    CLOSED(8, "已关闭"),
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

    public static CcTaskStatusEnum getByCode(Integer code)
    {
        for (CcTaskStatusEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private CcTaskStatusEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
