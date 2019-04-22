package com.trlogic.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trlogic.model.entity.User;
import com.trlogic.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		mav.addObject("user", user);
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping("/homePage")
	public ModelAndView homePage(@ModelAttribute("user") User user) {
		ModelAndView mav = new ModelAndView();
		if(userService.getUser(user.getUsername(), user.getPassword())) {
			System.out.println(user.getUsername() + " " + user.getPassword());
			mav.setViewName("homePage");
			return mav;
		}else {
			mav.addObject("hata", "Kullanıcı adı veya şifre yanlış");
			mav.setViewName("login");
			return mav;
		}
			
	}
	
	@RequestMapping("/signup")
	public ModelAndView signUp() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		mav.addObject("user", user);
		mav.setViewName("signup");
		return mav;
	}
	
	@RequestMapping("/userSave")
	public String userSave(@ModelAttribute User user) {
		userService.userSave(user);
		return "login";
	}
}
