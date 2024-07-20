package com.coleblvck.shelfSlim.data.entities.text

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Text")
data class Text (
    @ColumnInfo(name = "title") @PrimaryKey val title: String,
    @ColumnInfo(name = "text") val text: String,
)