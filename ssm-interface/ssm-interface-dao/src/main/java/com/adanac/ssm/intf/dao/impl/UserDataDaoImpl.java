package com.adanac.ssm.intf.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.adanac.ssm.common.dao.base.BaseDaoSupport;
import com.adanac.ssm.common.domain.enums.SSMExceptionCode;
import com.adanac.ssm.common.domain.exception.SSM3UnCheckedException;
import com.adanac.ssm.intf.common.domain.bean.UserData;
import com.adanac.ssm.intf.dao.UserDataDao;

@Repository("userDataDao")
public class UserDataDaoImpl extends BaseDaoSupport<UserData, Long>implements UserDataDao {

	private static final String NAMESPACE = "mybatis.mapper.UserDataMapper";

	public UserDataDaoImpl() {
		super(NAMESPACE);
	}

	public List<UserData> selectAllUserData() {
		try {
			return this.getMySqlSessionTemplate().selectList(NAMESPACE + ".selectAllUserData");
		} catch (Exception e) {
			e.printStackTrace();
			throw new SSM3UnCheckedException(SSMExceptionCode.DB_OPERATOR_EXPT.getCode(), e);
		}
	}

}
