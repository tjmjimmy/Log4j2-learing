package com.jimmy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jimmy.entity.User;

@Scope("prototype")
@Controller
public class IndexController {

	private Logger logger = LoggerFactory.getLogger("IndexController");
	
	@RequestMapping("/showUser")
	public String showUser(Model model, HttpServletRequest request, HttpServletResponse response){

		logger.debug("……程序开始运行……");
		logger.info("……程序开始运行……");
		logger.warn("……程序开始运行……");
		logger.error("……程序开始运行……");
		
		User user = new User("Jimmy");
		model.addAttribute("user", user);
		
		logger.debug("……程序运行结束……");
		logger.info("……程序运行结束……");
		logger.warn("……程序运行结束……");
		logger.error("……程序运行结束……");
		
		return "home";
	}
}
