package com.coleblvck.shelfSlim.contentManagement

import androidx.compose.ui.graphics.vector.ImageVector
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Health
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Pen-nib-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Pencil-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.health.`Pulse-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Star-fill`

enum class IconMap(val vector: ImageVector) {
    PULSE(RemixIcon.Health.`Pulse-fill`),
    PEN(RemixIcon.Design.`Pen-nib-fill`),
    PENCIL(RemixIcon.Design.`Pencil-fill`),
    STAR(RemixIcon.System.`Star-fill`)
}


val getIconMapVector: (String) -> ImageVector = {
    IconMap.valueOf(it.uppercase()).vector
}