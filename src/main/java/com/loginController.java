package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;

@Controller
public class loginController {


@RequestMapping("/login")
public String getLoginData(@ModelAttribute Student s) {	

	System.out.println(s.getUsername());
	System.out.println(s.getPassword());
	
	return "welcome";
}
}
