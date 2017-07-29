package com.adanac.ssm.common.domain.enums;

/**
 * @author liuxunyang
 * 2016年06月28日
 * 释放方式 1自动释放 2人工释放
 */
public enum ReleaseModeEnum {
	AUTO_RELEASE(1, "自动释放"),
    MANUAL_RELEASE(2, "人工释放");
    
    private final Integer code;
    private final String desc;
    
    /**
     * @param code
     * @param description
     */
    
    private ReleaseModeEnum(Integer code, String description)
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
    public static ReleaseModeEnum getByCode(Integer code)
    {
        for (ReleaseModeEnum em : values())
        {
            if (em.getCode() == code)
            {
                return em;
            }
        }
        return null;
    }
}
