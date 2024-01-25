package com.nestornia.newsapp.ui.meals

import androidx.lifecycle.ViewModel
import com.nestornia.newsapp.model.data.MealCategoryModel
import com.nestornia.newsapp.model.data.MealsCategoriesResponse
import com.nestornia.newsapp.model.repository.MealsRepository

class MealCategoriesViewModel(private val mealsRepository: MealsRepository = MealsRepository()) : ViewModel() {

        fun getMealCategoriesList(): List<MealCategoryModel> {
            return mealsRepository.getMeals().mealCategoriesResponse
        }
}