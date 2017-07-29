package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  liuxy
 * Date:    2016-06-01
 * Desc:    承运商类型
 */
public enum CompanyTypeEnum {

    TYPE_INTERNAL(1, "内部"),
    TYPE_EXTERNAL(2, "外部"),;

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
    CompanyTypeEnum(Integer code, String name) {
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
    public static CompanyTypeEnum getByCode(Integer code) {
        for (CompanyTypeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
