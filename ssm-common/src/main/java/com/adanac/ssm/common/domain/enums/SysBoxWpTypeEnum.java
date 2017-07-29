package com.adanac.ssm.common.domain.enums;

/**
 * Created by Administrator on 2016/8/18.
 * 采集箱整散件类型
 */
public enum SysBoxWpTypeEnum {
    WHOLETYPE(1, "整件"),
    PARTSTYPE(2, "散件");


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
    SysBoxWpTypeEnum(Integer code, String name) {
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
}
