package com.sampleProject.TTBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sampleProject.TTBookingApp.model.User;
import com.sampleProject.TTBookingApp.service.UserService;

@Controller
@RequestMapping("/api/tickets")
public class UserController {
	   private final UserService userService;
	    
	    @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }
	    
	    @PostMapping("/addUser")
	    public User addUser(@RequestBody User user) {
	        return userService.addUser(user);
	    }
}
