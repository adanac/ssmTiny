package com.adanac.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adanac.ssm.intf.common.domain.bean.Student;
import com.adanac.ssm.intf.common.domain.bean.Teacher;
import com.adanac.ssm.intf.dao.StudentDao;
import com.adanac.ssm.intf.dao.TeacherDao;
import com.adanac.ssm.service.SchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {

	@Resource
	private TeacherDao teacherDao;
	@Resource
	private StudentDao studentDao;

	@Transactional
	public int insertTeacherAndStudent(Teacher teacher, Student student) {
		int insert2 = teacherDao.insert(teacher);
		System.out.println("insertTeacher:" + insert2);
		int insert = studentDao.insert(student);
		System.out.println("insertStudent:" + insert);
		if (insert > 0 && insert2 > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	@Transactional(noRollbackForClassName = { "NullPointerException" }, timeout = 30)
	public int insertTeacherAndStudent2(Teacher teacher, Student student) {
		int insert2 = teacherDao.insert(teacher);
		System.out.println("insertTeacher:" + insert2);
		int insert = studentDao.insert(student);
		System.out.println("insertStudent:" + insert);
		String s = null;
		s.length();
		if (insert > 0 && insert2 > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
