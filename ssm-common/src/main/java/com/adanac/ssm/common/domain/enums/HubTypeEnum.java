package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/3/25.
 */
public enum HubTypeEnum {

    DEALER_HUB(1, "自营"),
    BPO_HUB(2, "外包"),
    SHOP_HUB(3, "门店"),
    UPS_HUB(4, "自提"),
    WH_HUB(5, "仓库");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private HubTypeEnum(Integer code, String description)
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
    public static HubTypeEnum getByCode(String code)
    {
        for (HubTypeEnum yesNo : values())
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
    public static HubTypeEnum getByCode(Integer code) {
        for (HubTypeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
