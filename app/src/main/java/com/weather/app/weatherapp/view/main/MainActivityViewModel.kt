package com.weather.app.weatherapp.view.main

import androidx.databinding.ObservableField
import com.weather.app.weatherapp.core.BaseViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject internal constructor() : BaseViewModel() {
    var toolbarTitle: ObservableField<String> = ObservableField()
}
