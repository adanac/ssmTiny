package com.adanac.ssm.common.domain.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.adanac.ssm.common.domain.enums.OrderTypeEnum;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import org.apache.commons.codec.binary.Base64;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author yejiabin
 * @date 2016-03-02
 * @desc 工具类
 */
public class Utils {

    /**
     * 根据传入的json字符串和实体对象的类型，将json解析成list返回
     *
     * @param json
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> List<T> convertToList(String json, Class<T[]> cls) {
        List<T> list = null;  //目标list
        T[] arr = null; //ObjectMapper无法将json直接解析成对象的list，
        //因此需要先将其解析成对象数组，
        //再通过Arrays.asList转换成对象List
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            list = Arrays.asList(mapper.readValue(json, cls)); //执行转换
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * @param d
     * @return 数字格式，保留2位小数，格式：####.##
     */
    public static String formatNumberByDecimal3(Double d) {
        String s = "";
        String pattern = "####.##";
        try {
            if (d == null) {
                return null;
            }
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，保留2位小数，格式：####.##
     */
    public static String formatNumberByDecimal3(double d) {
        String s = "";
        String pattern = "####.##";
        try {
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，不保留小数，格式：####
     */
    public static String formatNumberByNoDecimal2(Double d) {
        String s = "";
        String pattern = "####";
        try {
            if (d == null) {
                return null;
            }
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，不保留小数，格式：####
     */
    public static String formatNumberByNoDecimal2(double d) {
        String s = "";
        String pattern = "####";
        try {
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，不保留小数，格式：#,###
     */
    public static String formatNumberByNoDecimal(double d) {
        String s = "";
        String pattern = "#,###";
        try {
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，不保留小数，格式：#,###
     */
    public static String formatNumberByNoDecimal(Double d) {
        String s = "";
        String pattern = "#,###";
        try {
            if (d == null) {
                return null;
            }
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，保留2位小数，格式：#,###.##
     */
    public static String formatNumberByDecimal2(Double d) {
        String pattern = "#,###.##";
        String s = "";
        try {
            if (d == null) {
                return null;
            }
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            nf.setMinimumFractionDigits(2);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，保留2位小数，格式：#,###.##
     */
    public static String formatNumberByDecimal2(double d) {
        String pattern = "#,###.##";
        String s = "";
        try {
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            nf.setMinimumFractionDigits(2);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，保留4位小数，格式：#,###.####
     */
    public static String formatNumberByDecimal4(double d) {
        String pattern = "#,###.####";
        String s = "";
        try {
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            nf.setMinimumFractionDigits(2);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param d
     * @return 数字格式，保留4位小数，格式：#,###.####
     */
    public static String formatNumberByDecimal4(Double d) {
        String pattern = "#,###.####";
        String s = "";
        try {
            if (d == null) {
                return null;
            }
            DecimalFormat nf = (DecimalFormat) NumberFormat.getInstance();
            nf.setRoundingMode(RoundingMode.HALF_UP);
            nf.applyPattern(pattern);
            nf.setMinimumFractionDigits(2);
            s = nf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * @param str
     * @return 小数位数不足补0(保留小数4位)
     */
    public static String fillBits4(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String s1 = str.substring(str.lastIndexOf(".") + 1, str.length());
        if (s1.length() >= 4) {
            return str;
        }

        if (s1.length() == 2) {
            str += "00";
        } else if (s1.length() == 3) {
            str += "0";
        }

        return str;
    }

    /**
     * @param str
     * @return 小数位数不足补0(保留小数4位)
     */
    public static String fillBits2(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }

        if (str.indexOf(".") > -1) {
            String s1 = str.substring(str.lastIndexOf(".") + 1, str.length());
            if (s1.length() >= 2) {
                return str;
            }
            if (s1.length() == 0) {
                str += ".00";
            } else if (s1.length() == 1) {
                str += "0";
            }
        } else {
            str += ".00";
        }

        return str;
    }


    public static String fillSeqNo(String seqNo, int len) {
        if (StringUtils.isEmpty(seqNo)) {
            return null;
        }

        if (seqNo.length() == len) {
            return seqNo;
        }

        if (len > seqNo.length()) {
            int c = len - seqNo.length();
            for (int i = 0; i < c; i++) {
                seqNo = "0" + seqNo;
            }
        }

        return seqNo;
    }

    /**
     * @param s1
     * @param s2
     * @return
     * @desc 对比字符串是否相等 true相等 false不等,两参数为null返回true
     */
    public static boolean compareToString(String s1, String s2) {
        if (StringUtils.isNotEmpty(s1) && StringUtils.isNotEmpty(s2)) {
            if (s1.equals(s2)) {
                return true;
            }
        }

        if (StringUtils.isEmpty(s1) && StringUtils.isEmpty(s2)) {
            return true;
        }

        return false;
    }

    /**
     * @param d1
     * @param d2
     * @return
     * @desc 对比Double是否相等,
     * 0: 未知
     * 1: 1>2
     * 2: 1<2
     * 3: 1=2
     * 4: 1为null, 2有值
     * 5: 1有值， 2为null
     * 6： 1和2都为null
     */
    public static String compareToDouble(Double d1, Double d2) {
        if (d1 != null && d2 != null) {
            if (d1.doubleValue() > d2.doubleValue()) {
                return "1";
            } else if (d1.doubleValue() < d2.doubleValue()) {
                return "2";
            } else {
                return "3";
            }
        }

        if (d1 == null && d2 != null) {
            return "4";
        }

        if (d1 != null && d2 == null) {
            return "5";
        }

        if (d1 == null && d2 == null) {
            return "6";
        }

        return "0";
    }

    /**
     * @param d1
     * @param d2
     * @return
     * @desc 对比Integer是否相等,
     * 0: 未知
     * 1: 1>2
     * 2: 1<2
     * 3: 1=2
     * 4: 1为null, 2有值
     * 5: 1有值， 2为null
     * 6： 1和2都为null
     */
    public static String compareToInteger(Integer d1, Integer d2) {
        if (d1 != null && d2 != null) {
            if (d1.intValue() > d2.intValue()) {
                return "1";
            } else if (d1.intValue() < d2.intValue()) {
                return "2";
            } else {
                return "3";
            }
        }

        if (d1 == null && d2 != null) {
            return "4";
        }

        if (d1 != null && d2 == null) {
            return "5";
        }

        if (d1 == null && d2 == null) {
            return "6";
        }

        return "0";
    }

    /**
     * @param d1
     * @param d2
     * @return
     * @desc 对比Long是否相等,
     * 0: 未知
     * 1: 1>2
     * 2: 1<2
     * 3: 1=2
     * 4: 1为null, 2有值
     * 5: 1有值， 2为null
     * 6： 1和2都为null
     */
    public static String compareToLong(Long d1, Long d2) {
        if (d1 != null && d2 != null) {
            if (d1.longValue() > d2.longValue()) {
                return "1";
            } else if (d1.longValue() < d2.longValue()) {
                return "2";
            } else {
                return "3";
            }
        }

        if (d1 == null && d2 != null) {
            return "4";
        }

        if (d1 != null && d2 == null) {
            return "5";
        }

        if (d1 == null && d2 == null) {
            return "6";
        }

        return "0";
    }

    public static double trimDoubleValue(Double value) {
        if (value == null) {
            return 0.00;
        } else {
            return value.doubleValue();
        }
    }

    public static int trimIntegerValue(Integer value) {
        if (value == null) {
            return 0;
        } else {
            return value.intValue();
        }
    }

    public static long trimLongValue(Long value) {
        if (value == null) {
            return 0L;
        } else {
            return value.longValue();
        }
    }

    /**
     * @param str
     * @return
     * @desc 字符串为null或""或"null"，一律返回null
     */
    public static String formatString(String str) {
        if (StringUtils.isEmpty(trim(str)) || "null".equals(trim(str))) {
            return null;
        }

        return trim(str);
    }

    /**
     * @param str
     * @return
     * @desc 字符串为null或""，返回null 否则返回Integer对象
     */
    public static Integer formatInt(String str) {
        if (StringUtils.isNotEmpty(trim(str))) {
            return Integer.valueOf(trim(str));
        }

        return null;
    }

    /**
     * @param str
     * @return
     * @desc 字符串为null或""，返回null 否则返回Long对象
     */
    public static Long formatLong(String str) {
        if (StringUtils.isNotEmpty(trim(str))) {
            return Long.valueOf(trim(str));
        }

        return null;
    }

    /**
     * @param str
     * @return
     * @desc 字符串为null或""，返回null 否则返回Double对象
     */
    public static Double formatDouble(String str) {
        if (StringUtils.isNotEmpty(trim(str))) {
            return Double.valueOf(trim(str));
        }

        return null;
    }

    /**
     * 去空格，如为null则转化为空字符串
     *
     * @param str 字符串
     * @return 去空格后的字符串
     */
    public static String trim(String str) {
        return str == null ? "" : str.trim();
    }

    public static String trim(Object obj) {
        return obj == null ? "" : trim(obj.toString());
    }

    /**
     * @param pass
     * @return MD5加密
     */
    public static String encodePassMD5(String pass) {
        return Md5.MD5Encode(pass);
    }

    /**
     * @return
     * @description 创建UUID唯一键
     */
    public static String createUUID() {
        UUID uuid = UUID.randomUUID();
        String uu = uuid.toString().replaceAll("-", "");
        return uu;
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    /**
     * @param orderType
     * @return
     * @desc 回传调度scheduleType转换(调度可识别)
     */
    public static int transferScheduleType(int orderType) {
        if (orderType == OrderTypeEnum.SALE.getCode().intValue()) {//销售出库
            return 1;
        } else if (orderType == OrderTypeEnum.TRANSFER.getCode().intValue()) {//内配出库
            return 3;
        } else if (orderType == OrderTypeEnum.BACK_TO_SUPPLIER.getCode().intValue()) {//退厂出库
            return 4;
        } else if (orderType == OrderTypeEnum.SHOP.getCode().intValue()) {//取件出库
            return 2;
        }
        return 0;
    }

    /**
     * @param num 几位
     * @return 获取随机数
     */
    public static String getRandom(int num) {
        Random r = new Random();
        int t = r.nextInt(9);
        String[] code = {"0", "1", "2", "3", "4"};
        String str = "";
        for (int i = 0; i < num; i++) {
            str += code[r.nextInt(code.length - 1)];
        }

        return str;
    }

    /**
     * 提供精确的加法运算。
     *
     * @param v1
     *            被加数
     * @param v2
     *            加数
     * @return 两个参数的和
     */

    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }


    /**
     * base64加密
     * @param str
     * @return
     */
    public static String getBase64(String str) {
        byte[] b = null;
        String s = null;
        try {
            b = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (b != null) {
            s = new BASE64Encoder().encode(b);
        }
        return s;
    }


    /**
     * base64解密
     * @param s
     * @return
     */
    public static String getFromBase64(String s) {
        byte[] b = null;
        String result = null;
        if (s != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                b = decoder.decodeBuffer(s);
                result = new String(b, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 先base64 后md5加密
     * @param str
     * @return
     */
    public static String md5EncryptAndBase64(String str) {
        return encodeBase64(md5Encrypt(str));
    }

    private static byte[] md5Encrypt(String encryptStr) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(encryptStr.getBytes("utf8"));
            return md5.digest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String encodeBase64(byte[] b) {
        sun.misc.BASE64Encoder base64Encode = new BASE64Encoder();
        String str = base64Encode.encode(b);
        return str;
    }

    /**
     * 获取客户端ip
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if(ip.equals("127.0.0.1")){
                //根据网卡取本机配置的IP
                InetAddress inet=null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ip= inet.getHostAddress();
            }
        }
        // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if(ip != null && ip.length() > 15){
            if(ip.indexOf(",")>0){
                ip = ip.substring(0,ip.indexOf(","));
            }
        }
        return ip;
    }


    private static String getValue(Map data,String key){
        String value = (String)data.get(key);
        value = value==null?"":value;
        return value;
    }

    public static String encode(Map data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        try{
            StringBuffer query = new StringBuffer();

            String partnerid = "partnerid";
            String xmldata = "xmldata";
            String password = "password";
            String v_partnerid = getValue(data,partnerid);
            String v_xmldata = getValue(data,xmldata);
            String v_password = getValue(data,password);

            String url = security(partnerid,xmldata,"validation",v_partnerid,v_password,v_xmldata);

            @SuppressWarnings("unchecked")
            Set<Map.Entry<String, String>> entries = data.entrySet();
            boolean hasParam = false;
            for (Map.Entry<String, String> entry : entries) {
                String name = entry.getKey();
                if(partnerid.equals(name)||xmldata.equals(name)||password.equals(name))
                    continue;
                String value = entry.getValue();
                // 忽略参数名或参数值为空的参数
                if (!"".equals(name)&&!"".equals(value)) {
                    if (hasParam) {
                        query.append("&");
                    } else {
                        hasParam = true;
                    }
                    query.append(name).append("=").append(URLEncoder.encode(value, "UTF-8"));
                }
            }
            if(query.length()>0){
                query.append("&");
            }
            query.append(url);

            return query.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 订单数据加密
     * @param name1 合作商字段名
     * @param name2 数据字段名称
     * @param name3 验证字段名称
     * @param partnerid 合作商ID
     * @param data 源数
     * @param password 密码
     * @return 加密后的数据
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    private static String security(String name1, String name2, String name3, String partnerid, String password, String data)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {

        data = new String(new Base64().encode(data.getBytes("UTF-8")));

        // 签名内容 = base64(data) + partnerid + password;
        String validation = data + partnerid + password;
        validation = md5(validation);
        partnerid = URLEncoder.encode(partnerid, "UTF-8");
        data = URLEncoder.encode(data, "UTF-8");
        validation = URLEncoder.encode(validation, "UTF-8");

        return new StringBuffer().append(name1).append("=")
                .append(partnerid).append("&").append(name2).append("=")
                .append(data).append("&").append(name3).append("=").append(validation).toString();
    }

    /**
     * md5加密方法
     * @param source 源字符串
     * @return 加密后的字符
     * @throws NoSuchAlgorithmException
     */
    private static  String md5(String source) throws NoSuchAlgorithmException {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(source.getBytes());
        byte[] tmp = md.digest();
        char[] str = new char[16 * 2];

        int k = 0;
        for (int i = 0; i < 16; i++) {
            byte byte0 = tmp[i];
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }

        return new String(str);
    }


    /**
     * 处理字符串（正则表达式过滤字符串中的特殊字符）
     * @param str
     * @return
     */
    public static String dealStrByregEx(String str){
        if(StringUtils.isEmpty(str)){
           return "";
        }
        String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }
}
