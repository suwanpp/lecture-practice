package com.ohgiraffers.section01.common;

import java.util.List;

public interface MenuDAO {

    // 메뉴 목록 전체 조회
    List<MenuDTO> selectMenuList();

    // 메뉴 번호로 메뉴 조회
    MenuDTO selectOneMenu(int sequence);
}
