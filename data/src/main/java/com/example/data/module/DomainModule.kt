package com.example.data.module

import com.example.data.repository.SettingsRepositoryImpl
import com.example.data.repository.TaskRepositoryImpl
import com.example.domain.repository.SettingsRepository
import com.example.domain.repository.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DomainModule {

    @Binds
    @Singleton
    fun bindSettingsRepository(bsr: SettingsRepositoryImpl): SettingsRepository

    @Binds
    @Singleton
    fun bindTaskRepository(btr: TaskRepositoryImpl): TaskRepository

    @Binds
    @Singleton
    fun bindTaskSortStrategy(btss: TaskRepositoryImpl): TaskRepository
}