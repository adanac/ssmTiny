/**
 * Description goes here.
 */
package com.adanac.ssm.common.domain.enums;

/**
 * @author ewenlee
 * 2014年9月28日
 */
public enum LocationStatus
{
	NON_USE(0, "不可用"),
    USE(1, "可用");
    
    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private LocationStatus(Integer code, String description)
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
    public static LocationStatus getByCode(String code)
    {
        for (LocationStatus yesNo : values())
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
     *
     * @param code
     */
    public static LocationStatus getByCode(Integer code) {
        for (LocationStatus status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
