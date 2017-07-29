package com.adanac.ssm.common.domain.util;

import com.adanac.ssm.common.domain.constant.StringConstants;
import com.adanac.ssm.common.domain.enums.InventoryBackTaskTypeEnum;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-02-27
 * Desc:    字符串工具
 */
public class StringUtils {

    private static final String REG_EX_DIGITAL = "[^0-9]";

    /**
     * 获取非空内容
     *
     * @param str 输入字符串
     * @return 非空字符串
     */
    public static String getValidString(String str) {
        return (str == null) ? "" : str;
    }

    /**
     * 字符串是否为空
     *
     * @param str 输入字符串
     * @return 若为空返回 true
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 字符串是否非空
     *
     * @param str 输入字符串
     * @return 若非空返回 true
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 将 string list 内容拼接打印
     *
     * @param strList         字符串数组
     * @param concatCharacter 连接字符
     * @return 拼接后的字符串
     */
    public static String concatStrFromList(List<String> strList, String concatCharacter) {
        if (concatCharacter == null)
            concatCharacter = StringConstants.DEFAULT_STRING_SEPARATOR;

        if (strList != null && !strList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = strList.size();

            for (int i = 0; i < size; ++i) {
                sb.append(strList.get(i));
                if (i < size - 1)
                    sb.append(concatCharacter);
            }
            return sb.toString();
        }
        return StringConstants.EMPTY_STRING;
    }

    /**
     * 提取字符串中的数字序列
     *
     * @param inputStr 待处理的字符串
     * @return 提取出的数字序列
     */
    public static String extractDigitalNumbers(String inputStr) {
        Pattern p = Pattern.compile(REG_EX_DIGITAL);
        Matcher m = p.matcher(inputStr);
        return m.replaceAll(StringConstants.EMPTY_STRING).trim();
    }

    /**
     * 根据单据号和序列枚举构建传给中台的订单号 （做幂等使用）
     *
     * @param orderNo      单据号
     * @param taskTypeEnum 任务类型
     * @return 返回中台的单据号
     */
    public static Long constructAoOrderNo(String orderNo, InventoryBackTaskTypeEnum taskTypeEnum) {
        String seq = taskTypeEnum.getBackId() + extractDigitalNumbers(orderNo);
        return Long.valueOf(seq);
    }

    /**
     * 格式化日期类型字符串
     * @param date
     * @return
     */
    public static String formatDate(String date) {
    	return date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
    }

    /**
     * 将异常Exception 或 错误Error 的堆栈信息转为字符串
     *
     * @param e 异常或错误
     * @return 堆栈
     */
    public static String getErrorInfoFromException(Throwable e) {
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            return sw.toString();
        } catch (Throwable e2) {
            return StringConstants.EMPTY_STRING;
        }
    }

    public static void main(String[] args) {
//        System.out.println(extractDigitalNumbers("CKYC201611140000003"));
//        System.out.println(constructAoOrderNo("CKYC201611140000003", InventoryBackTaskTypeEnum.INVBACK_PROCESSING));
//        System.out.println(getErrorInfoFromException(new RuntimeException("test123")));
        List<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println(concatStrFromList(arr, StringConstants.COMMA));
    }
}
