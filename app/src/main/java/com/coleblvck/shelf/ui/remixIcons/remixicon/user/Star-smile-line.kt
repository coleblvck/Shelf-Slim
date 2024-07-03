package com.coleblvck.shelf.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Star-smile-line`: ImageVector
    get() {
        if (`_star-smile-line` != null) {
            return `_star-smile-line`!!
        }
        `_star-smile-line` = Builder(name = "Star-smile-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9996f, 0.5f)
                lineTo(16.2256f, 6.6834f)
                lineTo(23.4123f, 8.7918f)
                lineTo(18.8374f, 14.7217f)
                lineTo(19.053f, 22.2082f)
                lineTo(11.9996f, 19.6897f)
                lineTo(4.9462f, 22.2082f)
                lineTo(5.1618f, 14.7217f)
                lineTo(0.5869f, 8.7918f)
                lineTo(7.7736f, 6.6834f)
                lineTo(11.9996f, 0.5f)
                close()
                moveTo(11.9996f, 4.044f)
                lineTo(9.0219f, 8.4015f)
                lineTo(3.9566f, 9.887f)
                lineTo(7.1815f, 14.0655f)
                lineTo(7.0286f, 19.34f)
                lineTo(11.9996f, 17.566f)
                lineTo(16.9696f, 19.34f)
                lineTo(16.8177f, 14.0655f)
                lineTo(20.0416f, 9.887f)
                lineTo(14.9773f, 8.4015f)
                lineTo(11.9996f, 4.044f)
                close()
                moveTo(9.9996f, 12.0f)
                curveTo(9.9996f, 13.1046f, 10.895f, 14.0f, 11.9996f, 14.0f)
                curveTo(13.1042f, 14.0f, 13.9996f, 13.1046f, 13.9996f, 12.0f)
                horizontalLineTo(15.9996f)
                curveTo(15.9996f, 14.2091f, 14.2087f, 16.0f, 11.9996f, 16.0f)
                curveTo(9.7905f, 16.0f, 7.9996f, 14.2091f, 7.9996f, 12.0f)
                horizontalLineTo(9.9996f)
                close()
            }
        }
        .build()
        return `_star-smile-line`!!
    }

private var `_star-smile-line`: ImageVector? = null
