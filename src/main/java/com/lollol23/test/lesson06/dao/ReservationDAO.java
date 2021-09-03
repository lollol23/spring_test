package com.lollol23.test.lesson06.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lollol23.test.lesson06.model.Reservation;

@Repository
public interface ReservationDAO {
	public List<Reservation> selectReservation();
}
