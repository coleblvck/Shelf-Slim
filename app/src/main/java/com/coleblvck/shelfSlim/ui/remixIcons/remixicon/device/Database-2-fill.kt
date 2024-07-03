package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Database-2-fill`: ImageVector
    get() {
        if (`_database-2-fill` != null) {
            return `_database-2-fill`!!
        }
        `_database-2-fill` = Builder(name = "Database-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(21.0f, 14.9853f, 16.9706f, 17.0f, 12.0f, 17.0f)
                curveTo(7.0294f, 17.0f, 3.0f, 14.9853f, 3.0f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 11.9853f, 7.0294f, 14.0f, 12.0f, 14.0f)
                curveTo(16.9706f, 14.0f, 21.0f, 11.9853f, 21.0f, 9.5f)
                close()
                moveTo(3.0f, 14.5f)
                curveTo(3.0f, 16.9853f, 7.0294f, 19.0f, 12.0f, 19.0f)
                curveTo(16.9706f, 19.0f, 21.0f, 16.9853f, 21.0f, 14.5f)
                verticalLineTo(17.5f)
                curveTo(21.0f, 19.9853f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 19.9853f, 3.0f, 17.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(7.0294f, 12.0f, 3.0f, 9.9853f, 3.0f, 7.5f)
                curveTo(3.0f, 5.0147f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 5.0147f, 21.0f, 7.5f)
                curveTo(21.0f, 9.9853f, 16.9706f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_database-2-fill`!!
    }

private var `_database-2-fill`: ImageVector? = null
