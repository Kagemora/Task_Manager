package com.example.domain.repository

import com.example.domain.model.Task

interface TaskSortStrategy {
    fun sort(tasks: List<Task>): List<Task>
}