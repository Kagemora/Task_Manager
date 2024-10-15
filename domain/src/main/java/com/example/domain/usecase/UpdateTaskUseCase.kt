package com.example.domain.usecase

import com.example.domain.model.Task
import com.example.domain.repository.TaskRepository
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(
    private val taskRepository: TaskRepository
) {
    suspend operator fun invoke(task: Task) = taskRepository.updateTask(task)
}