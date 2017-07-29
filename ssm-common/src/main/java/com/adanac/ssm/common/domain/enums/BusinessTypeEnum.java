package com.adanac.ssm.common.domain.enums;

/**
 * @author liguangyang
 * @date 2016-06-07
 * @desc 业务类型 枚举
 */
public enum BusinessTypeEnum {
	ONE(1, "采购按单"),
	TWO(2, "采购按板"),
	THREE(3, "采配按单"),
	FOUR(4, "采配按板"),
	FIVE(5, "退货入库"),
	SIX(6, "备件库入"),
	SEVEN(7, "仓间调拨入"),
	EIGHT(8, "盘盈");
	
	private final Integer code;
    private final String desc;
    
    private BusinessTypeEnum(Integer code, String desc)
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
    public static String getDescByCode(Integer code)
    {
        for (BusinessTypeEnum status : values())
        {
            if (status.getCode().equals(code))
            {
                return status.getDesc();
            }
        }
        return null;
    }
}
