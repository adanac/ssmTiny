package com.adanac.ssm.common.domain.enums;

/**
 * @author Jimmy Shan
 * @date 2015-07-13
 * @desc 对应obd_order_status表type字段
 */
public enum OrderStatusTypeEnum {
	
	RECEIVING_ORDER(1, "接收订单"),
	POSITIONING_COMPLETE(2, "定位完成"),
	SCHOOL_WORK(3, "派工完成 "),
	PICK_UP_TH_GOODS(4, "开始拣货"),
	PICK_UP(5, "拣货完成"),
	START_CHECKING(6, "开始复核"),
	REVIEW_COMPLETION(7, "复核完成"),
	ALREADY_OUT_OF_THE_LIBRARY(8, "已出库"),
	CUSTOMER_CANCEL(9, "客户取消"),
	WAREHOUSE_CANCEL(10, "仓库取消");
	
	private final Integer code;
    private final String desc;
    
    private OrderStatusTypeEnum(Integer code, String desc) {
    	this.code = code;
    	this.desc = desc;
    }

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	/**
     * 通过code获取枚举
     * @param code
     */
    public static OrderStatusTypeEnum getByCode(Integer code) {
        for(OrderStatusTypeEnum status : values()) {
            if(status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
	
}