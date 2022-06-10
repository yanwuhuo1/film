package com.it.mapper;


import com.it.dao.User;
import org.apache.ibatis.annotations.Mapper;

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
    //查询全部
    List<User> selectUser();

//查询用户名是否存在
   User selectName(String name);

//添加用户
    List<User> add();


}
