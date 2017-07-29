package com.adanac.ssm.intf.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adanac.ssm.intf.common.domain.bean.Teacher;
import com.alibaba.fastjson.JSON;

/**
 * 
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月29日
 * Desc:    teacherDao的测试用例
 */
@ContextConfiguration(locations = { "classpath:/config/test-spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTeacherDao {
	private static final Logger logger = LoggerFactory.getLogger(TestTeacherDao.class);

	@Autowired
	private TeacherDao teacherDao;

	@Test
	public void test_selectAllTeacher() throws Exception {
		List<Teacher> studentList = teacherDao.selectAllTeachers();
		logger.info(JSON.toJSONString(studentList));
	}

	@Test
	public void test_insert() {
		Teacher record = new Teacher();
		record.setTeacherId(103);
		record.setTeacherName("adanac-teacher");
		int flag = teacherDao.insertTeacher(record);
		logger.info(JSON.toJSONString(flag));

	}

	@Test
	public void test_delete() {
		int flag = teacherDao.deleteByPrimaryKey(103l);
		logger.info(JSON.toJSONString(flag));
	}

}
