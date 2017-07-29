package com.adanac.ssm.common.domain.util;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-07-07
 */
public class CollectionUtils {

    /**
     * 按字典顺序排列
     */
    private static final Comparator ALPHABET_COMPARATOR = new Comparator() {
        public int compare(Object o1, Object o2) {
            if (Integer.parseInt(o1.toString()) > Integer.parseInt(o2.toString()))
                return 1;
            if (Integer.parseInt(o1.toString()) == Integer.parseInt(o2.toString()))
                return 0;
            else
                return -1;
        }
    };

    /**
     * 将 key 按照数字大小从小到大排列
     *
     * @param keySet 键集合
     * @return 排序后的键集合
     */
    public static List<String> sortResourceKeySet(Set<String> keySet) {
        List<String> keyList = new ArrayList<String>(keySet);
        Collections.sort(keyList, ALPHABET_COMPARATOR);
        return keyList;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("2");
        set.add("1");
        set.add("3");
        System.out.println(JSON.toJSONString(CollectionUtils.sortResourceKeySet(set)));
    }
}
