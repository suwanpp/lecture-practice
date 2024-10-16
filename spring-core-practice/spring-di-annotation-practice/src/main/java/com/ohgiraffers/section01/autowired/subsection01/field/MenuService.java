package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.MenuDAO;
import com.ohgiraffers.section01.common.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuServiceField")
public class MenuService {

    // MenuDAO 타입의 빈 객체를 이 프로퍼티에 자동으로 주입
    @Autowired
    private MenuDAO menuDAO;

    // 메뉴 목록 전체 조회
    public List<MenuDTO> selectAllMenus(){

        return menuDAO.selectMenuList();
    }

    // 메뉴 번호로 메뉴 조회
    public MenuDTO searchMenuBySequence(int sequence){

        return menuDAO.selectOneMenu(sequence);
    }
}
