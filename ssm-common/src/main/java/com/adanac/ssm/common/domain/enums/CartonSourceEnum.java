package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/3/31.
 */
public enum CartonSourceEnum {
    WHSTORAGE(1, "仓内出库"),
    CROSSWHSALE(2, "跨仓销售"),
    CROSSPUR(3, "越库采购");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private CartonSourceEnum(Integer code, String description)
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
    public static CartonSourceEnum getByCode(Integer code)
    {
        for (CartonSourceEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }
}
