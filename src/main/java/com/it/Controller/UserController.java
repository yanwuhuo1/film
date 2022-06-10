package com.it.Controller;

import com.it.dao.User;
import com.it.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    //登入注册
    @RequestMapping("login")
    public String login(Model model,String username,String password) {

        User user = new User();

        if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
            return "管理页面";
        }

        model.addAttribute("密码错误");
        return "User.html";
    }
}
