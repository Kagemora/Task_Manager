package com.example.domain.repository

interface TaskImportExportRepository {


    //экспорт задач
    suspend fun exportTasks(uri: String)

    //импорт задач
    suspend fun importTasks(uri: String)

}