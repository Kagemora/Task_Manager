package com.example.data.repository

import android.content.Context
import android.net.Uri
import com.example.domain.model.Result
import com.example.domain.repository.SettingsRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SettingsRepositoryImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : SettingsRepository {
    override suspend fun resetSettings(): Result<Unit> {
        TODO("Not yet implemented")
    }

    override fun isNotificationsEnabled(): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun setNotificationSound(uri: String): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun exportTasks(uri: String): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun importTasks(uri: String): Result<Unit> {
        TODO("Not yet implemented")
    }


}