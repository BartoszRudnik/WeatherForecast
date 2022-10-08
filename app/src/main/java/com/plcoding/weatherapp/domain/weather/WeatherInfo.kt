package com.plcoding.weatherapp.domain.weather

import com.plcoding.weatherapp.data.remote.WeatherDataDto

data class WeatherInfo(
    val weatherDataDtoPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherDataDto: WeatherData?
)
