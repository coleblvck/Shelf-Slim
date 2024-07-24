package com.coleblvck.shelfSlim.content.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Lightbulb-flash-fill`: ImageVector
    get() {
        if (`_lightbulb-flash-fill` != null) {
            return `_lightbulb-flash-fill`!!
        }
        `_lightbulb-flash-fill` = Builder(name = "Lightbulb-flash-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.941f, 18.0f)
                curveTo(7.6439f, 16.7274f, 6.3041f, 15.6857f, 5.754f, 14.9992f)
                curveTo(4.6564f, 13.6297f, 4.0f, 11.8915f, 4.0f, 10.0f)
                curveTo(4.0f, 5.5817f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.5817f, 20.0f, 10.0f)
                curveTo(20.0f, 11.8925f, 19.3428f, 13.6315f, 18.2443f, 15.0014f)
                curveTo(17.6944f, 15.687f, 16.3558f, 16.7276f, 16.059f, 18.0f)
                horizontalLineTo(7.941f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 22.1046f, 15.1046f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(8.8954f, 23.0f, 8.0f, 22.1046f, 8.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(13.0f, 10.0048f)
                verticalLineTo(6.0f)
                lineTo(8.5f, 12.0048f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0048f)
                lineTo(15.5f, 10.0048f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_lightbulb-flash-fill`!!
    }

private var `_lightbulb-flash-fill`: ImageVector? = null
