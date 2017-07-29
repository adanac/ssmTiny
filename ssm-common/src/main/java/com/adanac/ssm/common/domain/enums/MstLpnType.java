/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package com.adanac.ssm.common.domain.enums;

/*
 * 容器类型枚举值
 */
public enum MstLpnType {
    /*
    1   栈板
    2   料箱
     */
    ZB(1, "栈板"),
    LX(2, "料箱"),;

    private final Integer code;
    private final String desc;

    private MstLpnType(Integer code, String description) {
        this.code = code;
        this.desc = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static MstLpnType getByCode(Integer code) {
        for (MstLpnType yesNo : values()) {
            if (yesNo.getCode().equals(code)) {
                return yesNo;
            }
        }
        return null;
    }
}
