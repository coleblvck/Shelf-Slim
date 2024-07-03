package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Shining-2-line`: ImageVector
    get() {
        if (`_shining-2-line` != null) {
            return `_shining-2-line`!!
        }
        `_shining-2-line` = Builder(name = "Shining-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                lineTo(23.5f, 12.0f)
                lineTo(16.0f, 16.0f)
                lineTo(12.0f, 23.5f)
                lineTo(8.0f, 16.0f)
                lineTo(0.5f, 12.0f)
                lineTo(8.0f, 8.0f)
                lineTo(12.0f, 0.5f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(19.25f, 12.0f)
                lineTo(14.5217f, 9.4783f)
                lineTo(12.0f, 4.75f)
                lineTo(9.4783f, 9.4783f)
                lineTo(4.75f, 12.0f)
                lineTo(9.4783f, 14.5217f)
                lineTo(12.0f, 19.25f)
                lineTo(14.5217f, 14.5217f)
                lineTo(19.25f, 12.0f)
                close()
            }
        }
        .build()
        return `_shining-2-line`!!
    }

private var `_shining-2-line`: ImageVector? = null
