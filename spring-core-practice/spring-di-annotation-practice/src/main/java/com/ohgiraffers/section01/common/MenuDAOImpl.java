package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("MenuDAO")
public class MenuDAOImpl implements MenuDAO {

    private final Map<Integer, MenuDTO> menuList;

    public MenuDAOImpl(){
        menuList = new HashMap<>();
        menuList.put(1, new MenuDTO(1,"열무김치라떼",5000));
        menuList.put(2, new MenuDTO(2,"홍어빙수",8000));
    }
    @Override
    public List<MenuDTO> selectMenuList() {

        return new ArrayList<>(menuList.values());
    }

    @Override
    public MenuDTO selectOneMenu(int sequence) {
        return menuList.get(sequence);
    }
}
