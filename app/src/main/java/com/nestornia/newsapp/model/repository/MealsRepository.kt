package com.nestornia.newsapp.model.repository

import com.nestornia.newsapp.model.data.MealsCategoriesResponse

class MealsRepository {

    suspend fun getMeals(): MealsCategoriesResponse = MealsCategoriesResponse(arrayListOf())
}