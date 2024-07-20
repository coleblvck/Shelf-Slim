package com.coleblvck.shelfSlim.data.repositories

import com.coleblvck.shelfSlim.data.repositories.textRepository.LocalTextRepository
import com.coleblvck.shelfSlim.data.repositories.widgetRepository.LocalWidgetRepository
import com.coleblvck.shelfSlim.data.roomDatabase.LocalRoomDatabase

class Repositories(localRoomDatabase: LocalRoomDatabase) {
    val widgets = LocalWidgetRepository(localRoomDatabase)
    val texts = LocalTextRepository(localRoomDatabase)
}