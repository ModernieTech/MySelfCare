package com.mobile.meredithbayne.myselfcare.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = arrayOf(SelfCareItem::class), version = 1, exportSchema = false)
abstract class SelfCareDatabase : RoomDatabase() {
    abstract fun selfCareItemDao() : SelfCareItemDao

    companion object {
        @Volatile private var INSTANCE: SelfCareDatabase? = null

        fun getInstance(context: Context): SelfCareDatabase =
                INSTANCE ?: synchronized(this) {
                    INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
                }

        private fun buildDatabase(context: Context) =
                Room.databaseBuilder(context.applicationContext,
                        SelfCareDatabase::class.java, "items")
                        .build()
    }
}