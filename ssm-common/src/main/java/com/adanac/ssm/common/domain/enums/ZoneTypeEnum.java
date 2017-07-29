package com.adanac.ssm.common.domain.enums;

/**
 * 库区类型
 */
public enum ZoneTypeEnum {
	STORAGE_AREA(1, "存储区"),
	PICKING_AREA(2, "拣货区"),
	RECEIVING_BUFFER_AREA(3, "收货暂存区"),
	DELIVERY_BUFFER_AREA(4, "发货暂存区");

    private final Integer code;
    private final String desc;

    ZoneTypeEnum(Integer code, String description) {
        this.code = code;
        this.desc = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ZoneTypeEnum getByCode(Integer code) {
        for (ZoneTypeEnum em : values()) {
            if (em.getCode() == code) {
                return em;
            }
        }
        return null;
    }
}
