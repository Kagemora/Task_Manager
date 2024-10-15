package com.example.data.util

import com.example.domain.model.Result

suspend inline fun <T> safeCall(crossinline call: suspend () -> T): Result<T> {
    return try {
        Result.Success(call())
    } catch (e: Exception) {
        Result.Failure(e)
    }
}