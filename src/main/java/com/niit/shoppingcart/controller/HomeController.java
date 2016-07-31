package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

@Controller
public class HomeController {
	
	@Autowired
	User user;
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/")
	public ModelAndView myfun1()
	{
	  ModelAndView mv=new ModelAndView("/home");
	  return mv;
		
	}
	
	@RequestMapping("/register")
	public ModelAndView myfun()
	{
		
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("user", user);
		mv.addObject("isUserClickedRegisterHere","true");
		return mv;
		
	}
	@RequestMapping("/loginHere")
	public ModelAndView mylog()
	{
		
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("isUserClickedLogin","true");
		return mv;
		
	}
	@RequestMapping(value = "here/register", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user) {
	    userDAO.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("successMessage", "You are successfully register");

		return mv;
	}

}
