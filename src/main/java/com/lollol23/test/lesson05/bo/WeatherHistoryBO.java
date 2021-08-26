package com.lollol23.test.lesson05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lollol23.test.lesson05.dao.WeatherHistoryDAO;
import com.lollol23.test.lesson05.model.WeatherHistory;

@Service
public class WeatherHistoryBO {

	@Autowired
	private WeatherHistoryDAO weatherHistoryDAO;
	
	public List<WeatherHistory> getWeatherHistory() {
		return weatherHistoryDAO.selectWeatherHistory();
	}
}
