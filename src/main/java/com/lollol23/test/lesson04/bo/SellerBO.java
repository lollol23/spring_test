package com.lollol23.test.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lollol23.test.lesson04.dao.SellerDAO;
import com.lollol23.test.lesson04.model.Seller;

@Service
public class SellerBO {
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickname, String url, double temperature) {
		return sellerDAO.addSeller(nickname, url, temperature);
	}
	
	public Seller getLastSeller() {
		return sellerDAO.selectLastSeller();
	}
	
	public Seller getSellerById(int id) {
		return sellerDAO.selectSellerById(id);
	}
}
