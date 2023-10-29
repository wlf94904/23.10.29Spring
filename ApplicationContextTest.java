package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhm
 * @version 1.0
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) applicationContext.getBean("userService");//beanName
        UserService userService2=(UserService) applicationContext.getBean("userService");//beanName
        UserService userService3=(UserService) applicationContext.getBean("userService");//beanName
        System.out.println(userService);
        System.out.println(userService2);
        System.out.println(userService3);

    }
}
