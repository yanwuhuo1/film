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

    }
    @Test
    void contextLoads2() {

    }

}
