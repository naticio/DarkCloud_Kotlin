package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json

//dto =  data transfer object
data class WeatherDataDto ( //2nd level of json, under hourly bracket
    val time: List<String>,
    @field:Json(name = "temperature_2m")
    val temperatures: List<String>,
    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>, //this is to get the right icon, see the icon files
    @field:Json(name = "pressure_msl")
    val pressures: List<Double>,
    @field:Json(name = "windspeed_10m")
    val windspeeds: List<String>,
    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>
    )