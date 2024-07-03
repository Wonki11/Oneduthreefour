package com.onedumall.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CoffeeBeanTest {
	private int coffee_id;
	private String coffee_name;
	private String coffee_description;
	private String coffee_cuppingnote;
	private String coffee_tastingmap_sour;
	private String coffee_tastingmap_bitter;
	private String coffee_tastingmap_sweet;
	private String coffee_tastingmap_body;
	private String coffee_tastingmap_flavor;
}
