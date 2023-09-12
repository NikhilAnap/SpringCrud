package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/getsingle/{sId}")
	public ResponseEntity<Student> singledata(@PathVariable int sId){
	
		Student stu=hs.singledata(sId);
		
		
		return new ResponseEntity<Student>(stu, HttpStatus.OK);
		
	}
	
	@PutMapping("/upadate")
 public ResponseEntity<Student> updatedata(@RequestBody Student s){
		
	hs.saveData(s);
		
		return new ResponseEntity<Student>( HttpStatus.OK);
		
		
	}



} 
