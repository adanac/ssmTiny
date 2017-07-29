package com.adanac.ssm.common.domain.enums;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  zhuangwb
 * Date:    2016-09-27
 * Desc:    打印环节
 */
public enum PrintNodeEnum {
	// 1 发票；2 出库单； 3 交接单；4 收货单; 5 箱贴  ;6 预检单 ; 7 验收单 ;20 顺丰面贴 ;21 EMS面贴 ;22 妈妈团面贴
	OUTBOUND_ORDER(1, "出库单"),
	INVOICE(2, "发票"),
	TRANSFER_ORDER(3, "交接单"),	
	RECEIPT_ORDER(4, "收货单"),
	BOX_PASTE(5, "箱贴"),
	PREVIEW_ORDER(6, "预检单"),
	CHECK_ORDER(7, "验收单"),
	WAVE_ORDER(8,"波次单"),
	SF_SURFACEMOUNT(20, "顺丰面贴"),
	EMS_SURFACEMOUNT(21, "EMS面贴"),
	MMT_SURFACEMOUNT(22, "妈妈团面贴"),
	YD_SURFACEMOUNT(23, "韵达面贴"),;

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
    PrintNodeEnum(Integer code, String name) {
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
    public static PrintNodeEnum getByCode(Integer code) {
        for (PrintNodeEnum status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
