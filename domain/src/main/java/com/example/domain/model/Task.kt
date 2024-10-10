package com.example.domain.model

class Task(
    val id: Int = UNSPECIFIED_ID,
    val data: Long,
    val time: Long,
    val title: String,
    val description: String,
    val notification: Boolean = true,
    val isCompleted: Boolean = false
) {
    companion object {

        const val UNSPECIFIED_ID = 0
    }
}