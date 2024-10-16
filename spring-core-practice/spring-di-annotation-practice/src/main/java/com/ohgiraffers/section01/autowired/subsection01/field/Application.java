package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.MenuDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // AnnotationConfigApplicationContext 생성자에 basePackage 문자열을 전달하여
        // ApplicationContext에 생성한다.
        // 컴포넌트스캔 기능 활성화 시키는 또 다른 방법
        ApplicationContext context = 
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        
        String[] beanNames = context.getBeanDefinitionNames();
        // bean에 어떤것들이 들어있는지 확인
        for(String beanName : beanNames){
            System.out.println("beanName = " + beanName);
        }
        
        MenuService menuService = context.getBean("menuServiceField", MenuService.class);

        List< MenuDTO> menus = menuService.selectAllMenus();
        for(MenuDTO menu : menus){
            System.out.println("menu = " + menu);
        }
    }
}
