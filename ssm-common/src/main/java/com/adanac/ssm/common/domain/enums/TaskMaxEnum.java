package com.adanac.ssm.common.domain.enums;

/**
 * @author liuxunyang
 * 2016年06月28日
 * 最大任务数 1任务数 2容积 3库区商品数量
 */
public enum TaskMaxEnum {
	TASK_NUMBER(1, "任务数"),
    VOLUME(2, "容积"),
    RESERVOIR_GOODS_QUANTITY(3, "库区商品数量");
    
    private final Integer code;
    private final String desc;
    
    /**
     * @param code
     * @param description
     */
    
    private TaskMaxEnum(Integer code, String description)
    {
        this.code = code;
        this.desc = description;
    }
    
    /**
     * @return
     * @desc 返回code
     */
    public Integer getCode()
    {
        return code;
    }

    /**
     * @return
     * @desc 返回desc
     */
    public String getDesc()
    {
        return desc;
    }
    
    /**
     * 通过code获取枚举
     * @param code
     */
    public static TaskMaxEnum getByCode(Integer code)
    {
        for (TaskMaxEnum em : values())
        {
            if (em.getCode() == code)
            {
                return em;
            }
        }
        return null;
    }
}
