package com.jap.demospringe13.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("/first")
	public void firstAPI() {
		System.out.println("Yes i have created my first api");
	}
	

	
}
