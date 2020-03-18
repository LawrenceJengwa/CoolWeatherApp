package com.weather.app.weatherapp.ui.search

import com.weather.app.weatherapp.core.BaseViewState
import com.weather.app.weatherapp.db.entity.CitiesForSearchEntity
import com.weather.app.weatherapp.utils.domain.Status


class SearchViewState(
    val status: Status,
    val error: String? = null,
    val data: List<CitiesForSearchEntity>? = null
) : BaseViewState(status, error) {
    fun getSearchResult() = data
}
