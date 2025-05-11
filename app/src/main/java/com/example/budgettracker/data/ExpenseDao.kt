package com.example.budgettracker.data

import androidx.lifecycle.LiveData
import androidx.room.*

import com.example.budgettracker.data.model.Expense

@Dao
interface ExpenseDao {

    @Query("SELECT * FROM expenses WHERE date BETWEEN :startDate AND :endDate")
    fun getExpensesBetweenDates(startDate: Long, endDate: Long): LiveData<List<Expense>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expense: Expense)

    @Delete
    suspend fun deleteExpense(expense: Expense)

    @Query("SELECT SUM(e.amount) FROM expenses e JOIN categories c ON e.categoryId = c.id WHERE c.id = :categoryId AND e.date BETWEEN :startDate AND :endDate")
    fun getTotalAmountByCategory(categoryId: Int, startDate: Long, endDate: Long): LiveData<Double>
}
