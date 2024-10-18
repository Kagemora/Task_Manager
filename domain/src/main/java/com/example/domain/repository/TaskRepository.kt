package com.example.domain.repository

import com.example.domain.model.Result
import com.example.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {

    //получить список всех задач
    fun getTaskList(): Flow<Result<List<Task>>>

    //добавить задачу
    suspend fun addTask(task: Task): Result<Unit>

    //удалить задачу
    suspend fun deleteTask(taskId: Int): Result<Unit>

    //редактировать задачу
    suspend fun updateTask(task: Task): Result<Unit>

}