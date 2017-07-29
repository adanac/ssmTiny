package com.adanac.ssm.common.domain.constant;

import java.util.Date;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-05-24
 * Desc:    WMS特有常量信息
 */
public class WmsConstants {

	/**
	 * 默认货主信息 (主键、编码、名称)
	 */
	public static final Long DEFAULT_COMPANY_SYS_NO = 1L;
	public static final String DEFAULT_COMPANY_CODE = "1";
	public static final String DEFAULT_COMPANY_NAME = "孩子王";
	public static final String DEFAULT_COMPANY_ADDRESS = "江苏省南京市中山东路311-2号五星控股大厦";

	/**
	 * 环境
	 */
	public static final String ENV_DEVELOP = "develop";
	public static final String ENV_DEMO = "demo";
	public static final String ENV_TEST = "test";
	public static final String ENV_PRODUCTION = "production";

	/**
	 * "KWMS 机器标识环境变量" 的名称
	 */
	public static final String KWMS_MACHINE_ID = "KWMS_MACHINE_ID";

	/**
	 * 应用标识
	 */
	public static final String KWMS = "KWMS";

	/**
	 * 订单系统 OMS
	 */
	public static final String OMS = "OMS";

	/**
	 * ERP
	 */
	public static final String ERP = "ERP";

	/**
	 * 计费系统 KTBMS
	 */
	public static final String KTBMS = "KTBMS";

	/**
	 * 孩子王的 sellerId
	 */
	public static final Integer SELLER_ID_HZW = 3;

	/**
	 * KWMS 开通的仓库
	 */
	public static final String KWMS_WAREHOUSE = "kwms_warehouse";

	/**
	 * 运费的商品编码
	 */
	public static final String TRANSPORTATION_GOODS_CODE = "800001";

	/**
	 * OMS 赠品类型
	 */
	public static final String OMS_GIFT_GOODS_TYPE = "1";

	/**
	 * 基础数据同步的默认参照时间
	 */
	public static final Date SYNC_INITIAL_DATE = new Date(0, 0, 1);

	/**
	 * 库存冻结
	 */
	public static final String INVENTORY_IS_HOLD = "1";

	/**
	 * 库存未冻结
	 */
	public static final String INVENTORY_NOT_HOLD = "0";

	/**
	 * 默认开票内容
	 */
	public static final String DEFAULT_INVOICE_DETAIL = "商品明细";

	/**
	 * 订单下发 LOGGER NAME
	 */
	public static final String LOG_ORDER_DOWN = "order.down";

	/**
	 * 订单落地 LOGGER NAME
	 */
	public static final String LOG_ORDER_PRODUCE = "order.produce";

	/**
	 * 订单取消 LOGGER NAME
	 */
	public static final String LOG_ORDER_CANCEL = "order.cancel";

	/**
	 * mst_wh_sku 表的数据落地时带上的默认分配策略名称
	 */
	public static final String DEFAULT_ALLOCATION_STRATEGY = "标准分配策略";

	/**
	 * mst_wh_sku 表的数据落地时带上的默认上架策略名称
	 */
	public static final String DEFAULT_PUTAWAY_STRATEGY = "标准上架策略";

	/**
	 * 仓库商品表 mst_wh_sku 的默认上架储位
	 */
	public static final String DEFAULT_PUTAWAY_LOCATION_NO = "9999";

	/**
	 * 顺丰分站默认编码
	 */
	public static final String DEFAULT_SF_DELIVERY_NO = "0030";

	/**
	 * 韵达分站默认编码
	 */
	public static final String DEFAULT_YD_DELIVERY_NO = "0001";

	/**
	 * SKU_PRODUCT 商品包装规则信息提交的锁前缀
	 */
	public static final String LOCK_SKU_PRODUCT_PREFIX = "LOCK_SKU_PRODUCT_PREFIX_";

	/**
	 * PDA 拣货服务领取的锁前缀
	 */
	public static final String LOCK_PDA_PICK_GET_PREFIX = "LOCK_PDA_PICK_GET_";

	/**
	 * PDA 移动服务领取的锁前缀
	 */
	public static final String LOCK_PDA_MOVE_GET_PREFIX = "LOCK_PDA_MOVE_GET_";

	/**
	 * PDA 盘点服务领取的锁前缀
	 */
	public static final String LOCK_PDA_CC_GET_PREFIX = "LOCK_PDA_CC_GET_";

	/**
	 * PDA 拣货服务提交的锁前缀
	 */
	public static final String LOCK_PDA_PICK_SUBMIT_PREFIX = "LOCK_PDA_PICK_SUBMIT_";

