package com.nebula.todolist.entity;

import lombok.Data;

@Data
public class User {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
}
