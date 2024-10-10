package com.example.domain.repository

import kotlinx.coroutines.flow.Flow

interface SettingsRepository : NotificationRepository, TaskImportExportRepository {

    //сброс настроек
    suspend fun resetSettings()


}