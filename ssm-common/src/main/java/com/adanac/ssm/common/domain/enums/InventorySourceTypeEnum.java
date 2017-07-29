package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/5/11.
 */
public enum InventorySourceTypeEnum {
    DEFAULT(0, "默认初始"),
    PICKUP(1, "拣货"),
    OBD_EXCEPTION(2, "出库异常"),
    ;

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private InventorySourceTypeEnum(Integer code, String description)
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
    public static InventorySourceTypeEnum getByCode(Integer code)
    {
        for (InventorySourceTypeEnum yesNo : values())
        {
            if (yesNo.getCode()==code)
            {
                return yesNo;
            }
        }
        return null;
    }
}
