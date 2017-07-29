package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/5/17.
 */
public enum ChargingWayEnum {

    ANJIAN(1, "整车"),
    ANZHONGLIANG(2, "零担");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private ChargingWayEnum(Integer code, String description)
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
    public static ChargingWayEnum getByCode(Integer code)
    {
        for (ChargingWayEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }


}
