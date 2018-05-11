package com.wxx.jedis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxx.jedis.service.UserService;
import com.wxx.jedis.domain.User;

@Controller
@RequestMapping("/userCtrl")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(User user){
        userService.addUser(user);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/getUser")
    public List<User> getUser(String username){
        return userService.getUser(username);
    }

}