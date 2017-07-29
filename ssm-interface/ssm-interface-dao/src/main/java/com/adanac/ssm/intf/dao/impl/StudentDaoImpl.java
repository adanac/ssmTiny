package com.adanac.ssm.intf.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.adanac.ssm.common.dao.base.BaseDaoSupport;
import com.adanac.ssm.common.domain.enums.SSMExceptionCode;
import com.adanac.ssm.common.domain.exception.SSM3UnCheckedException;
import com.adanac.ssm.intf.common.domain.bean.Student;
import com.adanac.ssm.intf.dao.StudentDao;

/**
 * 
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月29日
 * Desc:    测试学生接口实现
 */
@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoSupport<Student, Long>implements StudentDao {

	private static final String NAMESPACE = "mybatis.mapper.StudentMapper";

	public StudentDaoImpl() {
		super(NAMESPACE);
	}

	@Override
	public List<Student> selectAll() {
		try {
			return this.getMySqlSessionTemplate().selectList(NAMESPACE + ".selectAllStudents");
		} catch (Exception e) {
			e.printStackTrace();
			throw new SSM3UnCheckedException(SSMExceptionCode.DB_OPERATOR_EXPT.getCode(), e);
		}
	}

	@Override
	public void batchInsert(List<Student> studentList) {
		try {
			for (Student student : studentList) {
				this.getMySqlSessionTemplate().insert(NAMESPACE + ".insert2", student);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new SSM3UnCheckedException(SSMExceptionCode.DB_OPERATOR_EXPT.getCode(), e);
		}
	}

	@Override
	public void batchDelete(List<Integer> ids) {
		try {
			for (Integer id : ids) {
				this.getMySqlSessionTemplate().delete(NAMESPACE + ".delete", id);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new SSM3UnCheckedException(SSMExceptionCode.DB_OPERATOR_EXPT.getCode(), e);
		}
	}

}
