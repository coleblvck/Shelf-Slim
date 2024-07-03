package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Hourglass-2-fill`: ImageVector
    get() {
        if (`_hourglass-2-fill` != null) {
            return `_hourglass-2-fill`!!
        }
        `_hourglass-2-fill` = Builder(name = "Hourglass-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.4599f)
                lineTo(13.5366f, 12.0f)
                lineTo(20.0f, 17.5401f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.5401f)
                lineTo(10.4634f, 12.0f)
                lineTo(4.0f, 6.4599f)
                verticalLineTo(2.0f)
                close()
                moveTo(16.2967f, 7.0f)
                lineTo(18.0f, 5.5401f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.5401f)
                lineTo(7.7033f, 7.0f)
                horizontalLineTo(16.2967f)
                close()
                moveTo(12.0f, 13.3171f)
                lineTo(6.0f, 18.4599f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 17.0f)
                lineTo(17.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.4599f)
                lineTo(12.0f, 13.3171f)
                close()
            }
        }
        .build()
        return `_hourglass-2-fill`!!
    }

private var `_hourglass-2-fill`: ImageVector? = null
