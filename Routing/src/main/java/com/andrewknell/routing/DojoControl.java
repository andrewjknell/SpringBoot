package com.andrewknell.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoControl {
	
	@RequestMapping("loc/{dojo}")
	public String dojo(@PathVariable("dojo")String dojo) {
		if(dojo.equals("dojo")) {
			return "the dojo is awesome!";
		}
		else if(dojo.equals("burbank-dojo")) {
			return "burbank dojo is the best";
		}
		else if(dojo.equals("san-jose")) {
			return "san jose is the best";
		} else {
			return "try again" + dojo;
		}
	}
	
}
