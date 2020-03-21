package com.nebula.todolist.entity;

import com.nebula.todolist.common.CommonEntity;
import lombok.Data;

@Data
public class User extends CommonEntity {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
}
