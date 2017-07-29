package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  liuxunyang
 * Date:    2016-09-22
 * Desc:    分站打包类型
 */
public enum PackageTypeEnum {

    WHOLE_PACKAGE(0, "整体打包"),
    SEPARATE_PACKAGE(1, "分开打包"),;

    /**
     * 编码
     */
    private Integer code;

    /**
     * 名称
     */
    private String name;

    /**
     * 构造函数
     */
    PackageTypeEnum(Integer code, String name) {
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
    public static PackageTypeEnum getByCode(Integer code) {
        for (PackageTypeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
