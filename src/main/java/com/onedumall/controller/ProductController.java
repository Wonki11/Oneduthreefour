package com.onedumall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onedumall.dto.Product;
import com.onedumall.service.ProductService;


<<<<<<< HEAD

=======
>>>>>>> jinwoo-onedu
@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String getStart() {
<<<<<<< HEAD
		return "index";
=======
		return "product-index";
>>>>>>> jinwoo-onedu
	}

	@GetMapping("/product")
	public String getProduct(Model model) {
		model.addAttribute("product", new Product());
		return "product"; // html 파일이름
	}

	@PostMapping("/product")
<<<<<<< HEAD
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
=======
	public String INSERTPRODUCT(@RequestParam("PRODUCT_OPTION") String PRODUCT_OPTION,
								@RequestParam("PRODUCT_COUNT") int PRODUCT_COUNT, 
								@RequestParam("PRODUCT_PRICE") int PRODUCT_PRICE,
								@RequestParam("PRODUCT_NAME") String PRODUCT_NAME) {

		
		System.out.println("PRODUCT_OPTION : " + PRODUCT_OPTION);
		System.out.println("PRODUCT_COUNT : " + PRODUCT_COUNT);
		System.out.println("PRODUCT_PRICE : " + PRODUCT_PRICE);
		System.out.println("PRODUCT_NAME : " + PRODUCT_NAME);

		productService.INSERTPRODUCT(PRODUCT_OPTION, PRODUCT_COUNT, PRODUCT_PRICE, PRODUCT_NAME);
		return "redirect:/";
	}
}
>>>>>>> jinwoo-onedu
