package com.breezefieldsalessunriselift.features.weather.api

import com.breezefieldsalessunriselift.features.task.api.TaskApi
import com.breezefieldsalessunriselift.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}