package com.adanac.ssm.intf.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adanac.ssm.intf.common.domain.bean.Task;
import com.alibaba.fastjson.JSON;

/**
 * 
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月29日
 * Desc:    TastDao 的测试用例
 */
@ContextConfiguration(locations = { "classpath:/config/test-spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTaskDao {

	private static final Logger logger = LoggerFactory.getLogger(TestTaskDao.class);

	@Autowired
	private TaskDao taskDao;

	/**
	 * 获取所有任务
	 * @throws Exception
	 */
	@Test
	public void test_selectAllTasks() throws Exception {
		List<Task> taskList = taskDao.selectAllTasks();
		logger.info(JSON.toJSONString(taskList));
	}

	/**
	 * 查询任务：根据主键
	 */
	@Test
	public void test_selectByPrimaryKey() {
		Long id = 1l;
		Task task = taskDao.selectByPrimaryKey(id);
		logger.info(JSON.toJSONString(task));
	}

	/**
	 * 删除任务
	 */
	@Test
	public void test_deleteByPrimaryKey() {
		Long id = 4l;
		int deleteByPrimaryKey = taskDao.deleteByPrimaryKey(id);
		logger.info(JSON.toJSONString(deleteByPrimaryKey));
	}

	/**
	 * 创建任务
	 * 空属性也会插入
	 */
	@Test
	public void test_insert() {
		Task task = new Task();
		// task.setSysNo(1L);
		task.setTaskNo("1004");
		task.setTaskName("Task4");
		task.setTaskStatus(1);
		task.setTaskType(1);
		task.setCreateTime(new Date(System.currentTimeMillis()));
		task.setTaskDesc("任务4");
		int insert = taskDao.insert(task);
		logger.info(JSON.toJSONString(insert));
	}

	/**
	 * 创建任务
	 * 空属性不会插入
	 */
	@Test
	public void test_insertSelective() {
		Task task = new Task();
		task.setTaskNo("1003");
		task.setTaskName("Task3");
		task.setTaskStatus(1);
		task.setTaskType(2);
		task.setCreateTime(new Date(System.currentTimeMillis()));
		task.setTaskDesc("任务3");
		int insertSelective = taskDao.insertSelective(task);
		logger.info(JSON.toJSONString(insertSelective));
	}

	/**
	 * 更新任务
	 */
	@Test
	public void test_updateByPrimaryKey() {
		Task task = new Task();
		task.setSysNo(2l);
		task.setTaskNo("1002");
		task.setTaskName("Task2");
		task.setTaskStatus(1);
		task.setTaskType(2);
		task.setCreateTime(new Date(System.currentTimeMillis()));
		// task.setTaskDesc("测试updateByPrimaryKey");
		task.setTaskDesc("销售订单下发任务");
		int updateByPrimaryKey = taskDao.updateByPrimaryKey(task);
		logger.info(JSON.toJSONString(updateByPrimaryKey));
	}

	@Test
	public void test_updateByPrimaryKeySelective() {
		Task task = new Task();
		task.setSysNo(4l);
		task.setTaskNo("1004");
		task.setTaskName("Task4");
		task.setTaskStatus(1);
		task.setTaskType(2);
		task.setCreateTime(new Date(System.currentTimeMillis()));
		task.setTaskDesc("测试updateByPrimaryKeySelective");
		int updateByPrimaryKey = taskDao.updateByPrimaryKey(task);
		logger.info(JSON.toJSONString(updateByPrimaryKey));
	}
}
