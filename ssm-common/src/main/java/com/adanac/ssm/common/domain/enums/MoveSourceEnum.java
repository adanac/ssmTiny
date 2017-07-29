package com.adanac.ssm.common.domain.enums;

/**
 * @desc 移动单移动源 枚举
 */
public enum MoveSourceEnum {
    HAND_WORK(1, "手工"),
    PICKING(2, "拣货异常"),
    BACK_FRAME(3, "库内返架"),
    LOT(4, "效期管理"),
    RE_ALLOCATE(5, "再分配"),
    RE_PUTAWAY(6, "重新上架"),
    ISOLATE_PUTAWAY(7, "隔离上架"),
    INV_PROCESS(8, "加工单"),
    EXPT_PROCESS(9, "异常处理"),
    ;

    private final Integer code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private MoveSourceEnum(Integer code, String description)
    {
        this.code = code;
        this.desc = description;
    }

    /**
     * code
     * 
     * @return the code
     * @since 1.0.0
     */
    public Integer getCode()
    {
        return code;
    }

    /**
     * description
     * 
     * @return the description
     * @since 1.0.0
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * 
     * 通过code获取枚举
     * @param code
     */
    public static MoveSourceEnum getByCode(Integer code)
    {
        for (MoveSourceEnum em : values())
        {
            if (em.getCode() == code)
            {
                return em;
            }
        }
        return null;
    }

}
