package com.example.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Task(
    val id: Int = UNSPECIFIED_ID,
    var data: Long,
    var time: Long,
    val title: String,
    val description: String,
    var notification: Boolean = true,
    var isCompleted: Boolean = false
) : Parcelable {
    companion object {

        const val UNSPECIFIED_ID = 0
    }
}