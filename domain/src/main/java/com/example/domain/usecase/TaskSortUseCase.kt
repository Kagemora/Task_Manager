package com.example.domain.usecase

import com.example.domain.model.Task
import com.example.domain.repository.TaskSortStrategy
import javax.inject.Inject

class TaskSortUseCase @Inject constructor(
    private val taskSortStrategy: TaskSortStrategy
) {
    operator fun invoke(list: List<Task>) = taskSortStrategy.sort(list)
}