/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package com.adanac.ssm.common.domain.enums;

/*
 * 上架规则类型枚举值
 */
public enum MstPutawayRule
{
    /*
    0   商品拣选位依体积
    1   空拣选位
    2   同商品储位依体积
    3   空存储位 
     */
    PICKLOCATION(1, "同商品拣选位依体积"),
    NULL_PICKLOCATION(2, "空拣选位"),
    STORELOCATION(3, "同商品存储位依体积"),
    NULL_STORELOCATION(4, "空存储位"),
    //ZT_SAMECARRIERCODE(5, "同承运商依储位"),
    ZT_FREEZE_STORELOCATION(6, "同商品冻结储位依体积"),
    NULL_FREEZE_SAMECARRIERCODE(7, "空冻结储位"),
    ;
    
    private final Integer code;
    private final String desc;
    
    private MstPutawayRule(Integer code, String description)
    {
        this.code = code;
        this.desc = description;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getDesc()
    {
        return desc;
    }

    public static MstPutawayRule getByCode(String code)
    {
        for (MstPutawayRule yesNo : values())
        {
            if (yesNo.getCode().equals(code))
            {
                return yesNo;
            }
        }
        return null;
    }
    
    /**
     * 通过code获取枚举
     *
     * @param code
     */
    public static MstPutawayRule getByCode(Integer code) {
        for (MstPutawayRule status : values()) {
            if (status.getCode().intValue() == code) {
                return status;
            }
        }
        return null;
    }
}
