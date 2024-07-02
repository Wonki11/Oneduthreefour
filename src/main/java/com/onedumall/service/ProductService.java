package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Product;
import com.onedumall.mapper.ProductMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

	@Autowired
	private ProductMapper productmapper;

	public void insertProduct(String Product_option, int Product_count, int Product_price, String Product_name) {
		Product product = new Product();
		product.setProduct_option(Product_option);
		product.setProduct_name(Product_name);
		product.setProduct_price(Product_price);
		product.setProduct_count(Product_count);
		log.info(" ************* product **********" + product.toString());

		productmapper.insertProduct(product);
	}

}
