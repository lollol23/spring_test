package com.lollol23.test.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lollol23.test.lesson06.bo.FavoriteBO;
import com.lollol23.test.lesson06.model.Favorite;

@Controller
@RequestMapping("/lesson06")
public class favoriteController {
	
	@Autowired
	private FavoriteBO favoriteBO;
	
	@GetMapping("/add_favoriteList_view")
	public String addFavoriteView() {
		return "/lesson06/addFavorite";
	}
	
	@PostMapping("/add_favorite")
	public Map<String, String> addFavorite(
			@RequestParam("name") String name
			, @RequestParam("url") String url) {
		
		int count = favoriteBO.addFavorite(name, url);
		
		Map<String, String> result = new HashMap<>();
		// 성공 했을때 {"result" : "success"}
		// 실패 했을때 {"result" : "fail"};
		if(count == 1) {
			result.put("result", "success");
		} else {
			result.put("result", "fail");
		}
		
		return result;
	}
	
	@GetMapping("/favorite_list")
	public String favoriteList(Model model) {
		List<Favorite> favoriteList = favoriteBO.getFavoriteList();
		model.addAttribute("favoriteList", favoriteList);
		return "/lesson06/favoriteList";
	}
	
}
