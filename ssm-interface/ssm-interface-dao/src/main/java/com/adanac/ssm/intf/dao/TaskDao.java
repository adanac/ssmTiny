package com.adanac.ssm.intf.dao;

import java.util.List;

import com.adanac.ssm.common.dao.base.BaseDao;
import com.adanac.ssm.intf.common.domain.bean.Task;

/**
 * 
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月29日
 * Desc:    调度任务接口
 */
public interface TaskDao extends BaseDao<Task, Long> {

	/**
	 * 查询所有的可调度任务
	 *
	 * @return 任务列表
	 */
	List<Task> selectAllTasks();

}
