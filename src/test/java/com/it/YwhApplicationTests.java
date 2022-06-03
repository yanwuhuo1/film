package com.it;

import com.it.dao.Film;
import com.it.dao.User;
import com.it.mapper.FilmMapper;
import com.it.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class YwhApplicationTests {

    @Autowired
    FilmMapper filmMapper;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User zs = userMapper.select("ywh", "123");
        System.out.println("zs = " + zs);
    }
    @Test
    void contextLoads2() {
        User ywh = userMapper.selectByName("ywh1");
        if (ywh!=null){
            System.out.println("ywh = " + ywh);
        }else {
            System.out.println("错误 ");
        }
    }

}