	/**
	 * PDA 移动服务提交的锁前缀
	 */
	public static final String LOCK_PDA_MOVE_SUBMIT_PREFIX = "LOCK_PDA_MOVE_SUBMIT_";

	/**
	 * PDA 盘点服务提交的锁前缀
	 */
	public static final String LOCK_PDA_CC_SUBMIT_PREFIX = "LOCK_PDA_CC_SUBMIT_";

	/**
	 * PDA 快速移动-按商品移动的锁前缀
	 */
	public static final String LOCK_PDA_MOVE_BY_SKU_PREFIX = "LOCK_PDA_MOVE_BY_SKU_";

	/**
	 * PDA 快速移动-整储位移动的锁前缀
	 */
	public static final String LOCK_PDA_MOVE_BY_LOCATION_PREFIX = "LOCK_PDA_MOVE_BY_LOCATION_";

	/**
	 * PDA 盘点任务执行-滚盘提交的锁前缀
	 */
	public static final String LOCK_PDA_CC_ROLL_PREFIX = "LOCK_PDA_CC_ROLL_";

	/**
	 * PDA 滚动盘点提交的锁前缀
	 */
	public static final String LOCK_PDA_ROLL_CC_PREFIX = "LOCK_PDA_ROLL_CC_";

	/**
	 * PDA 上架提交的锁前缀
	 */
	public static final String LOCK_PDA_PUTAWAY_PREFIX = "LOCK_PDA_PUTAWAY_";

	/**
	 * PC端库存加工分配的锁前缀
	 */
	public static final String LOCK_PC_PROCESSING_ALLOCATE_PREFIX = "LOCK_PC_PROCESSING_ALLOCATE_";

	/**
	 * PC端库存加工执行的锁前缀
	 */
	public static final String LOCK_PC_PROCESSING_EXECUTE_PREFIX = "LOCK_PC_PROCESSING_EXECUTE_";

	/**
	 * 领取补货任务
	 */
	public static final String LOCK_PDA_REP_GETTASK_PREFIX = "LOCK_PDA_REP_GETTASK_EXECUTE_";

	/**
	 * 完成补货任务
	 */
	public static final String LOCK_PDA_REP_COMPLETETASK_PREFIX = "LOCK_PDA_REP_COMPLETETASK_EXECUTE_";

	/**
	 * 补货 库存盘点
	 */
	public static final String LOCK_PDA_REP_CHECKINV_PREFIX = "LOCK_PDA_REP_CHECKINV_EXECUTE_";

	/**
	 * 新增波次执行的锁前缀
	 */
	public static final String LOCK_PC_WAVE_ADD_PREFIX = "LOCK_PC_WAVE_ADD_EXECUTE_";

	/**
	 * 波次定位执行的锁前缀
	 */
	public static final String LOCK_PC_WAVE_ALLOCATE_PREFIX = "LOCK_PC_WAVE_ALLOCATE_EXECUTE_";

	/**
	 * 波次派工执行的锁前缀
	 */
	public static final String LOCK_PC_WAVE_ASSIGNTASK_PREFIX = "LOCK_PC_WAVE_ASSIGNTASK_EXECUTE_";

	/**
	 * 波次手动剔除补货执行的锁前缀
	 */
	public static final String LOCK_PC_WAVE_DELREPLENISHMENT_PREFIX = "LOCK_PC_WAVE_DELREPLENISHMENT_EXECUTE_";

	/**
	 * 波次打印执行的锁前缀
	 */
	public static final String LOCK_PC_WAVE_PRINT_PREFIX = "LOCK_PC_WAVE_PRINT_EXECUTE_";

	/**
	 * 分拨校验包裹执行的锁前缀
	 */
	public static final String LOCK_PC_ALLOCATE_CARTON_CHECK_PREFIX = "LOCK_PC_ALLOCATE_CARTON_CHECK_EXECUTE_";

	/**
	 * 分拨删除包裹执行的锁前缀
	 */
	public static final String LOCK_PC_ALLOCATE_CARTON_DELETE_PREFIX = "LOCK_PC_ALLOCATE_CARTON_DELETE_EXECUTE_";

	/**
	 * 完成分拨并打印执行的锁前缀
	 */
	public static final String LOCK_PC_ALLOCATE_COMPLETE_ALLOCATE_PREFIX = "LOCK_PC_ALLOCATE_COMPLETE_ALLOCATE_EXECUTE_";

	/**
	 * 发货单确认发货执行的锁前缀
	 */
	public static final String LOCK_PC_ALLOCATE_COMPLETE_SHIP_PREFIX = "LOCK_PC_ALLOCATE_COMPLETE_SHIP_EXECUTE_";

