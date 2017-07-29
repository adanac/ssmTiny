package com.adanac.ssm.common.domain.enums;

/**
 * @author yejiabin
 * @date 2016-03-02
 * @desc 出库订单状态 枚举
 */
public enum OrderStatusEnum {

	WAITINGCAR(0, "待派车"),
	INIT(1, "初始"),
	READYTOLOCATE(2, "已加入波次"),
	LOCATED(3, "已分配"),
	ASSIGNED(4, "已派工"),
	PICKING(5, "开始拣货"),
	PICKED(6, "拣货完成"),
	SORTING(7, "已分拣"),
	CONFIRMING(8, "开始复核"),
	COMFIRMED(9, "复核完成"),
    ALLOTING(10,"开始分拨"),
    ALLOTED(11,"分拨完成"),
    SHIPING(12,"开始发货"),
    SHIPED(13,"发货完成"),
    SIGNED(14,"已签收"),
	CUSTOMERCANCELED(98, "客户取消"),
	WHCANCELED(99, "仓库取消"), ;

	private final Integer code;
    private final String desc;
    
    private OrderStatusEnum(Integer code, String desc)
    {
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
    public static OrderStatusEnum getByCode(Integer code)
    {
        for (OrderStatusEnum status : values())
        {
            if (status.getCode().intValue() == code)
            {
                return status;
            }
        }
        return null;
    }
}
