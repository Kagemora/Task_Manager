package com.example.domain.model

class Task(
    var id: Int = UNSPECIFIED_ID,
    var data: Long,
    var time: Long,
    val title: String,
    val description: String,
    var notification: Boolean = true,
    var isCompleted: Boolean = false
) {
    companion object {

        const val UNSPECIFIED_ID = 0
    }
}