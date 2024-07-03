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

public val BuildingsGroup.`Home-office-line`: ImageVector
    get() {
        if (`_home-office-line` != null) {
            return `_home-office-line`!!
        }
        `_home-office-line` = Builder(name = "Home-office-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6727f, 1.6116f)
                lineTo(20.7999f, 9.0f)
                horizontalLineTo(17.8267f)
                lineTo(12.0f, 3.703f)
                lineTo(6.0f, 9.1576f)
                verticalLineTo(19.0001f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0001f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0001f, 4.0f, 20.5524f, 4.0f, 20.0001f)
                verticalLineTo(11.0001f)
                lineTo(1.0f, 11.0001f)
                lineTo(11.3273f, 1.6116f)
                curveTo(11.7087f, 1.2649f, 12.2913f, 1.2649f, 12.6727f, 1.6116f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(16.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(24.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_home-office-line`!!
    }

private var `_home-office-line`: ImageVector? = null