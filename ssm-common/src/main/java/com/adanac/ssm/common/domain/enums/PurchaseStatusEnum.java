package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  zhouwei
 * Date:    2016-06-17
 * Desc:    入库类型
 */
public enum PurchaseStatusEnum {

	INIT(1, "初始"),
    RECEIPT(2, "收货中"),
    RECEIPT_COMPLETE(3, "收货完成"),
    CLOSE(4, "已关闭"),
    CANCEL(5, "已作废");

    /**
     * 状态编码
     */
    private Integer code;

    /**
     * 状态名称
     */
    private String name;

    /**
     * 构造函数
     */
    PurchaseStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 获得 code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置 code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获得 name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 通过code获取枚举
     *
     * @param code
     */
    public static PurchaseStatusEnum getByCode(Integer code) {
        for (PurchaseStatusEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
