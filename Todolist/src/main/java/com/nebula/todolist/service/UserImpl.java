package com.nebula.todolist.service;

import com.nebula.todolist.common.BaseInterfaceImpl;
import com.nebula.todolist.common.BaseMapper;
import com.nebula.todolist.entity.User;
import com.nebula.todolist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserImpl extends BaseInterfaceImpl<User> {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public BaseMapper<User> getMapper() {
        return userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.getAll();
    }
}
