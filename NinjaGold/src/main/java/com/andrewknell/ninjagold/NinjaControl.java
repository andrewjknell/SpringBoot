package com.andrewknell.ninjagold;
import java.util.*;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaControl {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/gold", method=RequestMethod.POST)
	public String gold(HttpSession sesh,@RequestParam(value="goldy")String input) {
		Integer gold = (Integer)sesh.getAttribute("gold");

		if(gold == null) {
			gold = 0;
			sesh.setAttribute("gold", gold);
		}
		if(input.equals("cave")) {
			int addGold = (int)(Math.random()*6+5);
			gold = gold+addGold;
			sesh.setAttribute("gold", gold);
			return "index.jsp";
		} 
		else if(input.equals("farm")) {
			int addGold = (int)(Math.random()*11+10);
			gold = gold+addGold;
			sesh.setAttribute("gold", gold);
			return "index.jsp";
		} 
		else if(input.equals("house")) {
			int addGold = (int)(Math.random()*4+2);
			gold = gold+addGold;
			sesh.setAttribute("gold", gold);
			return "index.jsp";
		} 
		else if(input.equals("casino")) {
			int addGold = (int)(Math.random()*101-50);
			gold = gold+addGold;
			sesh.setAttribute("gold", gold);
			return "index.jsp";
		}
		else {
			return "index.jsp";
		}
	}
}
