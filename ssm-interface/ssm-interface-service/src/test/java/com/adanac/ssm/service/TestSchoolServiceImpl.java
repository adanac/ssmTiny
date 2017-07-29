package com.adanac.ssm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adanac.ssm.intf.common.domain.bean.Student;
import com.adanac.ssm.intf.common.domain.bean.Teacher;
import com.alibaba.fastjson.JSON;

@ContextConfiguration(locations = { "classpath:/config/test-spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSchoolServiceImpl {

	private static final Logger logger = LoggerFactory.getLogger(TestSchoolServiceImpl.class);

	@Autowired
	private SchoolService schoolService;

	/**
	 * 测试 单表 或 多库/多表的事务管理
	 * 故意制造第一条插入OK，第二条插入报错的场景，此时再运行一下程序，程序会抛出异常，即使第一条数据是OK的，依然不会插入。
	 */
	@Test
	public void test_insertTeacherAndStudent() {
		Teacher teacher = new Teacher();
		teacher.setTeacherId(10002);
		teacher.setTeacherName("教师2");
		Student student = new Student();
		student.setStudentId(20002);
		student.setStudentName("学生2");
		int result = schoolService.insertTeacherAndStudent(teacher, student);
		logger.info(JSON.toJSONString(result));
	}

	/**
	 * 测试 Transaction 的 rollback
	 * @Transactional(rollbackForClassName = { "NullPointerException" }):遇到NullPointerException,事务会回滚
	 * @Transactional(noRollbackForClassName = { "NullPointerException" }):遇到NullPointerException,事务不会回滚
	 */
	@Test
	public void test_insertTeacherAndStudent2() {
		Teacher teacher = new Teacher();
		teacher.setTeacherId(10003);
		teacher.setTeacherName("教师3");
		Student student = new Student();
		student.setStudentId(20003);
		student.setStudentName("学生3");
		int result = schoolService.insertTeacherAndStudent2(teacher, student);
		logger.info(JSON.toJSONString(result));
	}

}
