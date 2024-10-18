package com.example.data.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class TaskDbModel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val data: Long,
    val time: Long,
    val title: String,
    val description: String,
    val notification: Boolean = true,
    @ColumnInfo("is_completed") val isCompleted: Boolean = false
)