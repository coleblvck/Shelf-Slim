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

public val WeatherGroup.`Flashlight-fill`: ImageVector
    get() {
        if (`_flashlight-fill` != null) {
            return `_flashlight-fill`!!
        }
        `_flashlight-fill` = Builder(name = "Flashlight-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                horizontalLineTo(20.0f)
                lineTo(11.0f, 23.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                lineTo(13.0f, 1.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_flashlight-fill`!!
    }

private var `_flashlight-fill`: ImageVector? = null
