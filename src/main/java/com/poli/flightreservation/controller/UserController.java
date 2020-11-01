package com.poli.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poli.flightreservation.entity.User;
import com.poli.flightreservation.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	public UserRepository userRepository;

	@RequestMapping("/showRegistration")
	public String registerUser() {
		return "/user/userRegistration";
	}

	@RequestMapping(value = "/registerUser")
	public String register(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "/user/userLogin";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		
		User user = userRepository.findByEmail(email);
		System.out.println(" ---> email "+email+"   ----  password"+password);
		if(password.equals(user.getPassword()))
			return "/findFlights";
		else
			modelMap.put("msg", " Incorrect username or password");
		
		
		return "/user/userLogin";
	}
}
