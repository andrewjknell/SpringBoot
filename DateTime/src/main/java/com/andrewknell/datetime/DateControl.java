package com.andrewknell.datetime;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateControl {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date d = new Date();
		SimpleDateFormat day = new SimpleDateFormat("E");
		SimpleDateFormat num = new SimpleDateFormat("dd");
		SimpleDateFormat month = new SimpleDateFormat("MMM");
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		String newA = day.format(d);
		String newB = num.format(d);
		String newC = month.format(d);
		String newD = year.format(d);
		model.addAttribute("day", newA);
		model.addAttribute("num", newB);
		model.addAttribute("month", newC);
		model.addAttribute("year", newD);

		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date d = new Date();
		SimpleDateFormat time = new SimpleDateFormat("hh:mm a");
		String setTime = time.format(d);
		model.addAttribute("time", setTime);
		return "time.jsp";
		
	}
	
	@RequestMapping("/counts")
	public String counting(HttpSession sesh, Model model) {
		Integer counter = (Integer)sesh.getAttribute("count");
		if(counter ==null) {
			sesh.setAttribute("count", 0);
		} else {
			counter++;
			sesh.setAttribute("count", counter);
		}
		model.addAttribute("count", counter);
		return "count.jsp";
	}
}
