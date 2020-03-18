package com.weather.app.weatherapp.ui.weather_detail.weatherHourOfDay

import androidx.databinding.ObservableField
import com.weather.app.weatherapp.core.BaseViewModel
import com.weather.app.weatherapp.domain.model.ListItem
import javax.inject.Inject


class WeatherHourOfDayItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<ListItem>()
}
