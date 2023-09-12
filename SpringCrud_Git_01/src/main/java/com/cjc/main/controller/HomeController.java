package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/save")
	public String saveDAta(@RequestBody Student s) {
		 hs.saveData(s);
		
		return "Data save";
		
	}

}
