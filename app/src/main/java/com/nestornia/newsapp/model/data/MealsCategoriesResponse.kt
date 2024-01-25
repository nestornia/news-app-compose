package com.nestornia.newsapp.model.data

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(
    @SerializedName("categories")
    val mealCategoriesResponse: List<MealCategoryModel>
)
