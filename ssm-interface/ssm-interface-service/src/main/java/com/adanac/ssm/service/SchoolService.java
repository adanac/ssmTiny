package com.adanac.ssm.service;

import com.adanac.ssm.intf.common.domain.bean.Student;
import com.adanac.ssm.intf.common.domain.bean.Teacher;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2017年1月13日
 * Desc:    测试多库/多表事物管理
 * 对单库/多库的两张表（Student表、Teacher表）同时插入一条数据，要么全部成功，要么全部失败，该如何处理？此时明显就不可以使用MyBatis批量操作的方法了，要实现这个功能，可以使用Spring的事物管理。
 */
public interface SchoolService {
    /**
     * 同时插入老师、学生表
     *
     * @param teacher
     * @param student
     */
    int insertTeacherAndStudent(Teacher teacher, Student student);

    /**
     * 测试 Transaction rollback
     *
     * @param teacher
     * @param student
     * @return
     */
    int insertTeacherAndStudent2(Teacher teacher, Student student);
}
