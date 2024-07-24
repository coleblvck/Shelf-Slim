package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Infrared-thermometer-fill`: ImageVector
    get() {
        if (`_infrared-thermometer-fill` != null) {
            return `_infrared-thermometer-fill`!!
        }
        `_infrared-thermometer-fill` = Builder(name = "Infrared-thermometer-fill", defaultWidth =
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
        return `_infrared-thermometer-fill`!!
    }

private var `_infrared-thermometer-fill`: ImageVector? = null
