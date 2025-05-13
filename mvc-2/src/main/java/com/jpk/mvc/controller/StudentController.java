package com.jpk.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@GetMapping
	public String index() {
		return "students";
	}
	
	@GetMapping("add")
	public String addNewStudent() {
		return "addNewStudent";
	}
	
	@PostMapping("send")
	public String sendStudent(@RequestParam String name, Model model) {
		model.addAttribute("message", "Hello" + name);
		return "addNewStudent";
	}
	
	@GetMapping("list")
	public String studentsList() {
		return "studentsList";
	}
}
