package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Anticlockwise-2-fill`: ImageVector
    get() {
        if (`_anticlockwise-2-fill` != null) {
            return `_anticlockwise-2-fill`!!
        }
        `_anticlockwise-2-fill` = Builder(name = "Anticlockwise-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(18.7614f, 4.0f, 21.0f, 6.2386f, 21.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 7.3432f, 17.6569f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                lineTo(9.0f, 5.0f)
                lineTo(14.0f, 1.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.5523f, 14.5523f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.4477f, 3.4477f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 10.0f, 15.0f, 10.4477f, 15.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_anticlockwise-2-fill`!!
    }

private var `_anticlockwise-2-fill`: ImageVector? = null
