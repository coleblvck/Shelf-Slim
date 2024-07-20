package com.coleblvck.shelfSlim.data.roomDatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.data.entities.text.TextDao
import com.coleblvck.shelfSlim.data.entities.widget.Widget
import com.coleblvck.shelfSlim.data.entities.widget.WidgetDao

@Database(entities = [Widget::class, Text::class], version = 1)
abstract class LocalRoomDatabase: RoomDatabase() {
    abstract fun widgetDao(): WidgetDao
    abstract fun textDao(): TextDao
}