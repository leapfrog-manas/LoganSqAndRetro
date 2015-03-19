package com.example.manas.logansqandretro;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Manas on 3/19/2015.
 */
public interface API {

    @GET("/all")
    void getWeather(retrofit.Callback<CountryInfoClass> callback);

}