	/**
	 * 包裹异常执行的锁前缀
	 */
	public static final String LOCK_PC_CARTON_EXCEPTION_PREFIX = "LOCK_PC_CARTON_EXCEPTION_EXECUTE_";

	/**
	 * 包裹取消执行的锁前缀
	 */
	public static final String LOCK_PC_CARTON_CANCEL_PREFIX = "LOCK_PC_CARTON_CANCEL_EXECUTE_";

	/**
	 * 包裹面贴打印执行的锁前缀
	 */
	public static final String LOCK_PC_CARTON_SURFACEPRINT_PREFIX = "LOCK_PC_CARTON_SURFACEPRINT_EXECUTE_";

	/**
	 * 新增发货单执行的锁前缀
	 */
	public static final String LOCK_PC_DISTRIBUTION_ADD_PREFIX = "LOCK_PC_DISTRIBUTION_ADD_EXECUTE_";

	/**
	 * 打印发货单执行的锁前缀
	 */
	public static final String LOCK_PC_DISTRIBUTION_PRINT_PREFIX = "LOCK_PC_DISTRIBUTION_PRINT_EXECUTE_";

	/**
	 * 异常签收执行的锁前缀
	 */
	public static final String LOCK_PC_EXCEPTION_ACCEPT_PREFIX = "LOCK_PC_EXCEPTION_ACCEPT_EXECUTE_";

	/**
	 * 异常再定位执行的锁前缀
	 */
	public static final String LOCK_PC_EXCEPTION_REALLOCATE_PREFIX = "LOCK_PC_EXCEPTION_REALLOCATE_EXECUTE_";

	/**
	 * 异常确认有货执行的锁前缀
	 */
	public static final String LOCK_PC_EXCEPTION_CONFIRMGOODSAVAIL_PREFIX = "LOCK_PC_EXCEPTION_CONFIRMGOODSAVAIL_EXECUTE_";

	/**
	 * 异常确认缺货执行的锁前缀
	 */
	public static final String LOCK_PC_EXCEPTION_CONFIRMGOODSLACK_PREFIX = "LOCK_PC_EXCEPTION_CONFIRMGOODSLACK_EXECUTE_";

	/**
	 * 异常库内反架执行的锁前缀
	 */
	public static final String LOCK_PC_EXCEPTION_RETURNGOODS_PREFIX = "LOCK_PC_EXCEPTION_RETURNGOODS_EXECUTE_";

	/**
	 * 异常合流完成执行的锁前缀
	 */
	public static final String LOCK_PC_EXCEPTION_CFCOMPLETION_PREFIX = "LOCK_PC_EXCEPTION_CFCOMPLETION_EXECUTE_";

	/**
	 * 订单修改承运商执行的锁前缀
	 */
	public static final String LOCK_PC_ORDER_CARRIEREIT_PREFIX = "LOCK_PC_ORDER_CARRIEREIT_EXECUTE_";

	/**
	 * 复核扫描订单号执行的锁前缀
	 */
	public static final String LOCK_PC_REVIEW_CHECKORDERNO_PREFIX = "LOCK_PC_REVIEW_CHECKORDERNO_EXECUTE_";

	/**
	 * 复核扫描商品号执行的锁前缀
	 */
	public static final String LOCK_PC_REVIEW_CHECKSKUCODE_PREFIX = "LOCK_PC_REVIEW_CHECKSKUCODE_EXECUTE_";

	/**
	 * 复核完成请求执行的锁前缀
	 */
	public static final String LOCK_PC_REVIEW_COMPLETE_PREFIX = "LOCK_PC_REVIEW_COMPLETE_EXECUTE_";

	/**
	 * 复核完成请求执行的锁前缀
	 */
	public static final String LOCK_PC_REVIEW_COMPLETED_PREFIX = "LOCK_PC_REVIEW_COMPLETED_EXECUTE_";

	/**
	 * 复核缺货货损请求执行的锁前缀
	 */
	public static final String LOCK_PC_REVIEW_EXCEPTION_PREFIX = "LOCK_PC_REVIEW_EXCEPTION_EXECUTE_";

