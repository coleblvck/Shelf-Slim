package com.coleblvck.shelfSlim.data.userPreferences

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.coleblvck.shelfSlim.data.Warehouse
import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.state.ActionType
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


const val USER_PREFERENCES_KEY = "userPreferences"
val Context.shelfDataStore by preferencesDataStore(name = USER_PREFERENCES_KEY)


class UserPreferencesToolBox(
    private val store: DataStore<Preferences>,
    private val preferences: UserPreferences,
    private val warehouse: Warehouse,
) {

    fun toggleFlowVisibility() {
        updateFlowVisibility(!preferences.flowVisible.value)
    }

    fun toggleDashboardVisibility() {
        updateDashboardVisibility(!preferences.dashboardVisible.value)
    }

    /*
    Update preference fields
    -- Beginning
     */
    fun updateFlowNote(text: String) {
        preferences.flowNote.value = text
        warehouse.repositories.texts.insertText(
            Text(
                title = "flowNote",
                text = text
            )
        )
    }

    fun updateHeaderHeading(text: String) {
        preferences.headerHeading.value = text
        warehouse.repositories.texts.insertText(
            Text(
                title = "headerHeading",
                text = text
            )
        )
    }

    fun updateHeaderSubHeading(text: String) {
        preferences.headerSubHeading.value = text
        warehouse.repositories.texts.insertText(
            Text(
                title = "headerSubHeading",
                text = text
            )
        )
    }

    fun updateFlowVisibility(value: Boolean) {
        preferences.flowVisible.value = value
        saveBoolean(PreferenceKeys.FLOW_VISIBILITY, value)
    }

    fun updateDashboardVisibility(value: Boolean) {
        preferences.dashboardVisible.value = value
        saveBoolean(PreferenceKeys.DASHBOARD_VISIBILITY, value)
    }

    fun updateDrawerType(value: String) {
        preferences.drawerType.value = value
        saveString(PreferenceKeys.DRAWER_TYPE, value)
    }

    fun updateCustomFunctionIcon(value: String) {
        preferences.customFunctionIcon.value = value
        saveString(PreferenceKeys.CUSTOM_FUNCTION_ICON, value)
    }

    fun updateCustomFunctionPackage(value: String) {
        preferences.customFunctionPackage.value = value
        if (value != "") {
            updateCustomFunctionAction(ActionType.PACKAGE_RUN.name)
        }
        saveString(PreferenceKeys.CUSTOM_FUNCTION_PACKAGE, value)
    }

    fun updateCustomFunctionAction(value: String) {
        preferences.customFunctionAction.value = value
        if (value == ActionType.NONE.name) {
            updateCustomFunctionPackage("")
        }
        saveString(PreferenceKeys.CUSTOM_FUNCTION_ACTION, value)
    }

    fun updateDashboardPosition(value: String) {
        preferences.dashboardPosition.value = value
        saveString(PreferenceKeys.DASHBOARD_POSITION, value)
    }

    /*
    End of preference related updates
     */


    @OptIn(DelicateCoroutinesApi::class)
    private fun saveBoolean(key: Preferences.Key<Boolean>, value: Boolean) {
        GlobalScope.launch(Dispatchers.Default) {
            store.edit { preferences -> preferences[key] = value }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun saveString(key: Preferences.Key<String>, value: String) {
        GlobalScope.launch(Dispatchers.Default) {
            store.edit { preferences -> preferences[key] = value }
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
}