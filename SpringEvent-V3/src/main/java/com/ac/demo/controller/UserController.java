package com.ac.demo.controller;

import com.ac.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.controller.UserController
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 11:33
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userAdd")
    public String userAdd(){
        return  userService.userAdd();
    }

    @RequestMapping("/userDel")
    public String userDel(){
        return  userService.userDel();
    }
}
