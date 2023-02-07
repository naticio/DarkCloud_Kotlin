package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDto ( //this is the first level of the json object

    //use moshi fro data parsing
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto

)

//data class WeatherDto(
//    @field:Json(name = "hourly")
//    val weatherData: WeatherDataDto
//)