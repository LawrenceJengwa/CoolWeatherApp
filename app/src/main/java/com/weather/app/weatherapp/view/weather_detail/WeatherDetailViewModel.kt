package com.weather.app.weatherapp.view.weather_detail

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.weather.app.weatherapp.core.BaseViewModel
import com.weather.app.weatherapp.db.entity.ForecastEntity
import com.weather.app.weatherapp.domain.datasource.forecast.ForecastLocalDataSource
import com.weather.app.weatherapp.domain.model.ListItem
import javax.inject.Inject


class WeatherDetailViewModel @Inject constructor(private val forecastLocalDataSource: ForecastLocalDataSource) : BaseViewModel() {

    var weatherItem: ObservableField<ListItem> = ObservableField()
    private var forecastLiveData: LiveData<ForecastEntity> = MutableLiveData()
    var selectedDayDate: String? = null
    var selectedDayForecastLiveData: MutableLiveData<List<ListItem>> = MutableLiveData()

    fun getForecastLiveData() = forecastLiveData

    fun getForecast(): LiveData<ForecastEntity> {
        return forecastLocalDataSource.getForecast()
    }
}
