package com.andrewknell.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
	
	@RequestMapping("/")
	public String home(@RequestParam(value="name",required=false)String name, Model model) {
		model.addAttribute("dojo", "Burbank");
		if(name == null) {
			name = "Human";
			model.addAttribute("name", name);
		} else {
		model.addAttribute("name", name);
		}
		return "index.jsp";
	}
	
}
