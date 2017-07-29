package com.adanac.ssm.common.domain.enums;

/**
 * 库存加工单状态
 * Copyright：2016 Haiziwang
 *
 * @author wangjin
 * 2016年8月26日
 */
public enum InvProcessingStatusEnum {
	INIT(1, "初始"),
	MOVED(2, "已生成移动任务"),
	PICKING(3, "拣货中"),
    PICKED(4, "已拣货"),
    COMPLETED(5, "完成"),
    CANCEL(6, "作废"),
    ;
	

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

    public static InvProcessingStatusEnum getByCode(Integer code)
    {
        for (InvProcessingStatusEnum em : values())
        {
            if (em.getCode().equals(code))
            {
                return em;
            }
        }
        return null;
    }

    private InvProcessingStatusEnum(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
