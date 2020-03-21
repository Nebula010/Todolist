package com.nebula.todolist.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommonEntity implements Serializable {

    protected Integer id;

    protected Date createTime;
}
