package com.ac.demo.service;

import com.ac.demo.event.UserAddEvent;
import com.ac.demo.event.UserDelEvent;
import com.ac.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.service.Log4UserAddListener
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 11:40
 */
@Component

public class Log4UserListener {

    /*@EventListener
    public void onApplicationEvent(UserModel enterpriseModel) {
		//同一个Model类  无法区分事件
    }*/

    @Autowired
    private LogService logService;

    @Async
    @EventListener
    public void onApplicationEvent(UserAddEvent userAddEvent) {
        UserModel userModel=(UserModel)userAddEvent.getSource();
        logService.addSysLog("添加用户->"+userModel.getName());
    }

    @Async
    @EventListener
    public void onApplicationEvent(UserDelEvent userDelEvent) {
        UserModel userModel=(UserModel)userDelEvent.getSource();
        logService.addSysLog("删除户->"+userModel.getName());
    }
}
