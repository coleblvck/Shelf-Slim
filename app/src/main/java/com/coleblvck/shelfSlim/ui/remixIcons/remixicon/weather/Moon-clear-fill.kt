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

public val WeatherGroup.`Moon-clear-fill`: ImageVector
    get() {
        if (`_moon-clear-fill` != null) {
            return `_moon-clear-fill`!!
        }
        `_moon-clear-fill` = Builder(name = "Moon-clear-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8216f, 2.238f)
                curveTo(9.2942f, 3.3826f, 9.0f, 4.657f, 9.0f, 6.0f)
                curveTo(9.0f, 10.9706f, 13.0294f, 15.0f, 18.0f, 15.0f)
                curveTo(19.343f, 15.0f, 20.6174f, 14.7058f, 21.762f, 14.1784f)
                curveTo(20.7678f, 18.6537f, 16.7747f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 7.2253f, 5.3463f, 3.2322f, 9.8216f, 2.238f)
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
        return `_moon-clear-fill`!!
    }

private var `_moon-clear-fill`: ImageVector? = null
