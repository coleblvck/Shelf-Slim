package com.coleblvck.shelfSlim.data.repositories.widgetRepository

import androidx.lifecycle.LiveData
import com.coleblvck.shelfSlim.data.roomDatabase.LocalRoomDatabase
import com.coleblvck.shelfSlim.data.entities.widget.Widget
import com.coleblvck.shelfSlim.data.entities.widget.WidgetDao

class LocalWidgetRepository(localRoomDatabase: LocalRoomDatabase): WidgetRepository {
    private val widgetDao: WidgetDao = localRoomDatabase.widgetDao()

    override fun getWidgets(): LiveData<List<Widget>> = widgetDao.getWidgets()

    override fun saveWidget(widget: Widget) = widgetDao.insertWidget(widget)

    override fun getWidgetById(id: Int): List<Widget> = widgetDao.getWidgetById(id)

    override fun deleteWidget(id: Int) = widgetDao.deleteById(id)

}