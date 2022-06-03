package com.it.mapper;


import com.it.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2022-06-01
 */
@Mapper
public interface UserMapper{
    List<User> selectUser();

        //根据用户名，密码查询对象
    User select(@Param("username") String username, @Param("password") String password);

    //查询用户名对象
    User selectByName(String username);
}
