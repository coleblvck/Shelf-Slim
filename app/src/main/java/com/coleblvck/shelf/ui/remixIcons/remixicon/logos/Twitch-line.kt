package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Twitch-line`: ImageVector
    get() {
        if (`_twitch-line` != null) {
            return `_twitch-line`!!
        }
        `_twitch-line` = Builder(name = "Twitch-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.301f, 3.0f)
                horizontalLineTo(21.001f)
                verticalLineTo(14.7f)
                lineTo(16.301f, 19.4f)
                horizontalLineTo(12.401f)
                lineTo(9.901f, 21.8f)
                horizontalLineTo(7.001f)
                verticalLineTo(19.4f)
                horizontalLineTo(3.001f)
                verticalLineTo(6.2f)
                lineTo(4.301f, 3.0f)
                close()
                moveTo(5.001f, 17.4f)
                horizontalLineTo(9.001f)
                verticalLineTo(19.8f)
                horizontalLineTo(9.0964f)
                lineTo(11.5964f, 17.4f)
                horizontalLineTo(15.4725f)
                lineTo(19.001f, 13.8716f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.001f)
                verticalLineTo(17.4f)
                close()
                moveTo(15.001f, 8.0f)
                horizontalLineTo(17.001f)
                verticalLineTo(12.7f)
                horizontalLineTo(15.001f)
                verticalLineTo(8.0f)
                close()
                moveTo(15.001f, 8.0f)
                horizontalLineTo(17.001f)
                verticalLineTo(12.7f)
                horizontalLineTo(15.001f)
                verticalLineTo(8.0f)
                close()
                moveTo(10.001f, 8.0f)
                horizontalLineTo(12.001f)
                verticalLineTo(12.7f)
                horizontalLineTo(10.001f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_twitch-line`!!
    }

private var `_twitch-line`: ImageVector? = null
