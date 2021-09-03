package com.lollol23.test.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lollol23.test.lesson06.bo.ReservationBO;

@Controller
@RequestMapping("/lesson06")
public class ReservationController {

	@Autowired
	private ReservationBO reservationBO;
	
	@GetMapping("/tongnamu")
	public String homeView() {
		return "/lesson06/tongnamuHome";
	}
	
	@GetMapping("/reservationList_view")
	public String reservationList_view(Model model) {
		
		model.addAttribute("reservationList", reservationBO.getReservationList());
		return "/lesson06/tongnamuReservationList";
	}
	
	@GetMapping("/do_reservation")
	public String doReservation() {
		return "/lesson06/tongnamuDoReservation";
	}
}
