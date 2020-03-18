package com.weather.app.weatherapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.weather.app.weatherapp.db.dao.CitiesForSearchDao
import com.weather.app.weatherapp.db.dao.CurrentWeatherDao
import com.weather.app.weatherapp.db.dao.ForecastDao
import com.weather.app.weatherapp.db.entity.CitiesForSearchEntity
import com.weather.app.weatherapp.db.entity.CurrentWeatherEntity
import com.weather.app.weatherapp.db.entity.ForecastEntity
import com.weather.app.weatherapp.utils.typeconverters.DataConverter

@Database(
    entities = [
        ForecastEntity::class,
        CurrentWeatherEntity::class,
        CitiesForSearchEntity::class

    ],
    version = 1,
        exportSchema = false

)
@TypeConverters(DataConverter::class)
abstract class WeatherDatabase : RoomDatabase() {

    abstract fun forecastDao(): ForecastDao

    abstract fun currentWeatherDao(): CurrentWeatherDao

    abstract fun citiesForSearchDao(): CitiesForSearchDao
}
