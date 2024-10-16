package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.MenuDAO;
import com.ohgiraffers.section01.common.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuServiceConstructor")
public class MenuService {

    @Autowired
    private final MenuDAO menuDAO;

    public  MenuService(MenuDAO menuDAO){
        this.menuDAO = menuDAO;
    }

    public List<MenuDTO> selectAllMenus(){

        return menuDAO.selectMenuList();
    }

    public MenuDTO searchMenuBySequence(int sequence){

        return menuDAO.selectOneMenu(sequence);
    }
}
