package com.coleblvck.shelfSlim.data.roomDatabase

import android.content.Context
import androidx.room.Room

class DatabaseAgent private constructor(){
    companion object {
        @Volatile
        private var localInstance: LocalRoomDatabase? = null

        fun getLocalInstance(context: Context): LocalRoomDatabase =
            localInstance ?: synchronized(this) {
                localInstance ?: Room.databaseBuilder(
                    context.applicationContext,
                    LocalRoomDatabase::class.java,
                    "widget_database"
                ).build().also { localInstance = it }
            }
    }
}