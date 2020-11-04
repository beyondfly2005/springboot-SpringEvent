package com.ac.demo.service;

import com.ac.demo.event.UserAddEvent;
import com.ac.demo.event.UserDelEvent;
import com.ac.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.service.Log4UserDelListener
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 13:25
 */
@Component
public class Log4UserDelListener implements ApplicationListener<UserDelEvent> {

    @Autowired
    private LogService logService;

    @Override
    public void onApplicationEvent(UserDelEvent userDelEvent) {
        UserModel userModel=(UserModel)userDelEvent.getSource();
        //userDao.delete(userModel.getId());
        //其他业务逻辑

        //记录日志
        logService.addSysLog("删除用户->"+userModel.getName());
    }
}
