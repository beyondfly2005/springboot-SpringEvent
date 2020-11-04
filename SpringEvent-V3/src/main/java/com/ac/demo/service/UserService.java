package com.ac.demo.service;

import com.ac.demo.event.UserAddEvent;
import com.ac.demo.event.UserDelEvent;
import com.ac.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.UserServoce
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 11:31
 */
@Service
public class UserService {

    //事件发布
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public String userAdd(){
        applicationEventPublisher.publishEvent(new UserAddEvent(new UserModel(1L,"张三")));
        return "success";
    }

    public String userDel(){
        applicationEventPublisher.publishEvent(new UserDelEvent(new UserModel(1L,"张三")));
        return "success";
    }

}
