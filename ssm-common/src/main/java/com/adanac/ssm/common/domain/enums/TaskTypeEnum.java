package com.adanac.ssm.common.domain.enums;

/**
 * 任务类型
 */
public enum TaskTypeEnum {
    PUTAWAY(1, "上架"),
    PICKED(2, "拣选"),
    MOVED(3, "移动"),
    REPLENISHMENT(4, "补货"),
    CC(5, "盘点"),
    PROCESSING(6, "加工");

    private final Integer code;
    private final String desc;

    TaskTypeEnum(Integer code, String description) {
        this.code = code;
        this.desc = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static TaskTypeEnum getByCode(Integer code) {
        for (TaskTypeEnum em : values()) {
            if (em.getCode() == code) {
                return em;
            }
        }
        return null;
    }
}
