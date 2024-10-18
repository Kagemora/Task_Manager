package com.example.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.database.models.TaskDbModel

@Database(entities = [TaskDbModel::class], version = 1, exportSchema = false)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

    companion object {
        private var db: TaskDatabase? = null
        private const val DB_NAME = "tasks.db"
        private val LOCK = Any()

        fun getDatabase(context: Context): TaskDatabase {
            db?.let { return it }
            synchronized(LOCK) {
                db?.let { return it }
                val instance = Room.databaseBuilder(
                    context,
                    TaskDatabase::class.java,
                    DB_NAME
                ).build()
                db = instance
                return instance
            }
        }
    }
}