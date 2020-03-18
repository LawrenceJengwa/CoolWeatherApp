package com.weather.app.weatherapp.ui.dashboard.forecast

import androidx.databinding.ObservableField
import com.weather.app.weatherapp.core.BaseViewModel
import com.weather.app.weatherapp.domain.model.ListItem
import javax.inject.Inject


class ForecastItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<ListItem>()
}
