package com.coleblvck.shelfSlim.data.entities.widget

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Widget")
data class Widget (
    @ColumnInfo(name = "id") @PrimaryKey val id: Int,
)