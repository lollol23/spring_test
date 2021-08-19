package com.lollol23.test.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lollol23.test.lesson04.model.Seller;

@Repository
public interface SellerDAO {
	public int addSeller(
			@Param("nickname") String nickname
			, @Param("profileImageUrl") String url
			, @Param("temperature") double temperature
			);
	
	public Seller selectLastSeller(); 
}
