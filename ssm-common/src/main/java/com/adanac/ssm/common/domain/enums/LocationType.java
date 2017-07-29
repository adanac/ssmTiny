/**
 * Description goes here.
 */
package com.adanac.ssm.common.domain.enums;

/**
 * @author ewenlee
 * 2014年9月28日
 */
public enum LocationType
{
    UNKNOWN(0, "未知"),
    RECEIPT_lOCATION(1, "收货位"),
    STORAGE_LOCATION(2, "存储位"),
    PICKUP_LOCATION(3, "拣选位"),
    PACKAGE_LOCATION(4, "打包位"),
    TEMP_LOCATION(5, "暂存位"),
    EXCEPTION_LOCATION(6, "异常位"),
    ISOLATION_LOCATION(7, "冻结位"),
    CROSS_LOCATION(8, "越库位"),
    PLATFORM_LOCATION(9, "月台位"),
    PROCESSING_LOCATION(10, "加工位");
    
    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private LocationType(Integer code, String description)
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
    public static LocationType getByCode(String code)
    {
        for (LocationType yesNo : values())
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
    public static LocationType getByCode(Integer code) {
        for (LocationType status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
