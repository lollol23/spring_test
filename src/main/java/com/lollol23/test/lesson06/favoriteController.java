package com.lollol23.test.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lollol23.test.lesson06.bo.FavoriteBO;
import com.lollol23.test.lesson06.model.Favorite;

@Controller
@RequestMapping("/lesson06")
public class favoriteController {
	
	@Autowired
	private FavoriteBO favoriteBO;
	
	@GetMapping("/add_favorite")
	public String addFavorite() {
		return "/lesson06/addFavorite";
	}
	
	@GetMapping("/favorite_list")
	public String favoriteList(Model model) {
		model.addAttribute("result", favoriteBO.getFavoriteList());
		return "/lesson06/favoriteList";
	}
	
}
