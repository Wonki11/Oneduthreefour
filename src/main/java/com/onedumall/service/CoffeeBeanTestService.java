package com.onedumall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.CoffeeBeanTest;
import com.onedumall.mapper.CoffeeBeanTestMapper;

@Service
public class CoffeeBeanTestService {
	@Autowired
	private CoffeeBeanTestMapper coffeeBeanTestMapper;
	
	//1. 커피 정보 전체 리스트
	public List<CoffeeBeanTest> getAllCoffees() {
		return coffeeBeanTestMapper.getAllCoffees();
	}
	//2. 커피 정보 하나만 가져오기
	public CoffeeBeanTest getCoffeeById(int coffee_id) {
		return coffeeBeanTestMapper.getCoffeeById(coffee_id);
	}
}
