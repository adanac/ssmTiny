package test.IDao;

import test.domain.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}