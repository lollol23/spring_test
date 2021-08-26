package com.lollol23.test.lesson05.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lollol23.test.lesson05.model.WeatherHistory;

@Repository
public interface WeatherHistoryDAO {
	public List<WeatherHistory> selectWeatherHistory();
}
