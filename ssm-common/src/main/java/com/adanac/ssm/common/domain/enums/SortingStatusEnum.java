package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/3/24.
 */
public enum SortingStatusEnum {
    INIT(1, "初始"),
    COMPLETED(2, "已完成"),
    ;

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private SortingStatusEnum(Integer code, String description)
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
    public static SortingStatusEnum getByCode(Integer code)
    {
        for (SortingStatusEnum yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }
}
