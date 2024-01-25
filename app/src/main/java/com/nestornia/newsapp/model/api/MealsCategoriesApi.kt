package com.nestornia.newsapp.model.api

import com.nestornia.newsapp.model.data.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.http.GET

interface MealsCategoriesApi {

    fun getMeals(): Call<MealsCategoriesResponse> {

    }
}