package com.adanac.ssm.common.domain.enums;

public enum TaskSourceType {
    CGRK(1, "采购入库"),
    DBRK(2, "调拨入库"),
    THRK_UNDERLINE(3, "退货入库（线下）"),
    THRK_ONLINE(4, "退货入库（线上）"),
    YBYD(5, "一般移动"),
    GLYD(6, "隔离移动"),
    SFYD(10, "释放移动"),
    BCBH(11, "波次补货"),
    DDCBH(12, "订单池补货"),
    KCYJ(13, "库存预警补货"),
    JTPD(14, "静态盘点"),
    DTPD(15, "动态盘点"),
    XSCK(7, "销售出库"),
    SHOP(18, "门店配送"),
    TRANSFER(8, "调拨出库"),
    TCCK(9, "退厂出库"),
    RETURN_GOODS(19, "库内返架"),
    PROCESSING(20, "商品加工");

    private final Integer code;

    private final String desc;

    /**
     * @param code
     * @param description
     */
    private TaskSourceType(Integer code, String description) {
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
    public static TaskSourceType getByCode(Integer code) {
        for (TaskSourceType yesNo : values()) {
            if (yesNo.getCode().equals(code)) {
                return yesNo;
            }
        }
        return null;
    }
}
