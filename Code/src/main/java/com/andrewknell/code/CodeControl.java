package com.andrewknell.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeControl {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/guess", method=RequestMethod.POST)
	public String guess(@RequestParam(value="guess")String guess) {
		if(guess.equals("bushido")) {
			return "redirect:/correct";
		} else {
			return "redirect:/wrong";
		}
	}
	
	@RequestMapping("/correct")
	public String right() {
		return "correct.jsp";
	}
	
	@RequestMapping("/wrong")
	public String wrong(RedirectAttributes rA) {
		rA.addFlashAttribute("error", "try again!");
		return "redirect:/";
	}
}
