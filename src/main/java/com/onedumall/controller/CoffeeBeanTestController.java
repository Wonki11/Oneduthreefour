package com.onedumall.controller;

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
	public String coffeeBeanTest() {
		return "coffeeBeanTest1copy2";
	}
	
	@GetMapping("/coffeeDetail/{coffee_id}")
	public String getCoffeeById(Model model, @PathVariable int coffee_id) {
		CoffeeBeanTest coffeeBeanTest = coffeeBeanTestService.getCoffeeById(coffee_id);
		model.addAttribute("coffee", coffeeBeanTest);
		return "coffeeDetail";
	}
}