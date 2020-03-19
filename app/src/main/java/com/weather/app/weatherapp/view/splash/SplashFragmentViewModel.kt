package com.weather.app.weatherapp.view.splash

import android.content.SharedPreferences
import com.weather.app.weatherapp.core.BaseViewModel
import javax.inject.Inject


class SplashFragmentViewModel @Inject constructor(var sharedPreferences: SharedPreferences) : BaseViewModel() {
    var navigateDashboard = false
}
