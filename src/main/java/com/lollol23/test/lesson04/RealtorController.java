package com.lollol23.test.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lollol23.test.lesson04.bo.RealtorBO;
import com.lollol23.test.lesson04.model.Realtor;

@Controller
@RequestMapping("/lesson04")
public class RealtorController {
	@Autowired
	private RealtorBO realtorBO;
	
	@RequestMapping("test02/1")
	public String addRealtor() {
		return "/lesson04/addRealtor";
	}
	
	@RequestMapping("/realatorInfo")
	public String realtorInfo(
			@ModelAttribute Realtor realtor, Model model 
			) {
		realtorBO.addRealtor(realtor);
		model.addAttribute("result", realtor);
		return "lesson04/realtorInfo";
	}
}
