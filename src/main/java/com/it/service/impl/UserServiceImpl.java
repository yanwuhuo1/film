package com.it.service.impl;


import com.it.dao.User;
import com.it.mapper.UserMapper;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2022-06-01
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryAll() {
       return userMapper.selectUser();
    }

    @Override
    public User selectUsername(String name) {
        return userMapper.selectName(name);
    }




}
