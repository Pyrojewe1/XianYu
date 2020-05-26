package com.example.demotest.data.controller;

import com.example.demotest.data.DAO.UserDAO.ProductEntiy;
import com.example.demotest.data.domain.WebSite;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class WebController {
	@GetMapping("/dynamic/webjar")
    public String getWebJarSites() {
        log.info("Web Jar page loading...");

        return "webjarpage/site-search.html";
	}

	@GetMapping("/login")
	public String get(){
		log.info("Web Jar page loading...");

		return "webjarpage/login.html";
	}
	@GetMapping("/dynamic/web")
	public String getDynamicSites() {
		log.info("dynamic page loading...");
		return "dynamic/site-search.html";
	}
	
	@RequestMapping(value="/dynamic/sites", method=RequestMethod.GET)
	@ResponseBody
	public List<WebSite> getSiteData() {
		List<WebSite> websites = new ArrayList<WebSite>();
		websites.add(new WebSite("最大的中文搜索引擎,百度", "http://www.baidu.com", "/img/baidu-logo.jpeg"));
		websites.add(new WebSite("多快好省,一站式购物,京东", "http://www.jd.com", "/img/jd-logo.jpeg"));
		websites.add(new WebSite("极致性价比,小米手机和智能家电", "http://www.mi.com", "/img/mi-logo.jpeg"));
		websites.add(new WebSite("线上线下一体化购物,苏宁", "http://www.suning.com", "/img/suning-logo.jpeg"));
		websites.add(new WebSite("最大的在线购物网站,淘宝", "http://www.taobao.com", "/img/taobao-logo.jpeg"));
		websites.add(new WebSite("有品质的购物网站,天猫", "http://www.tmall.com", "/img/tmall-logo.jpg"));
		
		return websites;
	}

	@GetMapping("/resist")
	public String getResist() {
		return "webjarpage/resist.html";
	}



	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	@ResponseBody
	public String getUsername() {
		String username;

		username=(String) ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute("ActiveUser");

		return username;
	}

	@RequestMapping(value="/getProduct", method=RequestMethod.GET)
	@ResponseBody
	public ProductEntiy getProduct() {


		ProductEntiy product =(ProductEntiy) ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute("product");

		return product;
	}

	@GetMapping("/test")
	public String test() {
		return "webjarpage/test.html";
	}




}
