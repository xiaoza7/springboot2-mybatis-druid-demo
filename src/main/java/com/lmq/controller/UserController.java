package com.lmq.controller;

import com.lmq.model.Info;
import com.lmq.model.User;
import com.lmq.service.user.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/hello1")
    public String greeting() {
        User u=new User();
        u.setAge(19);
        u.setName("new user");
        u.setPassword("123");
        Info in=new Info("update",1,22);
        userService.addUserInfo(u,in);
        return "hello";
    }

}
