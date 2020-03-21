package com.nebula.todolist.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    /**
     * id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
}
