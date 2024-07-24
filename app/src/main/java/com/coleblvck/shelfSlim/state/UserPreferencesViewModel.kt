package com.coleblvck.shelfSlim.state

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.coleblvck.shelfSlim.data.Warehouse
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferencesToolBox

class UserPreferencesViewModel(val store: DataStore<Preferences>, val warehouse: Warehouse): ViewModel() {

    val userPreferencesToolBox = UserPreferencesToolBox(store, warehouse)

    companion object {
        val Factory: (store: DataStore<Preferences>, warehouse: Warehouse) -> ViewModelProvider.Factory =
            { store: DataStore<Preferences>, warehouse: Warehouse ->
                object : ViewModelProvider.Factory {
                    @Suppress("UNCHECKED_CAST")
                    override fun <T : ViewModel> create(
                        modelClass: Class<T>,
                        extras: CreationExtras
                    ): T {
                        return UserPreferencesViewModel(
                            store = store,
                            warehouse = warehouse
                        ) as T
                    }
                }
            }
    }
}