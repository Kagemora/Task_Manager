package com.example.data.module

import android.content.Context
import com.example.data.database.TaskDao
import com.example.data.database.TaskDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideTaskDao(@ApplicationContext context: Context): TaskDao =
        TaskDatabase.getDatabase(context).taskDao()

}