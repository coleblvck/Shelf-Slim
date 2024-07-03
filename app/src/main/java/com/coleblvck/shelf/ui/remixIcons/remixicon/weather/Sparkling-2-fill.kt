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

public val WeatherGroup.`Sparkling-2-fill`: ImageVector
    get() {
        if (`_sparkling-2-fill` != null) {
            return `_sparkling-2-fill`!!
        }
        `_sparkling-2-fill` = Builder(name = "Sparkling-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0007f, 1.2083f)
                lineTo(18.3195f, 3.6811f)
                lineTo(20.7923f, 4.9999f)
                lineTo(18.3195f, 6.3188f)
                lineTo(17.0007f, 8.7916f)
                lineTo(15.6818f, 6.3188f)
                lineTo(13.209f, 4.9999f)
                lineTo(15.6818f, 3.6811f)
                lineTo(17.0007f, 1.2083f)
                close()
                moveTo(8.0007f, 4.3333f)
                lineTo(10.6673f, 9.3333f)
                lineTo(15.6673f, 11.9999f)
                lineTo(10.6673f, 14.6666f)
                lineTo(8.0007f, 19.6666f)
                lineTo(5.334f, 14.6666f)
                lineTo(0.334f, 11.9999f)
                lineTo(5.334f, 9.3333f)
                lineTo(8.0007f, 4.3333f)
                close()
                moveTo(19.6673f, 16.3333f)
                lineTo(18.0007f, 13.2083f)
                lineTo(16.334f, 16.3333f)
                lineTo(13.209f, 17.9999f)
                lineTo(16.334f, 19.6666f)
                lineTo(18.0007f, 22.7916f)
                lineTo(19.6673f, 19.6666f)
                lineTo(22.7923f, 17.9999f)
                lineTo(19.6673f, 16.3333f)
                close()
            }
        }
        .build()
        return `_sparkling-2-fill`!!
    }

private var `_sparkling-2-fill`: ImageVector? = null
