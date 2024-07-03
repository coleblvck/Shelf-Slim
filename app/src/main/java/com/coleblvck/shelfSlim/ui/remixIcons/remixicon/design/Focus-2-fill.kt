package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Focus-2-fill`: ImageVector
    get() {
        if (`_focus-2-fill` != null) {
            return `_focus-2-fill`!!
        }
        `_focus-2-fill` = Builder(name = "Focus-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.4267f, 20.0f, 20.0f, 16.4267f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5733f, 16.4267f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5733f, 4.0f, 4.0f, 7.5733f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4267f, 7.5733f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(8.68f, 18.0f, 6.0f, 15.32f, 6.0f, 12.0f)
                curveTo(6.0f, 8.68f, 8.68f, 6.0f, 12.0f, 6.0f)
                curveTo(15.32f, 6.0f, 18.0f, 8.68f, 18.0f, 12.0f)
                curveTo(18.0f, 15.32f, 15.32f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1f, 10.9f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1f, 14.0f, 14.0f, 13.1f, 14.0f, 12.0f)
                curveTo(14.0f, 10.9f, 13.1f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_focus-2-fill`!!
    }

private var `_focus-2-fill`: ImageVector? = null
