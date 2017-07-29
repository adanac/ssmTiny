package com.adanac.ssm.intf.dao;

import com.adanac.ssm.common.dao.base.BaseDao;
import com.adanac.ssm.intf.common.domain.bean.Student;

import java.util.List;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月29日
 * Desc:    测试mybatis接口
 */
public interface StudentDao extends BaseDao<Student, Long> {

    /**
     * 查询所有
     *
     * @return 学生列表
     */
    List<Student> selectAll();

    /**
     * 批量插入
     *
     * @param studentList
     * @return
     */
    void batchInsert(List<Student> studentList);

    /**
     * 批量删除
     *
     * @param idList
     */
    void batchDelete(List<Integer> idList);

}