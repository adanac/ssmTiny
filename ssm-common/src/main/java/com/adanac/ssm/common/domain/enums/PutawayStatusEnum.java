package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  zhouwei
 * Date:    2016-06-17
 * Desc:    入库类型
 */
public enum PutawayStatusEnum {
//异常状态 1.初始；2.已签收；3.调整收货；4.待上架；5.已上架；6.已隔离
	INIT(1, "初始"),
	YQS(2, "已签收"),
	TZSH(3, "调整收货"),
	DSJ(4, "待上架"),
	YSJ(5, "已上架"),
	YGL(6, "已隔离");

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
    PutawayStatusEnum(Integer code, String name) {
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
    public static PutawayStatusEnum getByCode(Integer code) {
        for (PutawayStatusEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
