package com.adanac.ssm.service.impl;

import com.adanac.ssm.intf.common.domain.bean.MenuBean;
import com.adanac.ssm.intf.dao.MenuDao;
import com.adanac.ssm.service.MenuService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Created by Feagle on 2017/7/30.
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Override
    public JSONObject listMenu() {

        JSONObject result = new JSONObject();
        JSONArray menus = new JSONArray();
        // 查询菜单
        List<MenuBean> menuBeans = menuDao.listMenuGroups();
        if (!CollectionUtils.isEmpty(menuBeans)) {
            Map<Integer, List<MenuBean>> menuMap = new HashMap<>();
            for (MenuBean menuBean : menuBeans) {
                if (menuMap.get(menuBean.getGroupId()) == null) {
                    List<MenuBean> menuList = new ArrayList<>();
                    menuList.add(menuBean);
                    menuMap.put(menuBean.getGroupId(), menuList);
                } else {
                    List<MenuBean> menuBeans1 = menuMap.get(menuBean.getGroupId());
                    menuBeans1.add(menuBean);
                    menuMap.put(menuBean.getGroupId(), menuBeans1);
                }

            }

            if (menuMap != null && !menuMap.isEmpty()) {
                Iterator<Map.Entry<Integer, List<MenuBean>>> iterator = menuMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, List<MenuBean>> next = iterator.next();
                    JSONObject menuGroup = new JSONObject();
//                    menuGroup.put(next.getKey() + "", next.getValue());// group_id作为key
                    menuGroup.put(next.getValue().get(0).getGroupName(), next.getValue());// group_name作为key
                    menus.add(menuGroup);
                }
                result.put("menus", menus);
            }
        }
        return result;
    }
}
