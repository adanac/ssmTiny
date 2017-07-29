package test.IDao;

import test.domain.Task;

public interface TaskMapper {
    int deleteByPrimaryKey(Long sysNo);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Long sysNo);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}