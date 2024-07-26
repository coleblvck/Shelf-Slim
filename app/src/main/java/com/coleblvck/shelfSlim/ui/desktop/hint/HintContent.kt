package com.coleblvck.shelfSlim.ui.desktop.hint

import androidx.compose.ui.graphics.vector.ImageVector
import com.coleblvck.shelfSlim.content.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.Logos
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.design.`Quill-pen-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos.`Firefox-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Apps-2-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Dashboard-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Eye-2-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Eye-close-fill`


fun hintContent(dashboardPosition: String, dashIsHorizontal: Boolean, dashboardSwipeDirection: String, currentActionIcon: ImageVector): List<List<Any>>  {

    val list: List<List<Any>> =
        listOf(
            listOf(
                "- Long Press on ",
                currentActionIcon,
                " to re-map its function. If not visible, swipe $dashboardSwipeDirection on the $dashboardPosition dashboard."
            ),
            listOf(
                "- Tap on ",
                currentActionIcon,
                " or swipe $dashboardSwipeDirection on the $dashboardPosition dashboard to run custom action.",
                " Swipe $dashboardSwipeDirection on dashboard to re-map if disabled."
            ),
            listOf(
                "- Long Press on an app to uninstall it or to open its settings page."
            ),
            listOf(
                "- Double Tap an empty space on the $dashboardPosition dashboard to change its position.",
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
            if (dashIsHorizontal) {
                listOf(
                    "- Tap on dashboard clock or swipe down on empty desktop space to expand status bar."
                )
            } else {
                listOf(
                    "- Swipe down on empty desktop space to expand status bar."
                )
            },
            if (dashIsHorizontal) {
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
                "- Double Tap on empty desktop space to show/hide $dashboardPosition dashboard."
            ),
        )

    return list
}