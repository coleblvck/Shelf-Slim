package com.coleblvck.shelfSlim.userInterface.widgets.state

import com.coleblvck.shelfSlim.data.repositories.widgetRepository.LocalWidgetRepository
import com.coleblvck.shelfSlim.userInterface.widgets.management.UserWidgetsState
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.WidgetHelper

class WidgetsState(repo: LocalWidgetRepository) {
    val userWidgets = UserWidgetsState()
    val helper = WidgetHelper(this, repo)
}