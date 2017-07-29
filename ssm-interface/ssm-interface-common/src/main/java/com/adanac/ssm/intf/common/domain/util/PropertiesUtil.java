package com.adanac.ssm.intf.common.domain.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * 
 * @Description:properties文件操作工具类
 * @Author:Adanac
 * @Version:1.1.0
 */
public class PropertiesUtil {

	private static Properties properties;

	private PropertiesUtil() {
	}

	static {
		try {
			Resource resource = new ClassPathResource("/config/ssm.db.properties");
			properties = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) {
		String value = "";
		if (properties.containsKey(key)) {
			value = properties.getProperty(key);
		}
		return value;
	}

	public static String get(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}

	public static void reomve(String key) {
		properties.remove(key);
	}

	public static Map<String, String> getAllKeys() {
		Map<String, String> resultmap = new HashMap<String, String>();

		Enumeration enum1 = properties.propertyNames();// 得到配置文件的名字

		while (enum1.hasMoreElements()) {
			String strKey = (String) enum1.nextElement();
			String strValue = properties.getProperty(strKey);
			resultmap.put(strKey, strValue);
		}

		return resultmap;
	}

}
