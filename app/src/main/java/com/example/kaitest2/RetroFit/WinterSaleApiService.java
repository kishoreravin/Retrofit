package com.example.kaitest2.RetroFit;

import com.example.kaitest2.Model.WinterSaleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WinterSaleApiService {
    @GET("/rest/V1/api/wintersale")
    public Call<WinterSaleResponse> getWinterSaleBanners();
}
