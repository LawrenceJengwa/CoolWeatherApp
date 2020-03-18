package com.weather.app.weatherapp.ui.dashboard

import com.weather.app.weatherapp.core.BaseViewState
import com.weather.app.weatherapp.db.entity.ForecastEntity
import com.weather.app.weatherapp.utils.domain.Status


class ForecastViewState(
    val status: Status,
    val error: String? = null,
    val data: ForecastEntity? = null
) : BaseViewState(status, error) {
    fun getForecast() = data
}
