package com.example.kaitest2.RetroFit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    public static Retrofit getRetrofitInstance() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        return new Retrofit.Builder()
                .baseUrl("https://s1-app.netmeds.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

    }
}
