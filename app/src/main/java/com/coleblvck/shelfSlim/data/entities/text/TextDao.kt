package com.coleblvck.shelfSlim.data.entities.text

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface TextDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(text: Text)

    @Query("SELECT * FROM Text WHERE title = :title")
    fun getByTitle(title: String): List<Text>

    @Query("DELETE FROM Text WHERE title = :title")
    fun deleteByTitle(title: String)
}