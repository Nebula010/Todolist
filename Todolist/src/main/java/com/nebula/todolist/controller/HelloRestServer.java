package com.nebula.todolist.controller;

import com.nebula.todolist.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloRestServer {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean login(@RequestBody User user) {
        System.out.println("用户名 " + user.getUserName());
        System.out.println("用户密码 " + user.getPassword());
        return true;
    }
}
