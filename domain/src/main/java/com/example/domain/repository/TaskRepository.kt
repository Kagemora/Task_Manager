package com.example.domain.repository

import com.example.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {

    //получить список всех задач
    fun getTaskList(): Flow<List<Task>>

    //добавить задачу
    suspend fun addTask(task: Task)

    //удалить задачу
    suspend fun deleteTask(taskId: Int)

    //редактировать задачу
    suspend fun updateTask(task: Task)

}