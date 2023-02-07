package com.plcoding.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

public interface WeatherApi {

    ///The suspend fun syntax indicates that the function is asynchronous and can be suspended while waiting for the API call to complete, which is a common pattern in Kotlin when making network requests.

    //fun to call the api
    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    //suspend fun getWeatherData
    suspend fun getWeatherData(
            @Query("latitude") lat: Double,
            @Query("longitude") long: Double
    ): WeatherDto //why is he putting this class here?
    ///The WeatherDto class is used as the return type for the getWeatherData function in the WeatherApi interface.
    // It likely represents the data that is returned from the API in a structured form, as an object with properties,
    // which makes it easier to work with the data in your code
}
