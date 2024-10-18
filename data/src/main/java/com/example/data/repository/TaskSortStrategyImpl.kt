package com.example.data.repository

import com.example.domain.model.Task
import com.example.domain.repository.TaskSortStrategy
import javax.inject.Inject

class TaskSortStrategyImpl @Inject constructor(

) : TaskSortStrategy{
    override fun sort(tasks: List<Task>): Result<List<Task>> {
        TODO("Not yet implemented")
    }

}