package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("main")
public class MainController {
	
	
	
	@RequestMapping("home")
	public String viewHome()
	{
		return "views/home";
	}

}
