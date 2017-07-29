package com.adanac.ssm.intf.dao.impl;

import com.adanac.ssm.intf.common.domain.bean.Student;
import com.adanac.ssm.intf.dao.StudentDao;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月29日
 * Desc:    studentDao的测试用例
 */
@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestStudentDao {
    private static final Logger logger = LoggerFactory.getLogger(TestStudentDao.class);

    @Autowired
    private StudentDao studentDao;

    @Test
    public void test_selectAllStudents() throws Exception {
        List<Student> studentList = studentDao.selectAll();
        logger.info(JSON.toJSONString(studentList));
    }

    @Test
    public void test_insert() {
        Student record = new Student();
        record.setStudentId(103);
        record.setStudentName("adanac");
        int flag = studentDao.insert(record);
        logger.info(JSON.toJSONString(flag));

    }

    @Test
    public void test_selectByPrimaryKey() {
        Student student = studentDao.selectByPrimaryKey(101L);
        logger.info(JSON.toJSONString(student));
    }

    /**
     * 使用coreBar不能直接使用batchInsert方法，批量操作需要for循环
     * Caused by: com.alibaba.cobarclient.transaction.MultipleCauseException
     * at com.raycloud.cobarclient.mybatis.spring.MySqlSessionTemplate.batchSync(MySqlSessionTemplate.java:248)
     */
    @Test
    public void test_batchInsertStudents() {
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            student.setStudentName("adanac_" + i);
            studentList.add(student);
        }
        studentDao.batchInsert(studentList);
    }

    /**
     * 测试通过
     */
    @Test
    public void test_batchDelete() {
        List<Integer> idList = new ArrayList<>();
        idList.add(123);
        idList.add(124);
        studentDao.batchDelete(idList);
    }
}
