package com.onedumall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onedumall.dto.CoffeeBeanTest;

@Mapper
public interface CoffeeBeanTestMapper {
	//1. 커피 정보 전체 리스트
	List<CoffeeBeanTest> getAllCoffees();
	//2. 커피 정보 하나만 가져오기
	CoffeeBeanTest getCoffeeById(int coffee_id);
}
