package com.adanac.ssm.common.domain.enums;

/**
 * @author wangyansong
 * @date 2014-10-08
 * @desc 出库定位状态 枚举
 */
public enum AllocationStatusEnum 
{

	INIT(1,"初始"),
	ASSIGNED(2,"已派工"),
    PICKED(3,"已拣货"),
	INVALID(4,"已作废");
	
	private final Integer code;
    private final String desc;
    
    private AllocationStatusEnum(Integer code, String desc)
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
    public static AllocationStatusEnum getByCode(String code)
    {
        for (AllocationStatusEnum status : values())
        {
            if (status.getCode().equals(code))
            {
                return status;
            }
        }
        return null;
    }
}
