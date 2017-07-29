package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  zhouwei
 * Date:    2016-06-17
 * Desc:    入库类型
 */
public enum PutawayDiffReasonEnum {
//差异原因,1.验收数量不准、2.上架时丢失、3.其他
	NUM1(1, "验收数量不准"),
	NUM2(2, "上架时丢失"),
	NUM3(3, "其他");

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
    PutawayDiffReasonEnum(Integer code, String name) {
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
    public static PutawayDiffReasonEnum getByCode(Integer code) {
        for (PutawayDiffReasonEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
