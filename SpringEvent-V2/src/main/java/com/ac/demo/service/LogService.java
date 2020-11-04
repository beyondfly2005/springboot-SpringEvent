package com.ac.demo.service;

import org.springframework.stereotype.Service;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.service.LogService
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 11:41
 */
@Service
public class LogService {

    public void addSysLog(String log){
        System.out.println("增加一条系统日志："+log);
    }

}
