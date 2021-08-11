package com.lollol23.test.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/test01")
public class Test01 {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "<h1>테스트 프로젝트완성</h1><br>해당 프로젝트를 통해 문제풀이를진행합니다.";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> printMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		
		return map;
	}
}