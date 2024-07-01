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

<<<<<<< HEAD
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
=======
	public void INSERTPRODUCT(String PRODUCT_OPTION, int PRODUCT_COUNT, int PRODUCT_PRICE, String PRODUCT_NAME) {
		Product product = new Product();
		product.setPRODUCT_OPTION(PRODUCT_OPTION);
		product.setPRODUCT_NAME(PRODUCT_NAME);
		product.setPRODUCT_PRICE(PRODUCT_PRICE);
		product.setPRODUCT_COUNT(PRODUCT_COUNT);
		log.info(" ************* product **********" + product.toString());

		productmapper.INSERTPRODUCT(product);
	}

}
>>>>>>> jinwoo-onedu
