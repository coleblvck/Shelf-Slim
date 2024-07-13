package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Npmjs-line`: ImageVector
    get() {
        if (`_npmjs-line` != null) {
            return `_npmjs-line`!!
        }
        `_npmjs-line` = Builder(name = "Npmjs-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.001f, 3.0f)
                curveTo(20.5533f, 3.0f, 21.001f, 3.4477f, 21.001f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.001f, 20.5523f, 20.5533f, 21.0f, 20.001f, 21.0f)
                horizontalLineTo(4.001f)
                curveTo(3.4487f, 21.0f, 3.001f, 20.5523f, 3.001f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.001f, 3.4477f, 3.4487f, 3.0f, 4.001f, 3.0f)
                horizontalLineTo(20.001f)
                close()
                moveTo(19.001f, 5.0f)
                horizontalLineTo(5.001f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(5.0f)
                close()
                moveTo(17.001f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.501f)
                verticalLineTo(9.5f)
                horizontalLineTo(12.001f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.001f)
                close()
            }
        }
        .build()
        return `_npmjs-line`!!
    }

private var `_npmjs-line`: ImageVector? = null
