package com.onedumall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.ProductsSrc;
import com.onedumall.mapper.ProductsSrcMapper;

@Service
public class ProductsSrcService {
	@Autowired
	private ProductsSrcMapper productSrcMapper;
	
	public List<ProductsSrc> searchProductsSrc(String keyword) {
		return productSrcMapper.searchProductsSrc(keyword);
	}
}
