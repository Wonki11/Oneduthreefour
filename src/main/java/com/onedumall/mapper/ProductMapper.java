package com.onedumall.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.onedumall.dto.Product;







@Mapper		
public interface ProductMapper {

	
	public void insertProduct(Product product);
	
		

}
