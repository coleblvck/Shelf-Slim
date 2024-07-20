package com.coleblvck.shelfSlim.data.repositories.widgetRepository

import androidx.lifecycle.LiveData
import com.coleblvck.shelfSlim.data.entities.widget.Widget

interface WidgetRepository {
    fun getWidgets(): LiveData<List<Widget>>
    fun saveWidget(widget: Widget)
    fun getWidgetById(id: Int): List<Widget>
    fun deleteWidget(id: Int)
}