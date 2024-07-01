package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onedumall.dto.MembersReg;
import com.onedumall.dto.ProductsSrc;
import com.onedumall.service.ProductsSrcService;
import com.onedumall.service.RegisterMemService;


import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class MembersController {
	
	@Autowired
	private RegisterMemService registerService;
	@Autowired
	private ProductsSrcService productsService;
	
	@GetMapping("/")
	public String mainForm(Model model) {
		
		return"Main_ssu";
	}
	@GetMapping("/Main_ssu")
	public String mainForm2(Model model) {
		
		return"Main_ssu";
	}
	@GetMapping("/Register_ssu")
	public String registerForm(Model model) {
		model.addAttribute("members", new MembersReg());
		return "Register_ssu";	
	}
	
	
	@PostMapping("/Register_ssu")
	public String insertRegister(MembersReg members, Model model) {
		log.info("1"+members.getMembers_id());
		registerService.insertRegister(members);
		log.info("2"+members.getMembers_pw());
		model.addAttribute("msg","회원가입이 성공적으로 완료됐습니다.");		
		return "Main_ssu";
		
	}
	@GetMapping("/Main_ssu")
	public String showSearchForm(Model model) {
		return "Main_ssu";
	}
	@PostMapping("/Main_ssu")
	public String searchProducts(Model model, @RequestParam("keyword")String keyword) {
		
		List<ProductsSrc> product = productsService.searchProductsSrc(keyword);
		log.info("1");
		model.addAttribute("result" , product);
		log.info("2");
		return "Main_ssu";
	}
}
