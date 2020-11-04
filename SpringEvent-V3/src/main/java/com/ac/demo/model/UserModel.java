package com.ac.demo.model;

import lombok.Data;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.demo.model.UserModel
 * @Description: 该类的描述
 * @version: V0.1.0
 * @author: gaolongfei
 * @date: 2020/11/4 11:29
 */
@Data
public class UserModel {
    private Long id;
    private String name;

    public UserModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
