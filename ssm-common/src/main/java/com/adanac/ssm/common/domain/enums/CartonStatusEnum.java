package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/3/31.
 */
public enum CartonStatusEnum {

    UNSEALING(0, "未封箱"),
    INIT(1, "初始"),
    ALLOTED(2, "已分拨"),
    SHIPED(3, "已发货"),
    RECEIVED(4, "已接收"),
    CUSTOMERCANCELED(5, "客户取消"),
    WHCANCELED(6, "仓库取消");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private CartonStatusEnum(Integer code, String description)
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
    public static CartonStatusEnum getByCode(Integer code)
    {
        for (CartonStatusEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }
}
