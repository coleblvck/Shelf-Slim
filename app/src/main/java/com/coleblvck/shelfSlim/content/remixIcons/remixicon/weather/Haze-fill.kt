package com.coleblvck.shelfSlim.content.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Haze-fill`: ImageVector
    get() {
        if (`_haze-fill` != null) {
            return `_haze-fill`!!
        }
        `_haze-fill` = Builder(name = "Haze-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.083f, 13.0f)
                curveTo(6.0284f, 12.6748f, 6.0f, 12.3407f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 12.3407f, 17.9716f, 12.6748f, 17.917f, 13.0f)
                horizontalLineTo(6.083f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(3.5147f, 4.9289f)
                lineTo(4.9289f, 3.5147f)
                lineTo(7.0503f, 5.636f)
                lineTo(5.636f, 7.0503f)
                lineTo(3.5147f, 4.9289f)
                close()
                moveTo(19.0711f, 3.5147f)
                lineTo(20.4853f, 4.9289f)
                lineTo(18.364f, 7.0503f)
                lineTo(16.9497f, 5.636f)
                lineTo(19.0711f, 3.5147f)
                close()
                moveTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(23.0f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_haze-fill`!!
    }

private var `_haze-fill`: ImageVector? = null
