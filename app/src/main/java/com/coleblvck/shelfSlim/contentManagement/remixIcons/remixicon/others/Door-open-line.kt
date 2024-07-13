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

public val OthersGroup.`Door-open-line`: ImageVector
    get() {
        if (`_door-open-line` != null) {
            return `_door-open-line`!!
        }
        `_door-open-line` = Builder(name = "Door-open-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.998f, 21.0001f)
                verticalLineTo(19.0001f)
                lineTo(3.998f, 18.9999f)
                verticalLineTo(4.8347f)
                curveTo(3.998f, 4.3514f, 4.3437f, 3.9372f, 4.8192f, 3.8508f)
                lineTo(14.2907f, 2.1287f)
                curveTo(14.6167f, 2.0694f, 14.9291f, 2.2856f, 14.9884f, 2.6117f)
                curveTo(14.9948f, 2.6471f, 14.998f, 2.683f, 14.998f, 2.719f)
                verticalLineTo(3.9999f)
                lineTo(18.998f, 4.0001f)
                curveTo(19.5503f, 4.0001f, 19.998f, 4.4478f, 19.998f, 5.0001f)
                verticalLineTo(18.9999f)
                lineTo(21.998f, 19.0001f)
                verticalLineTo(21.0001f)
                horizontalLineTo(17.998f)
                verticalLineTo(6.0001f)
                lineTo(14.998f, 5.9999f)
                verticalLineTo(21.0001f)
                horizontalLineTo(1.998f)
                close()
                moveTo(12.998f, 4.3965f)
                lineTo(5.9981f, 5.6692f)
                verticalLineTo(19.0001f)
                horizontalLineTo(12.998f)
                verticalLineTo(4.3965f)
                close()
                moveTo(11.998f, 11.0001f)
                verticalLineTo(13.0001f)
                horizontalLineTo(9.998f)
                verticalLineTo(11.0001f)
                horizontalLineTo(11.998f)
                close()
            }
        }
        .build()
        return `_door-open-line`!!
    }

private var `_door-open-line`: ImageVector? = null
