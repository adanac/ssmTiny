package com.adanac.ssm.intf.common.domain.bean;

import java.io.Serializable;

/**
 * MenuBean
 * Created by Feagle on 2017/7/30.
 */
public class MenuBean implements Serializable {
    private static final long serialVersionUID = -760001637870270658L;
    private Long id;
    private Integer groupId;
    private String groupName;
    private String menuName;
    private Integer menuType;
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
