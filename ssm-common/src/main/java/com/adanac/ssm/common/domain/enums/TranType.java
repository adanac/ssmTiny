package com.adanac.ssm.common.domain.enums;

public enum TranType {
    UNKNOWN(0, "未知"),
    RECEIPT(1, "收货"),
    PUTAWAY(2, "上架"),
    REPLENISHMENT(3, "补货"),
    MOVE(4, "移动"),
    SORTING(5, "拣选"),
    DELIVERY(6, "发运"),
    RECEIPT_CANCEL(7, "取消收货"),
    ADJUSTMENT(8, "库存调整"),
    AJUST_DIFF(9, "上架差异调整"),
    BC_IMPORT(10, "搬仓导入"),
    BC_EXPORT(11, "搬仓导出"),
    INIT_IMPORT(12, "库存导入"),
    INV_PROCESS(13, "库内加工");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private TranType(Integer code, String description) {
        this.code = code;
        this.desc = description;
    }

    /**
     * @return
     * @desc 返回code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return
     * @desc 返回desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 通过code获取枚举
     *
     * @param code
     */
    public static TranType getByCode(Integer code) {
        for (TranType yesNo : values()) {
            if (yesNo.getCode().equals(code)) {
                return yesNo;
            }
        }
        return null;
    }
}
