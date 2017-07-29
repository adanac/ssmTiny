/**
 * Description goes here.
 */
package com.adanac.ssm.common.domain.enums;

/**
 * @author ewenlee
 * 2014年9月28日
 */
public enum LocationClass
{
	HEAVY_DUTY_SHELVES(1, "重型货架"),
    HEAP(2, "地堆"),
    LIGHT_SHELVES(3, "轻型货架");
    
    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private LocationClass(Integer code, String description)
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
    public static LocationClass getByCode(String code)
    {
        for (LocationClass yesNo : values())
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
    public static LocationClass getByCode(Integer code) {
        for (LocationClass status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
