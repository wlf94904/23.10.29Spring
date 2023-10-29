package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
/**
 * @author hhm
 * @version 1.0
 */
public class UserServiceImpl implements UserService{

    private UserService(){//无参构造
        System.out.println("UserServiceImpl实例化");//即创建了
    }

    private UserDao userDao;

    //提供Set方法，然后对应的Bean工厂在底层操作时才能调用Set方法，把Dao给你
    //BeanFactory去调用该方法，然后从容器中（Bean工厂中）获取userDao设置到此处
    public void setUserDao(UserDao userDao){
//        System.out.println("BeanFactory去调用该方法获取userDao设置到此处:"+userDao);
        this.userDao=userDao;
    }
}
