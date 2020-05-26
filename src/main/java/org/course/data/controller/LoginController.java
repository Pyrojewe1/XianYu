package org.course.data.controller;

import lombok.extern.slf4j.Slf4j;
import org.course.data.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping(value="/login")
    @ResponseBody
    public boolean isLogin(@RequestParam("username")String username,@RequestParam("password") String password){
        return this.loginService.isLogin(username,password);
    }

    @PostMapping(value="/login2")
    @ResponseBody
    public boolean isLogin2(@RequestParam("id")Long id){
        return this.loginService.isLogin2(id);
    }

}
