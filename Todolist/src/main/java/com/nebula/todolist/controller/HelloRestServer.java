package com.nebula.todolist.controller;

import com.nebula.todolist.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/rest")
public class HelloRestServer {

    @PostMapping(value = "/login")
    public Boolean login(@RequestBody User user) {
        System.out.println("用户名 " + user.getUserName());
        System.out.println("用户密码 " + user.getPassword());
        return true;
    }

    @GetMapping(value = "/index")
    public Integer getIndex(@PathParam("value") Integer value) {
        System.out.println("value: " + value);
        return value * 2;
    }
}
