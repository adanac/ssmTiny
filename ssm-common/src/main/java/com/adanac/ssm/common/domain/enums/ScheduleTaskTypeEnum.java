package com.adanac.ssm.common.domain.enums;

import com.adanac.ssm.common.domain.util.StringUtils;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-04-05
 * Desc:    任务调度类型
 */
public enum ScheduleTaskTypeEnum {

    OBD_SALE("OBD_SALE", "线上销售出库"),
    OBD_SHOP("OBD_SHOP", "门店配送出库"),
    OBD_TRANSFER("OBD_TRANSFER", "调拨出库"),
    OBD_BACK("OBD_BACK", "退供应商出库"),
    IBD_PURCHASE("IBD_PURCHASE", "采购入库"),
    IBD_TRANSFER("IBD_TRANSFER", "调拨入库"),
    IBD_BACK_OFFLINE("IBD_BACK_OFFLINE", "退货入库(线下)"),
    IBD_BACK_ONLINE("IBD_BACK_ONLINE", "退货入库(线上)"),

    SYNC_SKU("SYNC_SKU", "商品同步"),
    SYNC_SKU_COMPENSATE("SYNC_SKU_COMPENSATE", "商品同步补偿"),

    SYNC_WH("SYNC_WH", "仓库同步"),
    SYNC_WH_COMPENSATE("SYNC_WH_COMPENSATE", "仓库同步补偿"),

    SYNC_SHOP("SYNC_SHOP", "门店同步"),
    SYNC_SHOP_COMPENSATE("SYNC_SHOP_COMPENSATE", "门店同步补偿"),

    SYNC_HUB("SYNC_HUB", "分站同步"),
    SYNC_HUB_COMPENSATE("SYNC_HUB_COMPENSATE", "分站同步补偿"),

    SYNC_ADDRESS("SYNC_ADDRESS", "四级地址同步"),
    SYNC_ADDRESS_COMPENSATE("SYNC_ADDRESS_COMPENSATE", "四级地址同步补偿"),

    SYNC_VENDOR("SYNC_VENDOR", "供应商同步"),
    SYNC_VENDOR_COMPENSATE("SYNC_VENDOR_COMPENSATE", "供应商同步补偿"),

    SYNC_CARRIER("SYNC_CARRIER", "承运商同步"),
    SYNC_CARRIER_COMPENSATE("SYNC_CARRIER_COMPENSATE", "承运商同步补偿"),
    
    SYNC_CARRIER_EXPRESS_ACCOUNT("SYNC_CARRIER_EXPRESS_ACCOUNT", "承运商同步wms计费系统"),
    SYNC_CARRIER_COMPENSATE_EXPRESS_ACCOUNT("SYNC_CARRIER_COMPENSATE_EXPRESS_ACCOUNT", "承运商同步补偿wms计费系统"),
    
    SYNC_WH_EXPRESS_ACCOUNT("SYNC_WH_EXPRESS_ACCOUNT", "仓库同步wms计费系统"),
    SYNC_WH_COMPENSATE_EXPRESS_ACCOUNT("SYNC_WH_COMPENSATE_EXPRESS_ACCOUNT", "仓库同步补偿wms计费系统"),
    
    SYNC_ADDRESS_EXPRESS_ACCOUNT("SYNC_ADDRESS_EXPRESS_ACCOUNT", "四级地址同步wms计费系统"),
    SYNC_ADDRESS_COMPENSATE_EXPRESS_ACCOUNT("SYNC_ADDRESS_COMPENSATE_EXPRESS_ACCOUNT", "四级地址同步补偿wms计费系统"),
    
    IBD_FEEDBACK("IBD_FEEDBACK", "入库回传ERP"),
    OBD_FEEDBACK("OBD_FEEDBACK", "出库回传ERP"),
    
    //回传OMS
    OBD_OMS_COMMON("OBD_OMS_COMMON", "已分配已拣货已包装已签收回传OMS"),
    OBD_OMS("OBD_OMS", "已出库回传OMS"),
    
    //上报KMonitor监控平台
    REPORT_KMONITOR("REPORT_KMONITOR", "上报KMonitor监控平台"),
    
    //库存同步到中台
    OBD_MIDDLE_BATCH("OBD_MIDDLE_BATCH", "出库到中台"),
    OBD_MIDDLE_STOREDELIVERY("OBD_MIDDLE_STOREDELIVERY", "门店配送到中台"),
    
    INV_REP("INV_REP", "补货任务"),
    INV_RE_ALLOCATE("INV_RE_ALLOCATE", "再分配"),
    INV_CLEAN_INVENTORY("INV_CLEAN_INVENTORY", "清理空库存记录"),

    OBD_SF_CONFIRM("OBD_SF_CONFIRM", "顺丰确认接口"),
    
    INV_MOVE_REP("INV_MOVE_REP", "效期管理"),

    EXPIRED_ORDER("EXPIRED_ORDER", "过期订单失效处理");

    /**
     * 状态编码
     */
    private String code;

    /**
     * 状态名称
     */
    private String name;

    /**
     * 构造函数
     */
    ScheduleTaskTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 获得 code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置 code
     */
    public void setCode(String code) {
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

    public static String getName(String code) {
        if (StringUtils.isNotEmpty(code.trim())) {
            for (ScheduleTaskTypeEnum mnum :values()) {
                if (mnum.getCode().equals(code)) {
                    return  mnum.getName();
                }
            }
        }
        return "";
    }

}
