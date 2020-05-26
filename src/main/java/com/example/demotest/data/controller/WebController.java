package com.example.demotest.data.controller;

import com.example.demotest.data.Bean.LoginUser;
import com.example.demotest.data.Bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;


@CrossOrigin
@Controller
@Slf4j
public class WebController {

	@GetMapping("/login")
	public String get(){
		log.info("Web Jar page loading...");

		return "webjarpage/login.html";
	}


	@GetMapping("/resist")
	public String getResist() {
		return "webjarpage/resist.html";
	}



	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	@ResponseBody
	public LoginUser getUsername(HttpSession httpSession) {
		LoginUser loginUser=new LoginUser(Long.valueOf(1),"wangyan","http://localhost:8080/upload/test.jpg");
		//User user=new User();
		//if(httpSession.getAttribute("user")!=null){
		//	user= (User) httpSession.getAttribute("user");
		//	return user;
		//}
		//else
			return loginUser;
	}





}
