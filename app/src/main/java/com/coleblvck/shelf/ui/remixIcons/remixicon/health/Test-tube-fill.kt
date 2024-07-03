package com.coleblvck.shelf.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Test-tube-fill`: ImageVector
    get() {
        if (`_test-tube-fill` != null) {
            return `_test-tube-fill`!!
        }
        `_test-tube-fill` = Builder(name = "Test-tube-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                curveTo(16.0f, 20.2091f, 14.2091f, 22.0f, 12.0f, 22.0f)
                curveTo(9.7909f, 22.0f, 8.0f, 20.2091f, 8.0f, 18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(13.0f, 15.0f)
                curveTo(12.4477f, 15.0f, 12.0f, 15.4477f, 12.0f, 16.0f)
                curveTo(12.0f, 16.5523f, 12.4477f, 17.0f, 13.0f, 17.0f)
                curveTo(13.5523f, 17.0f, 14.0f, 16.5523f, 14.0f, 16.0f)
                curveTo(14.0f, 15.4477f, 13.5523f, 15.0f, 13.0f, 15.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(10.4477f, 12.0f, 10.0f, 12.4477f, 10.0f, 13.0f)
                curveTo(10.0f, 13.5523f, 10.4477f, 14.0f, 11.0f, 14.0f)
                curveTo(11.5523f, 14.0f, 12.0f, 13.5523f, 12.0f, 13.0f)
                curveTo(12.0f, 12.4477f, 11.5523f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_test-tube-fill`!!
    }

private var `_test-tube-fill`: ImageVector? = null
