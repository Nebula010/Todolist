package com.nebula.todolist.controller;

import com.nebula.todolist.entity.User;
import com.nebula.todolist.service.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class UserRestServer {

    @Autowired
    private UserImpl userImpl = new UserImpl();

    @PostMapping(value = "/login")
    public Boolean login(@RequestBody User user) {
        System.out.println("用户名 " + user.getUserName());
        System.out.println("用户密码 " + user.getPassword());
        return true;
    }

    @GetMapping(value = "/index")
    public Integer getIndex(@PathParam("value") Integer value) {
        List<User> users = userImpl.getAllUsers();
        System.out.println(users.size());

        System.out.println("value: " + value);
        return value * 2;
    }
}
