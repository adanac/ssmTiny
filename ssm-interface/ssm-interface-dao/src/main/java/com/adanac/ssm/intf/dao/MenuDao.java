package com.adanac.ssm.intf.dao;

import com.adanac.ssm.common.dao.base.BaseDao;
import com.adanac.ssm.intf.common.domain.bean.MenuBean;

import java.util.List;

/**
 * Created by Feagle on 2017/7/29.
 */
public interface MenuDao extends BaseDao<MenuBean, Long> {


    int deleteByPrimaryKey(Integer id);

    int insert(MenuBean record);

    int insertSelective(MenuBean record);

    MenuBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuBean record);

    int updateByPrimaryKey(MenuBean record);

    List<MenuBean> listMenuByGroupId(Integer groupId);

    List<MenuBean> listMenuGroups();

}
