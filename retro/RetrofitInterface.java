package com.example.zzong.Retrofit_practice.retro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("v2/5c66528c3000000b0f8c2711")
    public Call<List<ApiObject>> getAllPost();
}
