package com.lollol23.test.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lollol23.test.lesson04.bo.SellerBO;
import com.lollol23.test.lesson04.model.Seller;

@Controller
public class SellerController {
	@Autowired
	private SellerBO sellerBO;
	
	@RequestMapping("/lesson04/test01/1")
	public String test01() {
		return "lesson04/addSeller";
	}
	
	@PostMapping("/lesson04/test01/add_seller")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImageUrl") String url
			, @RequestParam("temperature") double temperature
			) {
		int count = sellerBO.addSeller(nickname, url, temperature);
		return "추가완료 : " + count;
	}
	
	@RequestMapping("/lesson04/test01/seller_info")
	@ResponseBody
	public String lastSeller(Model model, @RequestParam("id") int id) {
		if(id == -1) {
			Seller seller = sellerBO.getLastSeller();
			model.addAttribute("result", seller);
			model.addAttribute("subject", "판매자 정보");
			
			return "lesson04/sellerInfo";
		} else {
			return "11";
		}

	}
}
