package com.ac.demo.service;

import com.ac.demo.event.UserAddEvent;
import com.ac.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.service.Log4UserAddListener
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 13:24
 */
@Component
public class Log4UserAddListener implements ApplicationListener<UserAddEvent> {

    @Autowired
    private LogService logService;

    @Override
    public void onApplicationEvent(UserAddEvent userAddEvent) {
        UserModel userModel=(UserModel)userAddEvent.getSource();
        //userDao.add(userModel);
        //其他业务逻辑

        //记录日志
        logService.addSysLog("添加用户->"+userModel.getName());
    }
}
