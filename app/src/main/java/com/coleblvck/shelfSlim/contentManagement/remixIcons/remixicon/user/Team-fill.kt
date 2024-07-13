package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.UserGroup

public val UserGroup.`Team-fill`: ImageVector
    get() {
        if (`_team-fill` != null) {
            return `_team-fill`!!
        }
        `_team-fill` = Builder(name = "Team-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(14.2091f, 10.0f, 16.0f, 8.2091f, 16.0f, 6.0f)
                curveTo(16.0f, 3.7909f, 14.2091f, 2.0f, 12.0f, 2.0f)
                curveTo(9.7909f, 2.0f, 8.0f, 3.7909f, 8.0f, 6.0f)
                curveTo(8.0f, 8.2091f, 9.7909f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(5.5f, 13.0f)
                curveTo(6.8807f, 13.0f, 8.0f, 11.8807f, 8.0f, 10.5f)
                curveTo(8.0f, 9.1193f, 6.8807f, 8.0f, 5.5f, 8.0f)
                curveTo(4.1193f, 8.0f, 3.0f, 9.1193f, 3.0f, 10.5f)
                curveTo(3.0f, 11.8807f, 4.1193f, 13.0f, 5.5f, 13.0f)
                close()
                moveTo(21.0f, 10.5f)
                curveTo(21.0f, 11.8807f, 19.8807f, 13.0f, 18.5f, 13.0f)
                curveTo(17.1193f, 13.0f, 16.0f, 11.8807f, 16.0f, 10.5f)
                curveTo(16.0f, 9.1193f, 17.1193f, 8.0f, 18.5f, 8.0f)
                curveTo(19.8807f, 8.0f, 21.0f, 9.1193f, 21.0f, 10.5f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.7614f, 11.0f, 17.0f, 13.2386f, 17.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 13.2386f, 9.2386f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(5.0f, 15.9999f)
                curveTo(5.0f, 15.307f, 5.1007f, 14.6376f, 5.2882f, 14.0056f)
                lineTo(5.1186f, 14.0204f)
                curveTo(3.365f, 14.2104f, 2.0f, 15.6958f, 2.0f, 17.4999f)
                verticalLineTo(21.9999f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.9999f)
                close()
                moveTo(22.0f, 21.9999f)
                verticalLineTo(17.4999f)
                curveTo(22.0f, 15.6378f, 20.5459f, 14.1153f, 18.7118f, 14.0056f)
                curveTo(18.8993f, 14.6376f, 19.0f, 15.307f, 19.0f, 15.9999f)
                verticalLineTo(21.9999f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return `_team-fill`!!
    }

private var `_team-fill`: ImageVector? = null
