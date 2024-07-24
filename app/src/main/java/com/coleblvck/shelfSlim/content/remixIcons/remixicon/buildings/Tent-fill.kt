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

public val BuildingsGroup.`Tent-fill`: ImageVector
    get() {
        if (`_tent-fill` != null) {
            return `_tent-fill`!!
        }
        `_tent-fill` = Builder(name = "Tent-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8659f, 3.0002f)
                lineTo(22.1034f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.8964f)
                lineTo(11.1339f, 3.0002f)
                curveTo(11.41f, 2.5219f, 12.0216f, 2.358f, 12.4999f, 2.6341f)
                curveTo(12.6519f, 2.7219f, 12.7782f, 2.8482f, 12.8659f, 3.0002f)
                close()
                moveTo(12.0f, 12.9248f)
                lineTo(8.6587f, 19.0f)
                horizontalLineTo(15.3414f)
                lineTo(12.0f, 12.9248f)
                close()
            }
        }
        .build()
        return `_tent-fill`!!
    }

private var `_tent-fill`: ImageVector? = null
