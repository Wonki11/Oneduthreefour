package com.onedumall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onedumall.dto.Product;
import com.onedumall.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;



	@GetMapping("/product")
	public String getProduct(Model model) {
		model.addAttribute("product", new Product());
		return "product"; // html 파일이름
	}

	@PostMapping("/product")
	public String insertProduct(@RequestParam("Product_option") String Product_option,
								@RequestParam("Product_count") int Product_count, 
								@RequestParam("Product_price") int Product_price,
								@RequestParam("Product_name") String Product_name) {

		
		System.out.println("Product_option : " + Product_option);
		System.out.println("Product_count : " + Product_count);
		System.out.println("Product_price : " + Product_price);
		System.out.println("Product_name : " + Product_name);

		productService.insertProduct(Product_option, Product_count, Product_price, Product_name);
		return "redirect:/";
	}
}

<<<<<<< HEAD
=======


>>>>>>> jinwoo-onedu
