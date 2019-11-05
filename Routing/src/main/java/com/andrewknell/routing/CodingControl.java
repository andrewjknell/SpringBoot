package com.andrewknell.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class CodingControl {
	@RequestMapping("")
	public String index() {
		return "hello coding dojo!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "python/django was awesome";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "java/spring is better!";
	}
	
}
