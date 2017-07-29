/**
 * Description goes here.
 */
package com.adanac.ssm.common.domain.enums;

/**
 * @author ewenlee
 * 2014年11月14日
 */
public enum MoveType
{
    NORMAL(1, "一般"),
    ISOLATION(2, "隔离"),
    RELEASE(3, "释放");

    private final Integer code;

    private final String name;

    public Integer getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public static MoveType getByCode(Integer code)
    {
        for (MoveType yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

    private MoveType(Integer code, String name)
    {
        this.code = code;
        this.name = name;
    }
}
