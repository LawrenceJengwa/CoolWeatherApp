package com.weather.app.weatherapp

import android.os.Build
import com.weather.app.weatherapp.dao.CitiesForSearchDaoTest
import com.weather.app.weatherapp.dao.CurrentWeatherDaoTest
import com.weather.app.weatherapp.dao.ForecastDaoTest
import com.weather.app.weatherapp.repo.CurrentWeatherRepositoryTest
import com.weather.app.weatherapp.repo.ForecastRepositoryTest
import com.weather.app.weatherapp.viewModel.DashboardViewModelTest
import com.weather.app.weatherapp.viewModel.SearchViewModelTest
import com.weather.app.weatherapp.viewModel.WeatherDetailViewModelTest
import com.weather.app.weatherapp.viewState.CurrentWeatherViewStateTest
import com.weather.app.weatherapp.viewState.ForecastViewStateTest
import com.weather.app.weatherapp.viewState.SearchViewStateTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.robolectric.annotation.Config


@Config(sdk = [Build.VERSION_CODES.P])
@RunWith(Suite::class)
@Suite.SuiteClasses(
    CitiesForSearchDaoTest::class,
    CurrentWeatherDaoTest::class,
    CurrentWeatherViewStateTest::class,
    DashboardViewModelTest::class,
    ForecastDaoTest::class,
    ForecastViewStateTest::class,
    SearchViewStateTest::class,
    SearchViewModelTest::class,
    WeatherDetailViewModelTest::class,
    ForecastRepositoryTest::class,
    CurrentWeatherRepositoryTest::class
)
class TestSuite
