package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Door-fill`: ImageVector
    get() {
        if (`_door-fill` != null) {
            return `_door-fill`!!
        }
        `_door-fill` = Builder(name = "Door-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.998f, 3.0f)
                curveTo(18.5503f, 3.0f, 18.998f, 3.4477f, 18.998f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(18.998f, 20.5523f, 18.5503f, 21.0f, 17.998f, 21.0f)
                horizontalLineTo(5.9981f)
                curveTo(5.4458f, 21.0f, 4.9981f, 20.5523f, 4.9981f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.9981f, 3.4477f, 5.4458f, 3.0f, 5.9981f, 3.0f)
                horizontalLineTo(17.998f)
                close()
                moveTo(13.998f, 11.0f)
                curveTo(13.4458f, 11.0f, 12.998f, 11.4477f, 12.998f, 12.0f)
                curveTo(12.998f, 12.5523f, 13.4458f, 13.0f, 13.998f, 13.0f)
                curveTo(14.5503f, 13.0f, 14.998f, 12.5523f, 14.998f, 12.0f)
                curveTo(14.998f, 11.4477f, 14.5503f, 11.0f, 13.998f, 11.0f)
                close()
            }
        }
        .build()
        return `_door-fill`!!
    }

private var `_door-fill`: ImageVector? = null
