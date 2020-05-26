package com.example.demotest.data.controller;

import com.example.demotest.Service.UserService;
import com.sun.xml.txw2.output.ResultFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.transform.Result;
import java.util.Objects;

@Controller
@Slf4j
public class LoginController {
    @Autowired
    UserService userService;
    @ResponseBody
    @PostMapping(value="/Home1")
    public String isLogin(@RequestParam("username")String username, @RequestParam("password") String password,HttpSession httpSession){
        if(userService.isLogin(username,password)){
           httpSession.setAttribute("ActiveUser",username);
            return "Login";
        }
        else
            return "NotLogin";
    }

    @GetMapping(value="/Home1")
    public String returnLogin(){

            return "/webjarpage/login";
    }

    @PostMapping(value="/resistController")
    public String addUser(@RequestParam("username")String username,@RequestParam("password") String password){
       if(userService.addUser(username,password))
           return "/webjarpage/login";
       else return "/webjarpage/resist";
    }




}




