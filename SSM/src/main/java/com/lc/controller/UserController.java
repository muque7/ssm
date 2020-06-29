package com.lc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lc.Pojo.User;
import com.lc.service.UserService;

@Controller
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Resource(name = "userService")
	private UserService userservice;
	
	/**
	 * 登录校验用户账号密码
	 * @param request
	 * @param user
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,User user,HttpSession session){
		
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}

}
