package com.adanac.ssm.common.domain.enums;

/**
 * 库存类型枚举
 * @author Administrator
 *
 */
public enum InventoryBackTaskTypeEnum {
	INVBACK_ORDER_CANCEL(0, "订单取消", "wms_orderCancel"),
	INVBACK_OBD_SALE(1, "线上销售出库回传ERP", ""), 
	INVBACK_OBD_SHOP(2, "门店配送出库回传ERP", ""), 
	INVBACK_OBD_TRANSFER(3, "调拨出库回传ERP", ""), 
	INVBACK_OBD_BACK(4, "退供应商出库回传ERP", ""), 
	INVBACK_IBD_PURCHASE(5,"采购入库回传ERP", ""), 
	INVBACK_IBD_TRANSFER(6, "调拨入库回传ERP", ""), 
	INVBACK_IBD_BACK_OFFLINE(7, "退货入库(线下)回传ERP", ""), 
	INVBACK_IBD_BACK_ONLINE(8,"退货入库(线上)回传ERP", ""), 
	INVBACK_MIDDLE_BATCH(9, "批量出库到中台", "wms_batch_sync2MIDDLE"),
	INVBACK_MIDDLE_STOREDELIVERY(10,"门店配送到中台", "wms_storeDelivery_sync2MIDDLE"),
	INVBACK_MIDDLE_BLOCKINVENTORY(11,"冻结库存同步到中台", "wms_blockInventory_sync2MIDDLE"),
	INVBACK_MIDDLE_THAWINVENTORY(12,"解冻库存同步到中台", "wms_thawInventory_sync2MIDDLE"),
	INVBACK_MIDDLE_EXPORTTRANSFER(13,"调拨出库同步到中台", "wms_exportTransfer_sync2MIDDLE"),
	INVBACK_MIDDLE_RETURN_PURCHASE(14, "退供应商出库同步到中台", "wms_returnPurchase_sync2MIDDLE"),
	INVBACK_MIDDLE_CONVERT(15,"商品转换（商品转赠品）同步到中台", "wms_convert_sync2MIDDLE"),
	INVBACK_MIDDLE_IBD_PURCHASE(16,"采购库存同步到中台", "wms_ibdPurchase_sync2MIDDLE"),
	INVBACK_MIDDLE_IBD_TRANSFER(17,"调拨入库同步到中台", "wms_ibdTransfer_sync2MIDDLE"),
	INVBACK_MIDDLE_IBD_BACK_OFFLINE(18,"退货入库（线下）同步到中台", "wms_ibdBackOffline_sync2MIDDLE"),
	INVBACK_MIDDLE_IBD_BACK_ONLINE(19, "退货入库（线上）同步到中台", "wms_ibdBackOnline_sync2MIDDLE"),
	INVBACK_MIDDLE_IBD_BACK_SHELF(20,"返架同步到中台", "wms_ibdBackShelf_sync2MIDDLE"),
	INVBACK_MIDDLE_IBD_DECREASE(21,"仓库盘损同步到中台", "wms_ibdDecrease_sync2MIDDLE"),
	INVBACK_MIDDLE_IBD_INCREASE(22,"仓库盘益同步到中台", "wms_ibdIncrease_sync2MIDDLE"),
	INVBACK_OBD_COMMON(23,"已分配已拣货回传OMS", "wms_obdCommon_sync2OMS"),
	INVBACK_OBD(24,"已出库回传OMS", "wms_obd_sync2OMS"),
	INVBACK_OBD_SF_CONFIRM(25,"顺丰确认接口", "wms_obdSfConfirm_sync2SF"),
	INVBACK_IBD_INVENTORY_ADJUST(26,"损益回传ERP", ""),
	INVBACK_PROCESSING(27, "库内加工", "wms_processing_sync2MIDDLE"),
	INVBACK_OBD_KTBMS(28, "订单包裹信息下发计费系统KTBMS", "wms_obd_sync2KTBMS"),
	INVBACK_IBD_KF_CONFIRM(29, "退货入库收货完成调用客服接口", "wms_ibdKfConfirm_sync2KF");

	/**
	 * 状态编码
	 */
	private Integer code;

	/**
	 * 状态名称
	 */
	private String name;
	
	/**
	 * 类型类型名称
	 */
	private String typeName;

	/**
	 * 构造函数
	 */
	InventoryBackTaskTypeEnum(Integer code, String name, String typeName) {
		this.code = code;
		this.name = name;
		this.typeName = typeName;
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
	 * 获得回传中台的单号前缀
	 */
	public Integer getBackId() {
		return code + 10;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public static String getName(Integer code) {
        if (null != code) {
            for (InventoryBackTaskTypeEnum mnum : values()) {
                if (mnum.getCode().equals(code)) {
                    return mnum.getName();
                }
            }
        }
        return null;
    }
}
