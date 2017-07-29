package com.adanac.ssm.common.domain.enums;

/**
 * @author admin
 * @date 2016/05/31
 * @desc 出库波次状态 枚举
 */
public enum WaveStatusEnum {

    WAITINGCAR(0, "待派车"),
    INIT(1,"初始"),
	PARTIALCOMPLETED(2,"待补货"),
    HAVE_ALLOCATION(3,"已分配"),
	HAVE_WORK(4,"已派工"),
    POSITING(98,"定位中"),
    INVALID(99,"已作废"),
	;

	private final Integer code;
    private final String desc;
    
    private WaveStatusEnum(Integer code, String desc)
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
    public static WaveStatusEnum getByCode(Integer code)
    {
        for (WaveStatusEnum status : values())
        {
            if (status.getCode().intValue() == code)
            {
                return status;
            }
        }
        return null;
    }
}
