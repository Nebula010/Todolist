package com.nebula.todolist.controller;

import com.nebula.todolist.entity.User;
import com.nebula.todolist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class HelloRestServer {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @PostMapping(value = "/login")
    public Boolean login(@RequestBody User user) {
        System.out.println("用户名 " + user.getUserName());
        System.out.println("用户密码 " + user.getPassword());
        return true;
    }

    @GetMapping(value = "/index")
    public Integer getIndex(@PathParam("value") Integer value) {
        List<User> users = userMapper.getAll();
        if (users != null && !users.isEmpty()) {
            System.out.println("size: " + users.size());
            User user = users.get(0);
            System.out.println("id: " + user.getId());
            System.out.println("name: " + user.getUserName());
            System.out.println("password: " + user.getPassword());
        }

        System.out.println("value: " + value);
        return value * 2;
    }
}
