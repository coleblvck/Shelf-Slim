package com.coleblvck.shelfSlim.data.entities.widget

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface WidgetDao {
    @Query("SELECT * FROM Widget")
    fun getWidgets(): LiveData<List<Widget>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWidget(widget: Widget)

    @Query("SELECT * FROM Widget WHERE id = :id")
    fun getWidgetById(id: Int): List<Widget>

    @Query("DELETE FROM Widget WHERE id = :id")
    fun deleteById(id: Int)
}