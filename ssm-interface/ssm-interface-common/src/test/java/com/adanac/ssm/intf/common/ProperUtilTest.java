package com.adanac.ssm.intf.common;

import com.adanac.ssm.intf.common.domain.util.PropertiesUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ProperUtilTest {
	private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

	@Test
	public void test_getAllKeys() throws Exception {
		Map<String, String> allKeys = PropertiesUtil.getAllKeys();
		logger.info(JSON.toJSONString(allKeys));
	}
}
