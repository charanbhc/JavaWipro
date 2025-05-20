package com.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}