	/**
	 * 分拣扫描波次号请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTING_CHECKWAVE_PREFIX = "LOCK_PC_SORTING_CHECKWAVE_EXECUTE_";

	/**
	 * 分拣扫描商品号请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTING_CHECKSKUCODE_PREFIX = "LOCK_PC_SORTING_CHECKSKUCODE_EXECUTE_";

	/**
	 * 分拣强制结束请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTING_COMPLUSORYEND_PREFIX = "LOCK_PC_SORTING_COMPLUSORYEND_EXECUTE_";

	/**
	 * 线下分拣扫描波次号请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTINGLINE_CHECKWAVENO_PREFIX = "LOCK_PC_SORTINGLINE_CHECKWAVENO_EXECUTE_";

	/**
	 * 线下分拣扫描容器号请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTINGLINE_CHECKLPNNO_PREFIX = "LOCK_PC_SORTINGLINE_CHECKLPNNO_EXECUTE_";

	/**
	 * 线下分拣扫描箱号请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTINGLINE_CHECKBOXNO_PREFIX = "LOCK_PC_SORTINGLINE_CHECKBOXNO_EXECUTE_";

	/**
	 * 线下分拣扫描商品号请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTINGLINE_CHECKSKUCODE_PREFIX = "LOCK_PC_SORTINGLINE_CHECKSKUCODE_EXECUTE_";

	/**
	 * 线下分拣扫描商品包装箱码请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTINGLINE_CHECKSKUBOXNO_PREFIX = "LOCK_PC_SORTINGLINE_CHECKSKUBOXNO_EXECUTE_";

	/**
	 * 线下分拣封箱请求执行的锁前缀
	 */
	public static final String LOCK_PC_SORTINGLINE_SEALINGBOX_PREFIX = "LOCK_PC_SORTINGLINE_SEALINGBOX_EXECUTE_";

	/**
	 * PDA 收货确认的锁前缀
	 */
	public static final String LOCK_PDA_RECEIPT_SAVE_PREFIX = "LOCK_PDA_RECEIPT_SAVE_";

	/**
	 * PDA 栈板确认的锁前缀
	 */
	public static final String LOCK_PDA_RECEIPT_LPNCONFIRM_PREFIX = "LOCK_PDA_RECEIPT_LPNCONFIRM_";

	/**
	 * PDA 收货记录取消的锁前缀
	 */
	public static final String LOCK_PDA_RECEIPT_CANCELRECEIPT_PREFIX = "LOCK_PDA_RECEIPT_CANCELRECEIPT_";

	/**
	 * PDA 批次完验的锁前缀
	 */
	public static final String LOCK_PDA_RECEIPT_LOTCHECKCOMPLETE_PREFIX = "LOCK_PDA_RECEIPT_LOTCHECKCOMPLETE_";

	/**
	 * PDA 上架服务领取的锁前缀
	 */
	public static final String LOCK_PDA_PUTAWAY_GET_PREFIX = "LOCK_PDA_PUTAWAY_GET_";

	/**
	 * PDA 上架创建子任务的锁前缀
	 */
	public static final String LOCK_PDA_PUTAWAY_CREATETASK_PREFIX = "LOCK_PDA_PUTAWAY_CREATETASK_";

	/**
	 * PC 收货确认的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_SAVE_PREFIX = "LOCK_PC_RECEIPT_SAVE_";

	/**
	 * PC 栈板确认的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_LPNCONFIRM_PREFIX = "LOCK_PC_RECEIPT_LPNCONFIRM_";

	/**
	 * PC 收货记录取消的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_CANCELRECEIPT_PREFIX = "LOCK_C_RECEIPT_CANCELRECEIPT_";

	/**
	 * PC 批次完验的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_LOTCHECKCOMPLETE_PREFIX = "LOCK_PC_RECEIPT_LOTCHECKCOMPLETE_";

	/**
	 * PC 整单完验的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_CHECK_PREFIX = "LOCK_PC_RECEIPT_CHECK_";

	/**
	 * PC 收货单作废的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_DEL_PREFIX = "LOCK_PC_RECEIPT_DEL_";

	/**
	 * PC 收货单保存的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_ADD_PREFIX = "LOCK_PC_RECEIPT_ADD_";

	/**
	 * PC 收货单明细保存的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_ADDDETAIL_PREFIX = "LOCK_PC_RECEIPT_ADDDETAIL_";

	/**
	 * PC 收货单明细删除的锁前缀
	 */
	public static final String LOCK_PC_RECEIPT_DELDETAIL_PREFIX = "LOCK_PC_RECEIPT_DELDETAIL_";

	/**
	 * PC 预约单到货签到的锁前缀
	 */
	public static final String LOCK_PC_APPOINTMENT_ACCEPT_PREFIX = "LOCK_PC_APPOINTMENT_ACCEPT_";

	/**
	 * PC 预约单单取消的锁前缀
	 */
	public static final String LOCK_PC_APPOINTMENT_CANCEL_PREFIX = "LOCK_PC_APPOINTMENT_CANCEL_";

	/**
	 * PC 预约单保存的锁前缀
	 */
	public static final String LOCK_PC_APPOINTMENT_SAVE_PREFIX = "LOCK_PC_APPOINTMENT_SAVE_";
}
