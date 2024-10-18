package com.example.data.repository

import com.example.domain.model.Result
import com.example.domain.model.Task
import com.example.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(

) : TaskRepository{
    override fun getTaskList(): Flow<Result<List<Task>>> {
        TODO("Not yet implemented")
    }

    override suspend fun addTask(task: Task): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteTask(taskId: Int): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun updateTask(task: Task): Result<Unit> {
        TODO("Not yet implemented")
    }

}