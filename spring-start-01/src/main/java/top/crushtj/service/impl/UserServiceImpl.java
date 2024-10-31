package top.crushtj.service.impl;

import top.crushtj.dao.UserDao;
import top.crushtj.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //BeanFactory调用
    public void setUserDao(UserDao userDao){
        System.out.println("调用BeanFactory设置UserDao: " + userDao);
        this.userDao = userDao;
    }
}
