package com.it.service;


import com.it.dao.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2022-06-01
 */
public interface UserService  {

    //查询
    public List<User> queryAll();
    //登入

    //查询用户名是否存在
    User selectUsername(String name);
}
