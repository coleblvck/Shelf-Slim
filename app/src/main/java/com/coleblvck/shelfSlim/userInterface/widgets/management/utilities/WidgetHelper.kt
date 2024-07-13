package com.coleblvck.shelfSlim.userInterface.widgets.management.utilities

import com.coleblvck.shelfSlim.state.maximumWidgetAmount
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.WidgetTool
import com.coleblvck.shelfSlim.userInterface.widgets.state.WidgetsState
import okhttp3.internal.toImmutableList

class WidgetHelper(state: WidgetsState) {
    val addUserWidget: (AppWidgetData) -> Unit = { it ->
        if (state.userWidgets.widgets.value.size < maximumWidgetAmount) {
            val currentList = state.userWidgets.widgets.value.toMutableList()
            currentList.add(it)
            val newList = currentList.toImmutableList()
            state.userWidgets.setWidgets(newList)
        }
    }

    val removeUserWidget: (widgetId: Int, tool: WidgetTool) -> Unit = { widgetId, tool ->
        val currentList = state.userWidgets.widgets.value.toMutableList()
        tool.deleteWidgetId(widgetId)
        currentList.removeIf { it.appWidgetId == widgetId }
        val newList = currentList.toImmutableList()
        state.userWidgets.setWidgets(newList)
    }

    val userWidgetShift: (widgetData: AppWidgetData, direction: Int) -> Unit =
        { widgetData: AppWidgetData, direction: Int ->
            if (direction != 1 && direction != -1) {
                Unit
            } else {
                val currentList = state.userWidgets.widgets.value.toMutableList()
                val oldIndex = currentList.indexOf(widgetData)
                val newIndex = oldIndex + direction
                currentList.add(newIndex, currentList.removeAt(oldIndex))
                val newList = currentList.toImmutableList()
                state.userWidgets.setWidgets(newList)
            }
        }
}