package com.adanac.ssm.common.domain.enums;

import com.adanac.ssm.common.domain.constant.StringConstants;

/**
 * @author yejiabin
 * @date 2016-03-02
 * @desc 序列号类型枚举
 */
public enum SequenceEnum {

    LT("LT", "批号编号", 5, StringConstants.SHORT_DATE_FORMAT),
    MV("MV", "移库编号", 5, StringConstants.SHORT_DATE_FORMAT),
    RP("RP", "计划编号", 5, StringConstants.SHORT_DATE_FORMAT),
    CK("CK", "出库单号", 7, StringConstants.SHORT_DATE_FORMAT),
    CKYC("CKYC", "出库异常单号", 7, StringConstants.SHORT_DATE_FORMAT),
    RK("RK", "入库单号", 7, StringConstants.SHORT_DATE_FORMAT),
    DIFF("DIFF", "上架差异", 7, StringConstants.SHORT_DATE_FORMAT),
    WV("WV", "波次号", 7, StringConstants.SHORT_DATE_FORMAT),
    WVT("WVT", "波次模板号", 5, StringConstants.SHORT_DATE_FORMAT),
    GRP("GRP", "集合单号", 7, StringConstants.SHORT_DATE_FORMAT),
    AJ("AJ", "调整单号", 4, StringConstants.SHORT_DATE_FORMAT),
    CPLAN("CP", "盘点计划编号", 5, StringConstants.SHORT_DATE_FORMAT),
    ORDER("CO", "盘点单编号", 5, StringConstants.SHORT_DATE_FORMAT),
    ODETAILS("OD", "盘点单明细编号", 5, StringConstants.SHORT_DATE_FORMAT),
    TaskGROUP("TG", "任务组编号", 5, StringConstants.SHORT_DATE_FORMAT),
    DATAFILTER("DF", "数据过滤器", 5, StringConstants.SHORT_DATE_FORMAT),
    STRATEGY("PS", "上架策略", 5, StringConstants.SHORT_DATE_FORMAT),
    ALLOCATION("AS", "定位策略", 5, StringConstants.SHORT_DATE_FORMAT),
    DC("DC", "配送中心", 5, StringConstants.SHORT_DATE_FORMAT),
    ORG("OR", "机构", 5, StringConstants.SHORT_DATE_FORMAT),
    COMPANY("CY", "货主", 5, StringConstants.SHORT_DATE_FORMAT),
    CARRIER("CA", "承运商", 5, StringConstants.SHORT_DATE_FORMAT),
    AREA("WA", "作业区域", 5, StringConstants.SHORT_DATE_FORMAT),
    PROFILE("WP", "作业档案", 5, StringConstants.SHORT_DATE_FORMAT),
    ZONE("ZO", "储区", 5, StringConstants.SHORT_DATE_FORMAT),
    VEHICLE("VE", "车辆", 5, StringConstants.SHORT_DATE_FORMAT),
    DRIVER("DR", "司机", 5, StringConstants.SHORT_DATE_FORMAT),
    LPN("LP", "容器", 5, StringConstants.SHORT_DATE_FORMAT),
    TG("TG", "任务组", 7, StringConstants.SHORT_DATE_FORMAT),
    TASK("TK", "任务", 7, StringConstants.SHORT_DATE_FORMAT),
    REPLENISHMENT("RS", "补货信息", 7, StringConstants.SHORT_DATE_FORMAT),
    RECEIPT("RECEIPT", "预约单编号", 5, StringConstants.SHORT_DATE_FORMAT),
    NEIPEI("NP", "内配编号", 5, StringConstants.SHORT_DATE_FORMAT),
    ZTASK("ZK", "质控盘点任务单号", 5, StringConstants.SHORT_DATE_FORMAT),
    BC_EXPORT("BC", "搬仓导出任务号", 4, StringConstants.SHORT_DATE_FORMAT),
    RKSJ("RKSJ", "入库上架单号", 5, StringConstants.SHORT_DATE_FORMAT),
    CARTON("CT", "包裹号", 7, StringConstants.SHORT_DATE_FORMAT),
    PARTSPASTE("", "散件打印", 7, StringConstants.SHORT_DATE_FORMAT),
    INVPLAN("IP", "补货计划", 7, StringConstants.SHORT_DATE_FORMAT),
    DISTRIBUTION("DT", "分拨号", 7, StringConstants.SHORT_DATE_FORMAT),
    REPLOTNO("RL", "补货批次号", 7, StringConstants.SHORT_DATE_FORMAT),
    SHD("SHD", "收货单号", 7, "yyMMdd"),
    SHJL("SHJL", "收货记录号", 7, StringConstants.SHORT_DATE_FORMAT),
    CC("CC", "盘点单", 5, StringConstants.SHORT_DATE_FORMAT),
    CCTK("CCTK", "盘点单任务", 7, StringConstants.SHORT_DATE_FORMAT),
    CCTKG("CCTKG", "盘点单任务组", 7, StringConstants.SHORT_DATE_FORMAT),
    PYAJ("PKAJ", "调整单盘盈", 4, StringConstants.SHORT_DATE_FORMAT),
    PKAJ("PKAJ", "调整单盘亏", 4, StringConstants.SHORT_DATE_FORMAT),
    YY("YY", "预约单", 3, StringConstants.SHORT_DATE_FORMAT),
    RKYC("RKYC", "入库异常单号", 7, StringConstants.SHORT_DATE_FORMAT),
    PROCESSING("PROC", "库存加工单号", 5, StringConstants.SHORT_DATE_FORMAT),
	PROCESSINGDETAIL("PRODE", "库存加工单明细编号", 5, StringConstants.SHORT_DATE_FORMAT),
	ADJM("ADJM", "调整单", 5, StringConstants.SHORT_DATE_FORMAT);

    private final String code;

    private final String desc;

    private final Integer length;

    private final String dateFormat;

    /**
     * @param code
     * @param description
     * @param len
     */
    private SequenceEnum(String code, String description, Integer len, String dateFormat) {
        this.code = code;
        this.desc = description;
        this.length = len;
        this.dateFormat = dateFormat;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 获得 length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * 获得 dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * 通过code获取枚举
     *
     * @param code
     * @return IsLeafEnum
     * @throws
     * @since 1.0.0
     */
    public static SequenceEnum getByCode(String code) {
        for (SequenceEnum yesNo : values()) {
            if (yesNo.getCode().equals(code)) {
                return yesNo;
            }
        }
        return null;
    }

}
