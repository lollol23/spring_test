package com.lollol23.test.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lollol23.test.lesson02.model.Store;

@Repository
public interface StoreDAO {
	public List<Store> sellectStoreList();
}
