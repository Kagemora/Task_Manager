package com.example.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.database.models.TaskDbModel
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(taskDatabase: TaskDbModel)

    @Query("SELECT * FROM task")
    fun getTaskList(): Flow<List<TaskDbModel>>

    @Query("DELETE FROM task WHERE id=:id")
    suspend fun deleteTask(id: Int)


}