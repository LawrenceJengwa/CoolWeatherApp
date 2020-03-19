package com.weather.app.weatherapp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.weather.app.weatherapp.di.ViewModelFactory
import com.weather.app.weatherapp.di.key.ViewModelKey
import com.weather.app.weatherapp.view.dashboard.DashboardFragmentViewModel
import com.weather.app.weatherapp.view.dashboard.forecast.ForecastItemViewModel
import com.weather.app.weatherapp.view.main.MainActivityViewModel
import com.weather.app.weatherapp.view.search.SearchViewModel
import com.weather.app.weatherapp.view.search.result.SearchResultItemViewModel
import com.weather.app.weatherapp.view.splash.SplashFragmentViewModel
import com.weather.app.weatherapp.view.weather_detail.WeatherDetailViewModel
import com.weather.app.weatherapp.view.weather_detail.weatherHourOfDay.WeatherHourOfDayItemViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @IntoMap
    @Binds
    @ViewModelKey(SplashFragmentViewModel::class)
    abstract fun provideSplashFragmentViewModel(splashFragmentViewModel: SplashFragmentViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun provideMainViewModel(mainActivityViewModel: MainActivityViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(DashboardFragmentViewModel::class)
    abstract fun provideDashboardFragmentViewModel(dashboardFragmentViewModel: DashboardFragmentViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(ForecastItemViewModel::class)
    abstract fun provideForecastItemViewModel(forecastItemViewModel: ForecastItemViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(WeatherDetailViewModel::class)
    abstract fun provideWeatherDetailViewModel(weatherDetailViewModel: WeatherDetailViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(WeatherHourOfDayItemViewModel::class)
    abstract fun provideWeatherHourOfDayItemViewModel(weatherHourOfDayItemViewModel: WeatherHourOfDayItemViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(SearchViewModel::class)
    abstract fun provideSearchViewModel(searchViewModel: SearchViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(SearchResultItemViewModel::class)
    abstract fun provideSearchResultItemViewModel(searchResultItemViewModel: SearchResultItemViewModel): ViewModel
}
