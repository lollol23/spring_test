package com.lollol23.test.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.lollol23.test.lesson04.model.Realtor;

@Repository
public interface RealtorDAO {
	public int insertRealtor(Realtor realtor);
}
