package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Infrared-thermometer-line`: ImageVector
    get() {
        if (`_infrared-thermometer-line` != null) {
            return `_infrared-thermometer-line`!!
        }
        `_infrared-thermometer-line` = Builder(name = "Infrared-thermometer-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.999f)
                lineTo(18.0f, 12.0f)
                curveTo(18.0f, 14.2091f, 16.2091f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(12.621f)
                lineTo(12.0084f, 19.1113f)
                lineTo(12.9192f, 20.4324f)
                curveTo(13.2327f, 20.8871f, 13.1182f, 21.5098f, 12.6635f, 21.8233f)
                curveTo(12.4966f, 21.9384f, 12.2987f, 22.0f, 12.0959f, 22.0f)
                horizontalLineTo(3.0f)
                lineTo(5.3129f, 11.9762f)
                lineTo(3.0f, 11.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineTo(8.2998f)
                lineTo(5.6554f, 9.9499f)
                lineTo(7.6397f, 10.7874f)
                lineTo(5.514f, 20.0f)
                horizontalLineTo(10.1918f)
                lineTo(9.8832f, 19.5524f)
                lineTo(11.9604f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.999f, 11.0f)
                horizontalLineTo(13.6051f)
                lineTo(13.014f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1046f, 14.0f, 16.0f, 13.1046f, 16.0f, 12.0f)
                lineTo(15.999f, 11.0f)
                close()
            }
        }
        .build()
        return `_infrared-thermometer-line`!!
    }

private var `_infrared-thermometer-line`: ImageVector? = null
