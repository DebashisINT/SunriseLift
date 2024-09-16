package com.breezefieldsalessunriselift.features.weather.api

import com.breezefieldsalessunriselift.base.BaseResponse
import com.breezefieldsalessunriselift.features.task.api.TaskApi
import com.breezefieldsalessunriselift.features.task.model.AddTaskInputModel
import com.breezefieldsalessunriselift.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalessunriselift.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}