package com.tejas.starter.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@RequestMapping("/hello")
	public String Hii() {
		return "Hii";
	}
}
