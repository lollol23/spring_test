package com.lollol23.test.lesson03.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lollol23.test.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateTypeRentPrice(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstate2(@Param("area") int area, @Param("price") int price);
}
