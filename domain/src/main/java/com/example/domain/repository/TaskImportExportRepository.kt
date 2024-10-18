package com.example.domain.repository

import com.example.domain.model.Result

interface TaskImportExportRepository {


    //экспорт задач
    suspend fun exportTasks(uri: String): Result<Unit>

    //импорт задач
    suspend fun importTasks(uri: String): Result<Unit>

}