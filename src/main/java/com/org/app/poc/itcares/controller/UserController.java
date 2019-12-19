package com.org.app.poc.itcares.controller;

import com.org.app.poc.itcares.service.UserService;

public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
}
