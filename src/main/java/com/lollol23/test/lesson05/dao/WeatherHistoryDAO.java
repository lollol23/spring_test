package com.lollol23.test.lesson05.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lollol23.test.lesson05.model.WeatherHistory;

@Repository
public interface WeatherHistoryDAO {
	public List<WeatherHistory> selectWeatherHistory();
	
	public int insertWeatherHistory(
			@Param("date") Date date
			, @Param("weather") String weather
			, @Param("temperatures") double temperatures
			, @Param("precipitation") double precipitation
			, @Param("microDust") String microDust
			, @Param("windSpeed") double windSpeed
			);
}


