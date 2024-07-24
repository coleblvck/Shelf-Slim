package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Aed-electrodes-fill`: ImageVector
    get() {
        if (`_aed-electrodes-fill` != null) {
            return `_aed-electrodes-fill`!!
        }
        `_aed-electrodes-fill` = Builder(name = "Aed-electrodes-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(7.4477f, 3.0f, 7.0f, 3.4477f, 7.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 7.0f, 3.0f, 7.4477f, 3.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 21.0f, 17.0f, 20.5523f, 17.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 17.0f, 21.0f, 16.5523f, 21.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.4477f, 16.5523f, 7.0f, 16.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_aed-electrodes-fill`!!
    }

private var `_aed-electrodes-fill`: ImageVector? = null
