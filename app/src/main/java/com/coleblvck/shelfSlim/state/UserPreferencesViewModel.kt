package com.coleblvck.shelfSlim.state

import androidx.compose.runtime.mutableStateOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.coleblvck.shelfSlim.data.Warehouse
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferences
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferencesToolBox
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UserPreferencesViewModel(val store: DataStore<Preferences>, val warehouse: Warehouse): ViewModel() {
    val userPreferences = UserPreferences(
        flowNote = mutableStateOf(""),
        headerHeading = mutableStateOf("Welcome"),
        headerSubHeading = mutableStateOf("Double Tap"),
        flowVisible = mutableStateOf(true),
        dashboardVisible = mutableStateOf(true),
        drawerType = mutableStateOf("GRID"),
        customFunctionIcon = mutableStateOf("Pulse"),
        customFunctionPackage = mutableStateOf(""),
        customFunctionAction = mutableStateOf("PACKAGE_RUN"),
        dashboardPosition = mutableStateOf("BOTTOM")
    )

    val userPreferencesToolBox = UserPreferencesToolBox(store, userPreferences, warehouse)

    private suspend fun getTextFromRepo(title: String, fallback: String): String = withContext(Dispatchers.IO) {
        val filteredDatabaseTexts = warehouse.repositories.texts.getByTitle(title)
        if (filteredDatabaseTexts.isNotEmpty()) {
            filteredDatabaseTexts[0].text
        } else fallback
    }

    init {
        viewModelScope.launch {
            val preferences = store.data.first()
            userPreferences.flowNote.value = getTextFromRepo("flowNote", userPreferences.flowNote.value)
            userPreferences.headerHeading.value = getTextFromRepo("headerHeading", userPreferences.headerHeading.value)
            userPreferences.headerSubHeading.value = getTextFromRepo("headerSubHeading", userPreferences.headerSubHeading.value)
            userPreferences.flowVisible.value = preferences[PreferenceKeys.FLOW_VISIBILITY] ?: true
            userPreferences.dashboardVisible.value = preferences[PreferenceKeys.DASHBOARD_VISIBILITY] ?: true
            userPreferences.drawerType.value = preferences[PreferenceKeys.DRAWER_TYPE] ?: "GRID"
            userPreferences.customFunctionIcon.value = preferences[PreferenceKeys.CUSTOM_FUNCTION_ICON] ?: "Pulse"
            userPreferences.customFunctionPackage.value = preferences[PreferenceKeys.CUSTOM_FUNCTION_PACKAGE] ?: ""
            userPreferences.customFunctionAction.value =
                preferences[PreferenceKeys.CUSTOM_FUNCTION_ACTION] ?: "PACKAGE_RUN"
            userPreferences.dashboardPosition.value = preferences[PreferenceKeys.DASHBOARD_POSITION] ?: "BOTTOM"
        }
    }


    private object PreferenceKeys {
        val FLOW_NOTE = stringPreferencesKey("noteText")
        val HEADER_HEADING = stringPreferencesKey("headerHeading")
        val HEADER_SUB_HEADING = stringPreferencesKey("headerSubHeading")
        val FLOW_VISIBILITY = booleanPreferencesKey("flowVisibility")
        val DASHBOARD_VISIBILITY = booleanPreferencesKey("dashboardVisibility")
        val DRAWER_TYPE = stringPreferencesKey("drawerType")
        val CUSTOM_FUNCTION_ICON = stringPreferencesKey("customFunctionIcon")
        val CUSTOM_FUNCTION_PACKAGE = stringPreferencesKey("customFunctionPackage")
        val CUSTOM_FUNCTION_ACTION = stringPreferencesKey("customFunctionActionType")
        val DASHBOARD_POSITION = stringPreferencesKey("dashboardPosition")
    }

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