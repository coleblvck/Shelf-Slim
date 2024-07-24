package com.coleblvck.shelfSlim.content.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Door-line`: ImageVector
    get() {
        if (`_door-line` != null) {
            return `_door-line`!!
        }
        `_door-line` = Builder(name = "Door-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.998f, 5.0f)
                horizontalLineTo(6.9981f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.998f)
                verticalLineTo(5.0f)
                close()
                moveTo(14.998f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.998f)
                close()
            }
        }
        .build()
        return `_door-line`!!
    }

private var `_door-line`: ImageVector? = null
