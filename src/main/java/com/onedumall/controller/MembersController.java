package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping("/register_ssu")
	public String registerForm(Model model) {
		model.addAttribute("membersReg", new MembersReg());
		return "register_ssu";	
	}
	
	
	@PostMapping("/register_ssu")
	public String insertRegister(@ModelAttribute("membersReg")MembersReg membersReg, Model model) {
		log.info("1"+membersReg.getMembers_id());
		registerService.insertRegister(membersReg);
		log.info("2"+membersReg.getMembers_pw());
		
		model.addAttribute("msg","회원가입이 성공적으로 완료됐습니다.");		
		return "main_ssu";
		
	}
	@GetMapping("/main_ssu")
	public String showSearchForm(Model model) {
		return "main_ssu";
	}
	@PostMapping("/main_ssu")
	public String searchProductsSrc(Model model, @RequestParam("keyword")String keyword) {
	
		List<ProductsSrc> productSrc = productsService.searchProductsSrc(keyword);
		log.info("1");
		model.addAttribute("result" , productSrc);
		log.info("2");
		return "main_ssu";

	}
}