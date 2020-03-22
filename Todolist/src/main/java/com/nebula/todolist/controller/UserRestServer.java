package com.nebula.todolist.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nebula.todolist.entity.User;
import com.nebula.todolist.service.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public JSONObject getIndex(@RequestParam("value") Integer value) {
//        List<User> users = userImpl.getAllUsers();
//        System.out.println(users.size());

        System.out.println("value: " + value);
        JSONObject result = new JSONObject();

        JSONArray events = new JSONArray();
        JSONObject item = new JSONObject();
        item.put("id", 1);
        item.put("title", "Beach Cleanup");
        item.put("date", "Aug 28 2018");
        item.put("time", "10:00");
        item.put("location", "Daytona Beach");
        events.add(item);
        result.put("events", events);

        return result;
    }
}
