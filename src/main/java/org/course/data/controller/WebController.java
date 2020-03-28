package org.course.data.controller;

import java.util.ArrayList;
import java.util.List;

import org.course.data.domain.WebSite;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class WebController {
	@GetMapping("/dynamic/webjar")
    public String getWebJarSites() {
        log.info("Web Jar page loading...");

        return "webjarpage/site-search";
	}
	
	@GetMapping("/dynamic/web")
	public String getDynamicSites() {
		log.info("dynamic page loading...");
		return "dynamic/site-search";
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
}
