package com.programwind.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MasterController {
	
	@RequestMapping("/")
	public String givePageString()
	{
		return "home";
	}


}
