package com.andrewknell.survery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveryControl {
	
	@RequestMapping("/")
	public String sruvery() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String setForm(@RequestParam(value="name")String name,
							@RequestParam(value="dojo")String dojo,
							@RequestParam(value="language")String language,
							@RequestParam(value="comment", required=false)String comment, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("dojo", dojo);
		model.addAttribute("language", language);
		if(comment != null) {
			model.addAttribute("comment", comment);
		}
		return "result.jsp";
		
	}
	
}
