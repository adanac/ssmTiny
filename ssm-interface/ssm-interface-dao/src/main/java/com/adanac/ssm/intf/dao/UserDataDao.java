package com.adanac.ssm.intf.dao;

import java.util.List;

import com.adanac.ssm.intf.common.domain.bean.UserData;

public interface UserDataDao {
	int deleteByPrimaryKey(Long id);

	int insert(UserData record);

	int insertSelective(UserData record);

	UserData selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UserData record);

	int updateByPrimaryKey(UserData record);

	List<UserData> selectAllUserData();
}