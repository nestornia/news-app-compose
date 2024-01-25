package com.nestornia.newsapp.model.data

import com.google.gson.annotations.SerializedName

data class MealCategoryModel(
    @SerializedName("idCategory")
    val id: String,
    @SerializedName("strCategory")
    val mealCategory: String,
    @SerializedName("strCategoryThumb")
    val categoryImage: String,
    @SerializedName("strCategoryDescription")
    val categoryDescription: String
)
