package com.adanac.ssm.intf.dao.impl;

import com.adanac.ssm.common.dao.base.BaseDaoSupport;
import com.adanac.ssm.intf.common.domain.bean.MenuBean;
import com.adanac.ssm.intf.dao.MenuDao;
import com.raycloud.cobarclient.mybatis.spring.MySqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Feagle on 2017/7/30.
 */
@Repository("menuDao")
public class MenuDaoImpl extends BaseDaoSupport<MenuBean, Long> implements MenuDao {

    private static final String NAMESPACE = "mybatis.mapper.MenuMapper";


    /**
     * 构造函数
     */
    public MenuDaoImpl() {
        super(NAMESPACE);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public MenuBean selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<MenuBean> listMenuByGroupId(Integer groupId) {
        MySqlSessionTemplate mySqlSessionTemplate = getMySqlSessionTemplate();
        MenuBean parameter = new MenuBean();
        parameter.setGroupId(1);
        return mySqlSessionTemplate.selectList(NAMESPACE + ".listMenuByGroupId", parameter);
    }

    @Override
    public List<MenuBean> listMenuGroups() {
        MySqlSessionTemplate mySqlSessionTemplate = getMySqlSessionTemplate();
        return mySqlSessionTemplate.selectList(NAMESPACE + ".listMenuGroups");
    }
}
