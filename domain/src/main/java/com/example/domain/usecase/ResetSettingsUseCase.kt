package com.example.domain.usecase

import com.example.domain.repository.SettingsRepository
import javax.inject.Inject

class ResetSettingsUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {
    suspend operator fun invoke() = settingsRepository.resetSettings()
}