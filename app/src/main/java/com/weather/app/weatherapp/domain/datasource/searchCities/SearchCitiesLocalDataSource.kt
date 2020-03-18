package com.weather.app.weatherapp.domain.datasource.searchCities

import androidx.lifecycle.LiveData
import com.weather.app.weatherapp.db.dao.CitiesForSearchDao
import com.weather.app.weatherapp.db.entity.CitiesForSearchEntity
import com.weather.app.weatherapp.domain.model.SearchResponse
import javax.inject.Inject


class SearchCitiesLocalDataSource @Inject constructor(private val citiesForSearchDao: CitiesForSearchDao) {

    fun getCityByName(cityName: String?): LiveData<List<CitiesForSearchEntity>> = citiesForSearchDao.getCityByName(cityName)

    fun insertCities(response: SearchResponse) {
        response.hits
            ?.map { CitiesForSearchEntity(it) }
            ?.let { citiesForSearchDao.insertCities(it) }
    }
}
