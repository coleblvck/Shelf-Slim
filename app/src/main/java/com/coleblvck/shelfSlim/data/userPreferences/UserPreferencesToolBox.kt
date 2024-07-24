package com.coleblvck.shelfSlim.data.userPreferences

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.coleblvck.shelfSlim.data.Warehouse
import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.state.stateTools.customDashboardAction.ActionType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch


const val USER_PREFERENCES_KEY = "userPreferences"
val Context.shelfDataStore by preferencesDataStore(name = USER_PREFERENCES_KEY)


class UserPreferencesToolBox(
    private val store: DataStore<Preferences>,
    private val warehouse: Warehouse,
) {

    val userPreferences = UserPreferences(
        flowNote = mutableStateOf(""),
        headerHeading = mutableStateOf("Welcome"),
        headerSubHeading = mutableStateOf("Double Tap"),
        flowIsVisible = mutableStateOf(true),
        dashboardIsVisible = mutableStateOf(true),
        drawerType = mutableStateOf("GRID"),
        customFunctionIcon = mutableStateOf("PULSE"),
        customFunctionPackage = mutableStateOf(""),
        customFunctionAction = mutableStateOf("PACKAGE_RUN"),
        dashboardPosition = mutableStateOf("BOTTOM")
    )


    fun toggleFlowVisibility() {
        updateFlowVisibility(!userPreferences.flowIsVisible.value)
    }

    fun toggleDashboardVisibility() {
        updateDashboardVisibility(!userPreferences.dashboardIsVisible.value)
    }

    /*
    Update preference fields
    -- Beginning
     */
    fun updateFlowNote(text: String) {
        userPreferences.flowNote.value = text
        warehouse.repositories.texts.insertText(
            Text(
                title = "flowNote",
                text = text
            )
        )
    }

    fun updateHeaderHeading(text: String) {
        userPreferences.headerHeading.value = text
        warehouse.repositories.texts.insertText(
            Text(
                title = "headerHeading",
                text = text
            )
        )
    }

    fun updateHeaderSubHeading(text: String) {
        userPreferences.headerSubHeading.value = text
        warehouse.repositories.texts.insertText(
            Text(
                title = "headerSubHeading",
                text = text
            )
        )
    }

    fun updateFlowVisibility(value: Boolean) {
        userPreferences.flowIsVisible.value = value
        saveBoolean(PreferenceKeys.FLOW_VISIBILITY, value)
    }

    private fun updateDashboardVisibility(value: Boolean) {
        userPreferences.dashboardIsVisible.value = value
        saveBoolean(PreferenceKeys.DASHBOARD_VISIBILITY, value)
    }

    fun updateDrawerType(value: String) {
        userPreferences.drawerType.value = value
        saveString(PreferenceKeys.DRAWER_TYPE, value)
    }

    fun updateCustomFunctionIcon(value: String) {
        userPreferences.customFunctionIcon.value = value
        saveString(PreferenceKeys.CUSTOM_FUNCTION_ICON, value)
    }

    fun updateCustomFunctionPackage(value: String) {
        userPreferences.customFunctionPackage.value = value
        if (value != "") {
            updateCustomFunctionAction(ActionType.PACKAGE_RUN.name)
        }
        saveString(PreferenceKeys.CUSTOM_FUNCTION_PACKAGE, value)
    }

    fun updateCustomFunctionAction(value: String) {
        userPreferences.customFunctionAction.value = value
        if (value == ActionType.NONE.name) {
            updateCustomFunctionPackage("")
        }
        saveString(PreferenceKeys.CUSTOM_FUNCTION_ACTION, value)
    }

    fun updateDashboardPosition(value: String) {
        userPreferences.dashboardPosition.value = value
        saveString(PreferenceKeys.DASHBOARD_POSITION, value)
    }

    /*
    End of preference related updates
     */


    private fun saveBoolean(key: Preferences.Key<Boolean>, value: Boolean) {
        CoroutineScope(Dispatchers.Default).launch {
            store.edit { preferences -> preferences[key] = value }
        }
    }

    private fun saveString(key: Preferences.Key<String>, value: String) {
        CoroutineScope(Dispatchers.Default).launch {
            store.edit { preferences -> preferences[key] = value }
        }
    }

    private suspend fun getTextFromRepo(title: String, fallback: String): String  {
        val filteredDatabaseTexts = warehouse.repositories.texts.getByTitle(title)
        return if (filteredDatabaseTexts.isNotEmpty()) {
            filteredDatabaseTexts[0].text
        } else {
            fallback
        }
    }

    init {
        CoroutineScope(Dispatchers.IO).launch {
            val preferences = store.data.first()
            userPreferences.flowNote.value = getTextFromRepo("flowNote", userPreferences.flowNote.value)
            userPreferences.headerHeading.value = getTextFromRepo("headerHeading", userPreferences.headerHeading.value)
            userPreferences.headerSubHeading.value = getTextFromRepo("headerSubHeading", userPreferences.headerSubHeading.value)
            userPreferences.flowIsVisible.value = preferences[PreferenceKeys.FLOW_VISIBILITY] ?: userPreferences.flowIsVisible.value
            userPreferences.dashboardIsVisible.value = preferences[PreferenceKeys.DASHBOARD_VISIBILITY] ?: userPreferences.dashboardIsVisible.value
            userPreferences.drawerType.value = preferences[PreferenceKeys.DRAWER_TYPE] ?: userPreferences.drawerType.value
            userPreferences.customFunctionIcon.value = preferences[PreferenceKeys.CUSTOM_FUNCTION_ICON] ?: userPreferences.customFunctionIcon.value
            userPreferences.customFunctionPackage.value = preferences[PreferenceKeys.CUSTOM_FUNCTION_PACKAGE] ?: userPreferences.customFunctionPackage.value
            userPreferences.customFunctionAction.value = preferences[PreferenceKeys.CUSTOM_FUNCTION_ACTION] ?: userPreferences.customFunctionAction.value
            userPreferences.dashboardPosition.value = preferences[PreferenceKeys.DASHBOARD_POSITION] ?: userPreferences.dashboardPosition.value
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