package com.coleblvck.shelfSlim.data.repositories.textRepository

import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.data.roomDatabase.LocalRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocalTextRepository(private val localRoomDatabase: LocalRoomDatabase) {
    fun getByTitle(title: String): List<Text> = localRoomDatabase.textDao().getByTitle(title)
    fun insertText(text: Text) {
        CoroutineScope(Dispatchers.IO).launch {
            localRoomDatabase.textDao().insert(text)
        }
    }
}