package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainNews> getNews(
            @Query("country") String country,
            @Query("pagesize") int pagesize,
            @Query("apikey") String apikey
    );

    @GET("top-headlines")
    Call<mainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pagesize") int pagesize,
            @Query("apikey") String apikey
    );

}

