package com.adanac.ssm.intf.dao.impl;

import com.adanac.ssm.common.dao.base.BaseDaoSupport;
import com.adanac.ssm.common.domain.enums.SSMExceptionCode;
import com.adanac.ssm.common.domain.exception.SSM3UnCheckedException;
import com.adanac.ssm.intf.common.domain.bean.Task;
import com.adanac.ssm.intf.dao.TaskDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月29日
 * Desc:    调度任务接口实现
 */
@Repository("taskDao")
public class TaskDaoImpl extends BaseDaoSupport<Task, Long> implements TaskDao {

    private static final String NAMESPACE = "mybatis.mapper.TaskMapper";

    public TaskDaoImpl() {
        super(NAMESPACE);
    }

    /**
     * 查询所有的可调度任务
     *
     * @return 任务列表
     */
    @Override
    public List<Task> selectAllTasks() {
        try {
            return this.getMySqlSessionTemplate().selectList(NAMESPACE + ".selectAllTasks");
        } catch (Exception e) {
            e.printStackTrace();
            throw new SSM3UnCheckedException(SSMExceptionCode.DB_OPERATOR_EXPT.getCode(), e);
        }
    }

}
