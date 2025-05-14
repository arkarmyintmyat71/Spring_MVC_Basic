package com.jpk.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GetParameterController {
	
	@GetMapping("/path-demo/{name}")
	public String getPathVariable(@PathVariable("name") String n, Model model) {
		model.addAttribute("message", "Path Variable: " + n);
		return "home";
	}

	@GetMapping("/path-demo-int/{id:\\d+}")
	public String getPathVariable(@PathVariable("id") int id, Model model) {
		model.addAttribute("message", "Path Variable: " + id);
		return "home";
	}

	@GetMapping("/path-demo")
	public String getQueryParameter(String name, Model model) {
		model.addAttribute("message", "Query Parameter: " + name);
		return "home";
	}
}