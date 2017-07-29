package com.adanac.ssm.common.domain.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yejiabin
 * @date 2016-03-02
 * @desc 日期格式类
 */
public class DateUtil
{
    /**
     * @param dt DATE日期类型
     * @param showTime 标识  true=yyyy-MM-dd HH:mm:ss  false=yyyy-MM-dd
     * @return
     * @desc 指定日期格式
     */
    public static String formatDate(java.util.Date dt, boolean showTime)
    {
        if (showTime)
            return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(dt);
        else
            return (new SimpleDateFormat("yyyy-MM-dd")).format(dt);
    }

    /**
     * @return
     * @desc 格式当前月份
     */
    public static String formatNowMonth()
    {
        String m = (new SimpleDateFormat("yyyy/MM")).format(new java.util.Date());
        String ms[] = m.split("\\/");
        if (ms[1].substring(0, 1).equals("0"))
        {
            m = ms[0] + "年" + ms[1].replace("0", "") + "月";
        }
        else
        {
            m = ms[0] + "年" + ms[1] + "月";
        }

        return m;
    }

    /**
     * @return
     * @desc 格式当前年
     */
    public static String formatNowYear()
    {
        String m = (new SimpleDateFormat("yyyy年")).format(new java.util.Date());
        return m;
    }

    /**
     * @param showTime 标识 true=yyyy-MM-dd HH:mm:ss  false=yyyy-MM-dd
     * @return
     * @desc 当前日期格式
     */
    public static String formatNow(boolean showTime)
    {
        if (showTime)
            return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new java.util.Date());
        else
            return (new SimpleDateFormat("yyyy-MM-dd")).format(new java.util.Date());
    }

    /**
     * @param showTime 标识 true=yyyy-MM-dd HH:mm:ss  false=yyyy-MM-dd
     * @return
     * @desc 中国当前日期格式
     */
    public static String formatNow_CH(boolean showTime)
    {
        if (showTime)
            return (new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒")).format(new java.util.Date());
        else
            return (new SimpleDateFormat("yyyy年MM月dd日")).format(new java.util.Date());
    }

    /**
     * @param dt
     * @return 
     * @desc 格式指定日期首时间00:00:00
     */
    public static String formatDateFirstTime(java.util.Date dt)
    {
        return (new SimpleDateFormat("yyyy-MM-dd")).format(dt) + " 00:00:00";
    }

    /**
     * @param dt
     * @return 
     * @desc 格式指定日期未时间23:59:59
     */
    public static String formatDateLastTime(java.util.Date dt)
    {
        return (new SimpleDateFormat("yyyy-MM-dd")).format(dt) + " 23:59:59";
    }

    /**
     * @param date 日期类型
     * @param format 格式样式
     * @return
     * @desc 自定义日期样式
     */
    public static String formatDateType(java.sql.Date date, String format)
    {
        if (date == null)
        {
            return null;
        }
        SimpleDateFormat myFormat = new SimpleDateFormat(format);
        return myFormat.format(date);
    }
    
    /**
     * @param date 日期类型
     * @param format 格式样式
     * @return
     * @desc 自定义日期样式
     */
    public static String formatDateType(java.util.Date date, String format)
    {
        if (date == null)
        {
            return null;
        }
        SimpleDateFormat myFormat = new SimpleDateFormat(format);
        return myFormat.format(date);
    }

    /**
     * 日期格式转换
     * @param opTime
     * @return
     */
    public static String dateTransfer(String opTime)
    {
        if (StringUtils.isNotEmpty(opTime))
        {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = sdf.parse(opTime);
                sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                return sdf.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return "";
    }

}
