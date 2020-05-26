package com.example.demotest.data.controller;

import com.example.demotest.Service.UserService;
import com.example.demotest.data.Bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
@Controller
@Slf4j
@CrossOrigin
public class LoginController {
    @Autowired
    UserService userService;



    @ResponseBody
    @PostMapping(value="/Home1")
    public String isLogin( @RequestBody User user,HttpSession httpSession){
        if(userService.isAdmin(user.getUsername(),user.getPassword(),httpSession)){
            System.out.println("admin执行");
            return "admin";
        }
        else if(userService.isNormal(user.getUsername(),user.getPassword(),httpSession)){
            System.out.println("normal执行");
            return "normal";
        }
        else
            return "error";
    }

    @GetMapping(value="/Home1")
    public String returnLogin(){

            return "/webjarpage/login";
    }

    @ResponseBody
    @PostMapping(value="/resistController")
    public String addUser(@RequestBody User user ){
       if(userService.addUser(user.getUsername(),user.getPassword(),user.getHeadurl()))
           return "success";
       else return "failed";
    }

    @ResponseBody
    @PostMapping(value="/checkUser")
    public String checkUser(@RequestBody User user ){
        if(userService.check(user.getUsername()))
            return "success";
        else return "failed";
    }


}




