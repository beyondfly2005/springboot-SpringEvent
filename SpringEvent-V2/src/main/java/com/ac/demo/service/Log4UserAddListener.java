package com.ac.demo.service;

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
 * @date: 2020/11/4 13:42
 */
@Component
@Async
public class Log4UserAddListener {

    @Autowired
    private LogService logService;

    @EventListener
    public void onApplicationEvent(UserModel userModel) {
        //userDao.add(userModel);
        //其他业务逻辑

        //记录日志
        logService.addSysLog("添加用户->"+userModel.getName());
    }
}
