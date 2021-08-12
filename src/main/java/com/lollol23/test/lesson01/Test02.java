package com.lollol23.test.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/test02")
public class Test02 {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> printListMap() {
		List<Map<String, Object>> list = new ArrayList<>(); 
		Map<String, Object> map = new HashMap<String, Object>() {
			{ 
				put("rate", 15);
				put("director", "봉준호");
				put("time", 131);
				put("title", "기생충");
			}
		};
		list.add(map);
		map = new HashMap<String, Object>() {
			{
				put("rate", 0);
				put("director", "로베르토 베니니");
				put("time", 116);
				put("title", "인생은 아름다워");
			}
		};
		list.add(map);
		map = new HashMap<String, Object>() {
			{
				put("rate", 12);
				put("director", "크리스토퍼 놀란");
				put("time", 147);
				put("title", "인셉션");
			}
		};
		list.add(map);
		map = new HashMap<String, Object>() {
			{
				put("rate", 19);
				put("director", "윤종빈");
				put("time", 133);
				put("title", "범죄와의 전쟁");
			}
		};
		list.add(map);
		map = new HashMap<String, Object>() {
			{
				put("rate", 15);
				put("director", "프란시스 로렌스");
				put("time", 137);
				put("title", "헝거게임");
			}
		};
		list.add(map);
		
		return list;
	}
	
	@RequestMapping("/2")
	public List<Post> printPostList() {
		Post post = new Post();
		List<Post> list = new ArrayList<>();
		
		post.setTitle("안녕하세요 가입인사 드립니다.");
		post.setUser("hagulu");
		post.setContent("안녕하세요 가입했어요, 앞으로 잘부탁 드립니다.");
		list.add(post);
		
		
		post.setTitle("헐 대박");
		post.setUser("bada");
		post.setContent("오늘 목요일이 였어.....금요일인줄");
		list.add(post);
		
		post.setTitle("오늘 데이트 한 이야기 해드릴게요");
		post.setUser("lollol23");
		post.setContent("....");
		list.add(post);
		
		return list;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Post> entity() {
		Post post = new Post();
		
		post.setTitle("안녕하세요 가입인사 드립니다.");
		post.setUser("hagulu");
		post.setContent("안녕하세요 가입했어요, 앞으로 잘부탁 드립니다.");
		
		ResponseEntity<Post> entity = new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
}
