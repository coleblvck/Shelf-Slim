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

public val WeatherGroup.`Moon-clear-line`: ImageVector
    get() {
        if (`_moon-clear-line` != null) {
            return `_moon-clear-line`!!
        }
        `_moon-clear-line` = Builder(name = "Moon-clear-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 10.4183f, 13.5817f, 14.0f, 18.0f, 14.0f)
                curveTo(19.4386f, 14.0f, 20.7885f, 13.6203f, 21.9549f, 12.9556f)
                curveTo(21.4738f, 18.0302f, 17.2005f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.7995f, 5.9698f, 2.5262f, 11.0444f, 2.0451f)
                curveTo(10.3797f, 3.2115f, 10.0f, 4.5614f, 10.0f, 6.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(14.9654f, 20.0f, 17.5757f, 18.3788f, 18.9571f, 15.9546f)
                curveTo(18.6407f, 15.9848f, 18.3214f, 16.0f, 18.0f, 16.0f)
                curveTo(12.4772f, 16.0f, 8.0f, 11.5228f, 8.0f, 6.0f)
                curveTo(8.0f, 5.6786f, 8.0152f, 5.3593f, 8.0454f, 5.0429f)
                curveTo(5.6212f, 6.4243f, 4.0f, 9.0346f, 4.0f, 12.0f)
                close()
                moveTo(18.1642f, 2.291f)
                lineTo(19.0f, 2.5f)
                verticalLineTo(3.5f)
                lineTo(18.1642f, 3.709f)
                curveTo(17.4476f, 3.8881f, 16.8881f, 4.4476f, 16.709f, 5.1642f)
                lineTo(16.5f, 6.0f)
                horizontalLineTo(15.5f)
                lineTo(15.291f, 5.1642f)
                curveTo(15.1119f, 4.4476f, 14.5524f, 3.8881f, 13.8358f, 3.709f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(2.5f)
                lineTo(13.8358f, 2.291f)
                curveTo(14.5524f, 2.1119f, 15.1119f, 1.5524f, 15.291f, 0.8358f)
                lineTo(15.5f, 0.0f)
                horizontalLineTo(16.5f)
                lineTo(16.709f, 0.8358f)
                curveTo(16.8881f, 1.5524f, 17.4476f, 2.1119f, 18.1642f, 2.291f)
                close()
                moveTo(23.1642f, 7.291f)
                lineTo(24.0f, 7.5f)
                verticalLineTo(8.5f)
                lineTo(23.1642f, 8.709f)
                curveTo(22.4476f, 8.8881f, 21.8881f, 9.4476f, 21.709f, 10.1642f)
                lineTo(21.5f, 11.0f)
                horizontalLineTo(20.5f)
                lineTo(20.291f, 10.1642f)
                curveTo(20.1119f, 9.4476f, 19.5524f, 8.8881f, 18.8358f, 8.709f)
                lineTo(18.0f, 8.5f)
                verticalLineTo(7.5f)
                lineTo(18.8358f, 7.291f)
                curveTo(19.5524f, 7.1119f, 20.1119f, 6.5524f, 20.291f, 5.8358f)
                lineTo(20.5f, 5.0f)
                horizontalLineTo(21.5f)
                lineTo(21.709f, 5.8358f)
                curveTo(21.8881f, 6.5524f, 22.4476f, 7.1119f, 23.1642f, 7.291f)
                close()
            }
        }
        .build()
        return `_moon-clear-line`!!
    }

private var `_moon-clear-line`: ImageVector? = null
