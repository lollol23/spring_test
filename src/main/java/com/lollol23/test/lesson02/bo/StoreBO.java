package com.lollol23.test.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lollol23.test.lesson02.dao.StoreDAO;
import com.lollol23.test.lesson02.model.Store;

@Service
public class StoreBO {
	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList() {
		return storeDAO.sellectStoreList();
	}
	
}
