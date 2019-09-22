package com.example.kaitest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kaitest2.Model.WinterSaleResponse;
import com.example.kaitest2.RetroFit.RetrofitHelper;
import com.example.kaitest2.RetroFit.WinterSaleApiService;
import com.example.kaitest2.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onResume() {
        super.onResume();
        getWinterSaleResponse();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        getWinterSaleResponse();
    }

    public void getWinterSaleResponse(){
        final WinterSaleAdapter adapter = new WinterSaleAdapter();
        Retrofit retrofit = RetrofitHelper.getRetrofitInstance();
        WinterSaleApiService apiService = retrofit.create(WinterSaleApiService.class);
        Call<WinterSaleResponse> call = apiService.getWinterSaleBanners();
        call.enqueue(new Callback<WinterSaleResponse>() {
            @Override
            public void onResponse(Call<WinterSaleResponse> call, Response<WinterSaleResponse> response) {
                if(response.isSuccessful()&&response.body()!=null&&response.body().getResult()!=null){
                    adapter.setAdapterDetails(response.body().getResult().getWinterSaleBannerListSale(),getBaseContext());
                    binding.recyclerViewId.setLayoutManager(new LinearLayoutManager(getBaseContext(), RecyclerView.HORIZONTAL,false));
                    binding.recyclerViewId.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<WinterSaleResponse> call, Throwable t) {

            }
        });

    }
}
