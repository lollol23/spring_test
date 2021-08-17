package com.lollol23.test.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lollol23.test.lesson03.DAO.RealEstateDAO;
import com.lollol23.test.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(int id) {
		return realEstateDAO.selectRealEstate(id);
	}
	
	public List<RealEstate> getRealEstateTypeRentPrice(int rentPrice) {
		return realEstateDAO.selectRealEstateTypeRentPrice(rentPrice);
	}
	
	public List<RealEstate> getRealEstate2(int area, int price) {
		return realEstateDAO.selectRealEstate2(area, price);
	}
	
	public int addRealEstateObject(RealEstate realEstate) {
		return realEstateDAO.insertRealEstateObject(realEstate);
	}
	
	public int addRealEstate(int realtorId, String address, int area, String type, int price, int rentPrice) {
		return realEstateDAO.insertRealEstate(realtorId, address, area, type, price, rentPrice);
	}
}
