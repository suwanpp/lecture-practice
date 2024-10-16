package com.ohgiraffers.section01.autowired.subsection03.setter;

import com.ohgiraffers.section01.common.MenuDAO;
import com.ohgiraffers.section01.common.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuServiceSetter")
public class MenuService {

    private MenuDAO menuDAO;

    @Autowired
    public void setMenuDAO(MenuDAO menuDAO){
        this.menuDAO = menuDAO;
    }

    public List<MenuDTO> selectAllMenus(){

        return menuDAO.selectMenuList();
    }

    public MenuDTO searchMenuBySequence(int sequence){

        return menuDAO.selectOneMenu(sequence);
    }
}
