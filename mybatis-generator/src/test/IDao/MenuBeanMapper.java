package test.IDao;

import test.domain.MenuBean;

public interface MenuBeanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MenuBean record);

    int insertSelective(MenuBean record);

    MenuBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MenuBean record);

    int updateByPrimaryKey(MenuBean record);
}