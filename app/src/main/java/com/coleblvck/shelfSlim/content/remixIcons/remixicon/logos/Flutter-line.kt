package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Flutter-line`: ImageVector
    get() {
        if (`_flutter-line` != null) {
            return `_flutter-line`!!
        }
        `_flutter-line` = Builder(name = "Flutter-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5979f, 10.6843f)
                horizontalLineTo(17.4264f)
                lineTo(11.7688f, 16.3419f)
                lineTo(17.4264f, 21.998f)
                horizontalLineTo(14.5979f)
                lineTo(8.9411f, 16.3412f)
                lineTo(14.5979f, 10.6843f)
                close()
                moveTo(14.4044f, 2.0044f)
                horizontalLineTo(17.2328f)
                lineTo(5.9191f, 13.3181f)
                lineTo(4.5049f, 11.9039f)
                lineTo(14.4044f, 2.0044f)
                close()
            }
        }
        .build()
        return `_flutter-line`!!
    }

private var `_flutter-line`: ImageVector? = null
