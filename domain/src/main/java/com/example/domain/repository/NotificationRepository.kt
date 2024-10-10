package com.example.domain.repository

import kotlinx.coroutines.flow.Flow

interface NotificationRepository {

    //состояние уведомления
    fun isNotificationsEnabled(): Flow<Boolean>

    //установка звукового уведомления
    suspend fun setNotificationSound(uri: String)

}