package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.onedumall.dto.CoffeeBeanTest;
import com.onedumall.service.CoffeeBeanTestService;

@Controller
public class CoffeeBeanTestController {
	@Autowired
	private CoffeeBeanTestService coffeeBeanTestService;
	
	@GetMapping("/coffeeBeanTest1copy2")
	public String coffeeBeanTest(Model model) {
		List<CoffeeBeanTest> coffeeBeanTests = coffeeBeanTestService.getAllCoffees();
		model.addAttribute("coffeeBeanTests", coffeeBeanTests);
		return "coffeeBeanTest1copy2";
	}
	
	@GetMapping("/coffeeBeanDetail/{coffee_id}")
	public String getCoffeeById(Model model, @PathVariable int coffee_id) {
		CoffeeBeanTest coffeeBeanTest = coffeeBeanTestService.getCoffeeById(coffee_id);
		model.addAttribute("coffeeBeanTest", coffeeBeanTest);
		return "coffeeBeanDetail";
	}
}