package com.example.budgettracker.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "expenses")
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: Long,
    val startTime: Long,
    val endTime: Long,
    val description: String,
    val categoryId: Int,
    val photoUri: String? = null
)
