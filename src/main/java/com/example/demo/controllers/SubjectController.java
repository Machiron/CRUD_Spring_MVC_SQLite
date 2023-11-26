package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.SubjectService;

@Controller
@RequestMapping(value = { "", "subject"})
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@GetMapping
	public String index(ModelMap modelMap) {
		modelMap.put("subjects", subjectService.findAll());
		return "subject/index";
	}
	
}
