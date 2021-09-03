package com.lollol23.test.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lollol23.test.lesson06.dao.ReservationDAO;
import com.lollol23.test.lesson06.model.Reservation;

@Service
public class ReservationBO {
	
	@Autowired
	private ReservationDAO reservationDAO;
	
	public List<Reservation> getReservationList() {
		return reservationDAO.selectReservation();
	}
}
