/**
 * Description goes here.
 */
package com.adanac.ssm.common.domain.enums;

/**
 * @author ewenlee
 * 2014年9月20日
 * 1 初始 2已释放 3已指派 4已完成 5作废
 */
public enum TaskStatusEnum
{
    UNKNOWN(0, "未知"),
    INITIAL(1, "初始"),
    RELEASED(2, "已释放"),
    ASSIGNED(3, "已指派"),
    COMPLETED(4, "已完成"),
    DISABLED(5, "作废");

    private final Integer code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private TaskStatusEnum(Integer code, String description)
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
    public static TaskStatusEnum getByCode(Integer code)
    {
        for (TaskStatusEnum em : values())
        {
            if (em.getCode() == code)
            {
                return em;
            }
        }
        return null;
    }
}
