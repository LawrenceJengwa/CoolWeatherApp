package com.weather.app.weatherapp.view.search.result

import androidx.databinding.ObservableField
import com.weather.app.weatherapp.core.BaseViewModel
import com.weather.app.weatherapp.db.entity.CitiesForSearchEntity
import javax.inject.Inject


class SearchResultItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<CitiesForSearchEntity>()
}
