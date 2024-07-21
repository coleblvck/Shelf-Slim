package com.coleblvck.shelfSlim.data

import com.coleblvck.shelfSlim.Shelf
import com.coleblvck.shelfSlim.data.repositories.Repositories
import com.coleblvck.shelfSlim.data.roomDatabase.DatabaseAgent

class Warehouse(shelf: Shelf) {
    val utilityToolBox: UtilityToolBox = UtilityToolBox(shelf)
    val repositories: Repositories = Repositories(
        localRoomDatabase = DatabaseAgent.getLocalInstance(shelf.applicationContext))
}