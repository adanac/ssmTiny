package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-08-23
 * Desc:    商品条码类型
 */
public enum SkuPdTypeEnum {

    SKU(0, "主档码"),          // 主档码为 mst_sku 表的 sys_no
    DISPERSE(1, "单件条码"),   // 单件码可以是 mst_sku 表的 sku_code 或者 bar_code, 也可以是其它类型的码
    INTEGRATE(2, "整件箱码");  // 箱码对应整件

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
    SkuPdTypeEnum(Integer code, String name) {
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
    public static SkuPdTypeEnum getByCode(Integer code) {
        for (SkuPdTypeEnum status : values()) {
            if (status.getCode().intValue() == code)
                return status;
        }
        return null;
    }
}
