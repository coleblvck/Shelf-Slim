package com.coleblvck.shelfSlim.state

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.coleblvck.shelfSlim.ShelfActivity
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

const val USER_PREFERENCES_KEY = "userPreferences"
val Context.shelfDataStore by preferencesDataStore(USER_PREFERENCES_KEY)

class PreferenceStore {
    lateinit var store: DataStore<Preferences>

    val keys = PreferenceKeys()


    val saveBoolean: (Preferences.Key<Boolean>, Boolean) -> Unit =
        { key, value -> runBlocking { store.edit { preferences -> preferences[key] = value } } }

    val saveString: (Preferences.Key<String>, String) -> Unit =
        { key, value -> runBlocking { store.edit { preferences -> preferences[key] = value } } }

    suspend fun getString(key: Preferences.Key<String>, defaultValue: String = ""): String {
        val preferences = store.data.first()
        return preferences[key] ?: defaultValue
    }

    suspend fun getBoolean(key: Preferences.Key<Boolean>, defaultValue: Boolean = false): Boolean {
        val preferences = store.data.first()
        return preferences[key] ?: defaultValue
    }


    fun initialize(activity: ShelfActivity) {
        store = activity.shelfDataStore
    }
}

class PreferenceKeys {
    val noteTextKey = stringPreferencesKey("noteText")
    val headerHeadingKey = stringPreferencesKey("headerHeading")
    val headerSubHeadingKey = stringPreferencesKey("headerSubHeading")
    val flowVisibilityKey = booleanPreferencesKey("flowVisibility")
    val dashboardVisibilityKey = booleanPreferencesKey("dashboardVisibility")
    val drawerTypeKey = stringPreferencesKey("drawerType")
    val customFunctionIconKey = stringPreferencesKey("customFunctionIcon")
    val customFunctionPackageKey = stringPreferencesKey("customFunctionPackage")
    val customFunctionActionTypeKey = stringPreferencesKey("customFunctionActionType")
    val dashboardPositionKey = stringPreferencesKey("dashboardPosition")
}