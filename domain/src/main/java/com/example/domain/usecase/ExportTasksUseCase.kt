package com.example.domain.usecase

import com.example.domain.repository.TaskImportExportRepository
import javax.inject.Inject

class ExportTasksUseCase @Inject constructor(
    private val taskImportExportRepository: TaskImportExportRepository
) {
    suspend operator fun invoke(uri: String) = taskImportExportRepository.exportTasks(uri)
}