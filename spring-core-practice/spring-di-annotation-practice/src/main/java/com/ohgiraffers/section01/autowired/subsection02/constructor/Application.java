package com.ohgiraffers.section01.autowired.subsection02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames){
            System.out.println("beanName = " + beanName);
        }

        MenuService menuService = context.getBean("menuServiceConstructor", MenuService.class);

        menuService.selectAllMenus().forEach(System.out::println);

        System.out.println(menuService.searchMenuBySequence(1));
        System.out.println(menuService.searchMenuBySequence(2));
    }
}
