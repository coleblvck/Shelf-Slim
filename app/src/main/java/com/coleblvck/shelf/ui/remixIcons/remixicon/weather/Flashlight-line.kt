package com.coleblvck.shelf.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Flashlight-line`: ImageVector
    get() {
        if (`_flashlight-line` != null) {
            return `_flashlight-line`!!
        }
        `_flashlight-line` = Builder(name = "Flashlight-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(21.0f)
                lineTo(11.0f, 24.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                lineTo(13.0f, 0.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineTo(7.2206f)
                lineTo(7.5324f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.3944f)
                lineTo(17.263f, 11.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_flashlight-line`!!
    }

private var `_flashlight-line`: ImageVector? = null
