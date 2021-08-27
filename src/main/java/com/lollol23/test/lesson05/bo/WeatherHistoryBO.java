package com.lollol23.test.lesson05.bo;

import java.util.Date;
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
	
	public int addWeatherHistory(Date date, String weather, double temperatures, double precipitation, String microDust, double windSpeed) {
		return weatherHistoryDAO.insertWeatherHistory(date, weather, temperatures, precipitation, microDust, windSpeed);
	}
}
