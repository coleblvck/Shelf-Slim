package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Home-office-fill`: ImageVector
    get() {
        if (`_home-office-fill` != null) {
            return `_home-office-fill`!!
        }
        `_home-office-fill` = Builder(name = "Home-office-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7999f, 9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0001f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0001f, 4.0f, 20.5524f, 4.0f, 20.0001f)
                verticalLineTo(11.0001f)
                lineTo(1.0f, 11.0001f)
                lineTo(11.3273f, 1.6116f)
                curveTo(11.7087f, 1.2649f, 12.2913f, 1.2649f, 12.6727f, 1.6116f)
                lineTo(20.7999f, 9.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_home-office-fill`!!
    }

private var `_home-office-fill`: ImageVector? = null
