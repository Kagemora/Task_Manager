package com.example.domain.usecase

import com.example.domain.repository.NotificationRepository
import javax.inject.Inject

class SetNotificationSoundUseCase @Inject constructor(
    private val notificationRepository: NotificationRepository
) {
    suspend operator fun invoke(uri: String) = notificationRepository.setNotificationSound(uri)
}