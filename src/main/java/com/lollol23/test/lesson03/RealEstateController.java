package com.lollol23.test.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lollol23.test.lesson03.bo.RealEstateBO;
import com.lollol23.test.lesson03.model.RealEstate;

@RestController
public class RealEstateController {
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/lesson03/test01/1")
	public RealEstate test01_1(@RequestParam("id") int id) {
		
		
		return realEstateBO.getRealEstate(id);
	}
	
	@RequestMapping("/lesson03/test01/2")
	public List<RealEstate> test01_2(@RequestParam("rentPrice") int rentPrice) {
		return realEstateBO.getRealEstateTypeRentPrice(rentPrice);
	}
	
	@RequestMapping("/lesson03/test01/3")
	public List<RealEstate> test01_3(@RequestParam("area") int area, @RequestParam("price") int price ) {
		return realEstateBO.getRealEstate2(area, price);
	}
	
	
}
