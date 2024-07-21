package com.coleblvck.shelfSlim.data.repositories.widgetRepository

import androidx.lifecycle.LiveData
import com.coleblvck.shelfSlim.data.entities.widget.Widget
import com.coleblvck.shelfSlim.data.entities.widget.WidgetDao
import com.coleblvck.shelfSlim.data.roomDatabase.LocalRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocalWidgetRepository(
    localRoomDatabase: LocalRoomDatabase,
) : WidgetRepository {
    private val widgetDao: WidgetDao = localRoomDatabase.widgetDao()

    override fun getWidgets(): LiveData<List<Widget>> = widgetDao.getWidgets()

    override fun saveWidget(widget: Widget)  {
        CoroutineScope(Dispatchers.IO).launch {
            widgetDao.insertWidget(widget)
        }
    }

    override fun getWidgetById(id: Int): List<Widget> = widgetDao.getWidgetById(id)

    override fun deleteWidget(id: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            widgetDao.deleteById(id)
        }
    }

}