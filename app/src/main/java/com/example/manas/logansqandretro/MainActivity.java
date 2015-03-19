package com.example.manas.logansqandretro;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends ActionBarActivity {
    private String url = "http://restcountries.eu/rest/v1";
    CountryInfoClass countryInfoClass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestData();
    }

    private void requestData() {

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(url)
                .build();
        API api = adapter.create(API.class);

        api.getWeather(new Callback<CountryInfoClass>() {
            @Override
            public void success(CountryInfoClass countryInfoClass, Response response) {
                countryInfoClass1 = countryInfoClass;

                Log.e(" asdasd ******", countryInfoClass.innerObjects.capital);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("Error", error.toString());
            }
        });

    }


}
