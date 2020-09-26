package com.vti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "sample")
public class SampleController {

	@GetMapping
	public String sample(Model model) {
		model.addAttribute("message", "Test get sample Spring MVC");
		return "sample";
	}
}
