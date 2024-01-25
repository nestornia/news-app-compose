package com.nestornia.newsapp.network

import com.nestornia.newsapp.model.api.MealsCategoriesApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {
    private const val BASE_URL = "www.themealdb.com/api/json/v1/1"
    val apiService: MealsCategoriesApi by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(MealsCategoriesApi::class.java)
    }
}