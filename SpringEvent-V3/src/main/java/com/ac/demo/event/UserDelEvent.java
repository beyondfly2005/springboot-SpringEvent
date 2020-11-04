package com.ac.demo.event;

import com.ac.demo.model.UserModel;
import org.springframework.context.ApplicationEvent;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.model.UserDelEvent
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 11:48
 */
public class UserDelEvent extends ApplicationEvent{

    public UserDelEvent(UserModel source) {
        super(source);
    }

}