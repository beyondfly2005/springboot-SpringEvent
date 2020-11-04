package com.ac.demo.event;

import com.ac.demo.model.UserModel;
import org.springframework.context.ApplicationEvent;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.event.UserAddEvent
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 11:21
 */
public class UserAddEvent extends ApplicationEvent {

    public UserAddEvent(UserModel source) {
        super(source);
    }

}
