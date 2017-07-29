package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/3/25.
 */
public enum ToLocationType {

    TEMP_LOCATION(1, "暂存位"),
    PACKAGE_LOCATION(2, "打包位"),
    PLATFORM_LOCATION(3, "月台位");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private ToLocationType(Integer code, String description)
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
    public static ToLocationType getByCode(String code)
    {
        for (ToLocationType yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }
    
    /**
     * 通过code获取枚举
     * @param code
     */
    public static ToLocationType getByCode(Integer code)
    {
        for (ToLocationType em : values())
        {
            if (em.getCode() == code)
            {
                return em;
            }
        }
        return null;
    }
}
