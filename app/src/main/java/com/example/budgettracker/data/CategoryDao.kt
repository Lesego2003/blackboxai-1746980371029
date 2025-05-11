package com.example.budgettracker.data

import androidx.lifecycle.LiveData
import androidx.room.*

import com.example.budgettracker.data.model.Category

@Dao
interface CategoryDao {

    @Query("SELECT * FROM categories")
    fun getAllCategories(): LiveData<List<Category>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: Category)

    @Delete
    suspend fun deleteCategory(category: Category)
}
