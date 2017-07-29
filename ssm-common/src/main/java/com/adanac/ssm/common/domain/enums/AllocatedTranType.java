/**
 * Description goes here.
 */
package com.adanac.ssm.common.domain.enums;

/**
 * @author yejiabin
 * @date 2016-03-02
 */
public enum AllocatedTranType
{
    UNKNOWN(0, "未知"),
    LOCATION_SET(1, "定位"),
    LOCATION_CANCEL(2, "取消定位"),
    PICKUP_COMPLETE(3, "拣货完成"),
    MOVEMENT_CREATE(4, "创建移动"),
    MOVEMENT_DISABLE(5, "作废移动"),
    MOVEMENT_COMPLETE(6, "完成移动"),
    ADJUSTMENT_CREATE(7, "创建调整"),
    ADJUSTMENT_DISABLE(8, "作废调整"),
    ADJUSTMENT_COMPLETE(9, "完成调整");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private AllocatedTranType(Integer code, String description)
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
    public static AllocatedTranType getByCode(Integer code)
    {
        for (AllocatedTranType yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }
}
