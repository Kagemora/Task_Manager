package com.example.data.repository

import com.example.domain.repository.SettingsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SettingsRepositoryImpl @Inject constructor(

) : SettingsRepository {
    override suspend fun resetSettings() {
        TODO("Not yet implemented")
    }

    override fun isNotificationsEnabled(): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun setNotificationSound(uri: String) {
        TODO("Not yet implemented")
    }

    override suspend fun exportTasks(uri: String) {
        TODO("Not yet implemented")
    }

    override suspend fun importTasks(uri: String) {
        TODO("Not yet implemented")
    }

}