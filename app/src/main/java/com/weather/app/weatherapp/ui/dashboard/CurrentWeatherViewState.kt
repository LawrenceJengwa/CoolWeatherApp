package com.weather.app.weatherapp.ui.dashboard

import com.weather.app.weatherapp.core.BaseViewState
import com.weather.app.weatherapp.db.entity.CurrentWeatherEntity
import com.weather.app.weatherapp.utils.domain.Status


class CurrentWeatherViewState(
    val status: Status,
    val error: String? = null,
    val data: CurrentWeatherEntity? = null
) : BaseViewState(status, error) {
    fun getForecast() = data
}
