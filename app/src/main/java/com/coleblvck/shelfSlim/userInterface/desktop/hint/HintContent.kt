package com.coleblvck.shelfSlim.userInterface.desktop.hint

import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Logos
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Quill-pen-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos.`Firefox-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Apps-2-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Dashboard-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Eye-2-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Eye-close-fill`
import com.coleblvck.shelfSlim.state.CustomFunction
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopUiState


class HintContent(desktopUiState: DesktopUiState, private val customFunction: CustomFunction) {
    private val dashboardState = desktopUiState.dashboard

    val dashboardPosition: () -> String = {
        dashboardState.currentPosition.value.name.lowercase()
    }

    val dashboardSwipeDirection: () -> String = {
        if (dashboardState.dashIsHorizontal()) {
            "left"
        } else {
            "up"
        }
    }

    val list: () -> List<List<Any>> = {
        listOf(
            listOf(
                "- !NB: Note that added widgets currently won't persist if the app gets killed.",
                " There's also a current limit of four(4) widgets, due to an issue with widgets that have scrolling elements, might fix soon."
            ),
            listOf(
                "- Long Press on ",
                customFunction.currentIcon.value,
                " to re-map its function. If not visible, swipe ${dashboardSwipeDirection()} on the ${dashboardPosition()} dashboard."
            ),
            listOf(
                "- Tap on ",
                customFunction.currentIcon.value,
                " or swipe ${dashboardSwipeDirection()} on the ${dashboardPosition()} dashboard to run custom action.",
                " Swipe ${dashboardSwipeDirection()} on dashboard to re-map if disabled."
            ),
            listOf(
                "- Long Press on an app to uninstall it or to open its settings page."
            ),
            listOf(
                "- Double Tap an empty space on the ${dashboardPosition()} dashboard to change its position.",
                " The dashboard clock is currently not available in the vertical dashboard positions."
            ),
            listOf(
                "- Long Press on header to edit header text. Swipe left on header or tap ",
                RemixIcon.Design.`Quill-pen-fill`,
                " to take a quick note.",
            ),
            listOf(
                "- Tap on ",
                RemixIcon.System.`Eye-2-fill`,
                " or ",
                RemixIcon.System.`Eye-close-fill`,
                " to hide/show header and note cards."
            ),
            listOf(
                "- Tap on ",
                RemixIcon.Logos.`Firefox-fill`,
                " during any app drawer search for a quick website visit or Google search."
            ),
            if (dashboardState.dashIsHorizontal()) {
                listOf(
                    "- Tap on dashboard clock or swipe down on empty desktop space to expand status bar."
                )
            } else {
                listOf(
                    "- Swipe down on empty desktop space to expand status bar."
                )
            },
            if (dashboardState.dashIsHorizontal()) {
                listOf(
                    "- Long Press on dashboard clock to show/hide system bars."
                )
            } else {
                listOf()
            },
            listOf(
                "- Long Press on ",
                RemixIcon.System.`Apps-2-fill`,
                " or ",
                RemixIcon.System.`Dashboard-fill`,
                " to change the App Drawer layout."
            ),
            listOf(
                "- Double Tap on empty desktop space to show/hide ${dashboardPosition()} dashboard."
            ),
        )
    }
}