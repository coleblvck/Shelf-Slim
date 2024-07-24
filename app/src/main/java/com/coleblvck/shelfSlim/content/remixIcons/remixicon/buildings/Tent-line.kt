package com.coleblvck.shelfSlim.content.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Tent-line`: ImageVector
    get() {
        if (`_tent-line` != null) {
            return `_tent-line`!!
        }
        `_tent-line` = Builder(name = "Tent-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1034f, 19.0f)
                lineTo(12.8659f, 3.0002f)
                curveTo(12.7782f, 2.8482f, 12.6519f, 2.7219f, 12.4999f, 2.6341f)
                curveTo(12.0216f, 2.358f, 11.41f, 2.5219f, 11.1339f, 3.0002f)
                lineTo(1.8964f, 19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                curveTo(8.3333f, 21.0f, 15.6667f, 21.0f, 23.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.1034f)
                close()
                moveTo(7.5999f, 19.0002f)
                horizontalLineTo(4.2057f)
                lineTo(11.9999f, 5.5002f)
                lineTo(19.7941f, 19.0002f)
                horizontalLineTo(16.4001f)
                lineTo(12.0f, 11.0f)
                lineTo(7.5999f, 19.0002f)
                close()
                moveTo(12.0f, 15.1501f)
                lineTo(14.1175f, 19.0f)
                horizontalLineTo(9.8825f)
                lineTo(12.0f, 15.1501f)
                close()
            }
        }
        .build()
        return `_tent-line`!!
    }

private var `_tent-line`: ImageVector? = null
