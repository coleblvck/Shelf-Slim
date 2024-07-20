package com.coleblvck.shelfSlim.data

import android.content.Context
import com.coleblvck.shelfSlim.data.repositories.Repositories
import com.coleblvck.shelfSlim.data.roomDatabase.DatabaseAgent

class Warehouse(context: Context) {
    val utilityToolBox: UtilityToolBox = UtilityToolBox(context)
    val repositories: Repositories = Repositories(
        localRoomDatabase = DatabaseAgent.getLocalInstance(context),
    )
}