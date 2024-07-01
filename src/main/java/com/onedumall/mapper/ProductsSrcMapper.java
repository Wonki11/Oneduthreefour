package com.onedumall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.onedumall.dto.ProductsSrc;

@Mapper
public interface ProductsSrcMapper {
	
	List<ProductsSrc> searchProductsSrc(@Param("keyword") String keyword);
}
