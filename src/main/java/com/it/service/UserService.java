package com.it.service;


import com.it.dao.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2022-06-01
 */
public interface UserService  {
    User saveW(String username, String password);

}
