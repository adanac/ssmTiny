package com.adanac.ssm.intf.common.domain.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/9/28.
 */
//public class CredentialsMatcher {
//
//    //data加密密方法
//    public String encrypt(String data) {
//        String md5 = new Md5Hash(data).toHex();
//        return md5;
//    }
//}

public class MD5Util {

    public static String getMD5String(String value) {
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] e = md.digest(value.getBytes());
            return toHexString(e);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return value;
        }
    }

    public static String getMD5String(byte[] bytes) {
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] e = md.digest(bytes);
            return toHexString(e);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String toHexString(byte bytes[]) {
        StringBuilder hs = new StringBuilder();
        String stmp = "";
        for (int n = 0; n < bytes.length; n++) {
            stmp = Integer.toHexString(bytes[n] & 0xff);
            if (stmp.length() == 1)
                hs.append("0").append(stmp);
            else
                hs.append(stmp);
        }

        return hs.toString();
    }
}