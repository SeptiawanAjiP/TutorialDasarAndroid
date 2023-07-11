package com.dewakoding.tutorialdasaryoutube.preference

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 12/07/23 - 02.46

 **/
class DataStoreManager(val context: Context) {
    private val PREFERENCE_DATASTORE = "PREFERENCE"
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = PREFERENCE_DATASTORE)

    companion object {
        val NAME = stringPreferencesKey("NAME")
    }

    suspend fun saveToDataStore(str: String) {
        context.dataStore.edit {
            it[NAME] = str
        }
    }

    suspend fun getFromDataStore() = context.dataStore.data.map {
        it[NAME]?: ""
    }

}