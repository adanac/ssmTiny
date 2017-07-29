package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-03-16
 */
public enum DeviceType {

    PDA(1, "PDA", "80"),
    PRINT_CLIENT(2, "开票系统", "77"),
    WAREHOUSE_JOB(3, "仓库作业", "48"),;

    /**
     * 类型编号
     */
    private Integer code;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 系统编码
     */
    private String codeSysNo;

    /**
     * 构造函数
     */
    DeviceType(Integer code, String name, String codeSysNo) {
        this.code = code;
        this.name = name;
        this.codeSysNo = codeSysNo;
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
     * 获得 codeSysNo
     */
    public String getCodeSysNo() {
        return codeSysNo;
    }

    /**
     * 设置 codeSysNo
     */
    public void setCodeSysNo(String codeSysNo) {
        this.codeSysNo = codeSysNo;
    }
}
