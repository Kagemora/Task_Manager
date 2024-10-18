package com.example.domain.repository

import com.example.domain.model.Result

interface SettingsRepository : NotificationRepository, TaskImportExportRepository {

    //сброс настроек
    suspend fun resetSettings(): Result<Unit>


}