package com.coleblvck.shelfSlim.data.entities.text

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface TextDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(text: Text)

    @Query("SELECT * FROM Text WHERE title = :title")
    suspend fun getByTitle(title: String): List<Text>

    @Query("DELETE FROM Text WHERE title = :title")
    suspend fun deleteByTitle(title: String)

    @Query("UPDATE Text SET fontSize = :fontSize WHERE title = :title")
    suspend fun updateFontSize(title: String, fontSize: Int?)

    @Query("UPDATE Text SET colour = :colour WHERE title = :title")
    suspend fun updateColour(title: String, colour: Int?)

    @Query("UPDATE Text SET text = :text WHERE title = :title")
    suspend fun updateText(title: String, text: String)
}