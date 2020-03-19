package com.weather.app.weatherapp.di.module

import com.weather.app.weatherapp.view.dashboard.DashboardFragment
import com.weather.app.weatherapp.view.search.SearchFragment
import com.weather.app.weatherapp.view.splash.SplashFragment
import com.weather.app.weatherapp.view.weather_detail.WeatherDetailFragment
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
