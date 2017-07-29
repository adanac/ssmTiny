/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package com.adanac.ssm.common.domain.enums;

/*
 * 栈板状态枚举值
 */
public enum MstLpnStatus {
    /*
    1   闲置
    2   占用中
    3   已关闭
    4   作废
     */
    UNUSED(1, "闲置"),
    USING(2, "占用中"),
    CLOSE(3, "已栈板确认"),
    VOID(4, "作废"),;

    private final Integer code;
    private final String desc;

    private MstLpnStatus(Integer code, String description) {
        this.code = code;
        this.desc = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static MstLpnStatus getByCode(Integer code) {
        for (MstLpnStatus yesNo : values()) {
            if (yesNo.getCode().equals(code)) {
                return yesNo;
            }
        }
        return null;
    }
}
