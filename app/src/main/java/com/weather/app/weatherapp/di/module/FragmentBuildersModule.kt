package com.weather.app.weatherapp.di.module

import com.weather.app.weatherapp.ui.dashboard.DashboardFragment
import com.weather.app.weatherapp.ui.search.SearchFragment
import com.weather.app.weatherapp.ui.splash.SplashFragment
import com.weather.app.weatherapp.ui.weather_detail.WeatherDetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector
    abstract fun contributeWeatherDetailFragment(): WeatherDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchFragment(): SearchFragment
}
