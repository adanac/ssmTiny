package com.adanac.ssm.intf.dao;

import java.util.List;

import com.adanac.ssm.common.dao.base.BaseDao;
import com.adanac.ssm.intf.common.domain.bean.Teacher;

/**
 * 
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2017年1月12日
 * Desc:    不继承baseDao,老师表与学生表有关联，测试通过mybatis批量插入功能对学生表进行批量操作
 */
public interface TeacherDao extends BaseDao<Teacher, Long> {
	/**
	 * 查询所有记录
	 * @return
	 */
	public List<Teacher> selectAllTeachers();

	/**
	 * 插入单条记录
	 * @param teacher
	 * @return
	 */
	public int insertTeacher(Teacher teacher);

}