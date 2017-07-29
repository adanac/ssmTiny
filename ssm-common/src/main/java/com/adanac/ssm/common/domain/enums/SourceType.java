package com.adanac.ssm.common.domain.enums;

public enum SourceType
{
    UNKNOWN(0, "未知"),
    RECEIPT(1, "收货"),
    PUTWAY(2, "上架"),
    PICKUP(3, "拣选"),
    CHECK(4, "复核"),
    COMPLETE(5, "拣选完成"),
    DELIVERY(6, "发运"),
    MOVE_TASK(7, "任务移动"),
    MOVE_NO_TASK(8, "非任务移动"),
    MOVE_ACTIVE(9, "主动移动"),
    MOVE_CHILD_TASK(10, "移动子任务"),
    REPLENISHMENT(11, "补货"),
    REPLENISHMENT_CHIILD_TASK(12, "补货子任务"),
    ADJUSTMENT_ADD(13, "库存调盈"),
    ADJUSTMENT_SUBSTRACT(14, "库存调亏"),
    ADJUSTMENT_DIFFERENCE(15, "上架差异调整"),
    CANCEL_RECEIPT(16, "收货取消"),
    SIGN_EXCEPTION(17, "异常签收"),
    SIGN_INSTOCK_EXCEPTION(18, "异常签收有货"),
    SIGN_PUTWAY_DIFFERENCE(19, "登记上架差异"),
    DIFFERENCE_RE_PUTWAY(20, "差异重新上架"),
    INIT_IMPORT(21,"库存导入"),
    BC_IMPORT(22, "搬仓导入"),
    BC_EXPORT(23, "搬仓导出"),
    INV_PROCESS(24, "库内加工"),
    RE_ALLOCATE_EXCEPTION(25, "异常再分配");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private SourceType(Integer code, String description)
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
    public static SourceType getByCode(Integer code)
    {
        for (SourceType yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }

}
