package com.adanac.ssm.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adanac.ssm.intf.common.domain.bean.Task;
import com.adanac.ssm.intf.dao.TaskDao;
import com.adanac.ssm.service.TaskService;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Adanac
 * Date:    2016-04-05
 * Desc:    调度任务服务实现
 */
@Service("taskService")
public class TaskServiceImpl implements TaskService {

	private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

	@Autowired
	private TaskDao taskDao;

	/**
	 * 查询所有的可调度任务
	 *
	 * @return 任务列表
	 */
	@Override
	public List<Task> selectAllTasks() {
		return taskDao.selectAllTasks();
	}

}
