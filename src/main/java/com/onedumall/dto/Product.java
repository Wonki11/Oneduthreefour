package com.onedumall.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {

	
	private String Product_name;
	private String Product_option;
	private int Product_price;
	private int Product_count;
}