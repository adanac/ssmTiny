package com.adanac.ssm.service;

import java.util.List;

import com.adanac.ssm.intf.common.domain.bean.Task;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Adanac
 * Date:    2016-04-05
 * Desc:    调度任务服务接口定义
 */
public interface TaskService {

	/**
	 * 查询所有的可调度任务
	 *
	 * @return 任务列表
	 */
	List<Task> selectAllTasks();

}
