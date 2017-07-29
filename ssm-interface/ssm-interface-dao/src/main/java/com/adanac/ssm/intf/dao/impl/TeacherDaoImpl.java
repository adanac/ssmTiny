package com.adanac.ssm.intf.dao.impl;

import com.adanac.ssm.common.dao.base.BaseDaoSupport;
import com.adanac.ssm.common.domain.enums.SSMExceptionCode;
import com.adanac.ssm.common.domain.exception.SSM3UnCheckedException;
import com.adanac.ssm.intf.common.domain.bean.Teacher;
import com.adanac.ssm.intf.dao.TeacherDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("teacherDao")
public class TeacherDaoImpl extends BaseDaoSupport<Teacher, Long> implements TeacherDao {

    private static final String NAMESPACE = "mybatis.mapper.TeacherMapper";

    public TeacherDaoImpl() {
        super(NAMESPACE);
    }

    public List<Teacher> selectAllTeachers() {
        try {
            return this.getMySqlSessionTemplate().selectList(NAMESPACE + ".selectAllTeachers");
        } catch (Exception e) {
            e.printStackTrace();
            throw new SSM3UnCheckedException(SSMExceptionCode.DB_OPERATOR_EXPT.getCode(), e);
        }
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        try {
            return this.getMySqlSessionTemplate().insert(NAMESPACE + ".insert", teacher);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SSM3UnCheckedException(SSMExceptionCode.DB_OPERATOR_EXPT.getCode(), e);
        }
    }

}
