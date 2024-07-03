package com.coleblvck.shelf.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Home-gear-line`: ImageVector
    get() {
        if (`_home-gear-line` != null) {
            return `_home-gear-line`!!
        }
        `_home-gear-line` = Builder(name = "Home-gear-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0f, 4.0f, 20.5523f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(11.3273f, 1.6115f)
                curveTo(11.7087f, 1.2648f, 12.2913f, 1.2648f, 12.6727f, 1.6115f)
                lineTo(23.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.5523f, 19.5523f, 21.0f, 19.0f, 21.0f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.1574f)
                lineTo(12.0f, 3.7029f)
                lineTo(6.0f, 9.1574f)
                verticalLineTo(19.0f)
                close()
                moveTo(8.5912f, 13.8089f)
                curveTo(8.5294f, 13.5486f, 8.4967f, 13.277f, 8.4967f, 12.9978f)
                curveTo(8.4967f, 12.7186f, 8.5294f, 12.4471f, 8.5912f, 12.1868f)
                lineTo(7.6f, 11.6145f)
                lineTo(8.5995f, 9.8833f)
                lineTo(9.5914f, 10.456f)
                curveTo(9.9843f, 10.0843f, 10.4633f, 9.8027f, 10.9954f, 9.6444f)
                verticalLineTo(8.5f)
                horizontalLineTo(12.9945f)
                verticalLineTo(9.6444f)
                curveTo(13.5266f, 9.8027f, 14.0056f, 10.0843f, 14.3985f, 10.4559f)
                lineTo(15.3904f, 9.8832f)
                lineTo(16.39f, 11.6144f)
                lineTo(15.3987f, 12.1867f)
                curveTo(15.4605f, 12.447f, 15.4932f, 12.7186f, 15.4932f, 12.9978f)
                curveTo(15.4932f, 13.277f, 15.4605f, 13.5485f, 15.3988f, 13.8088f)
                lineTo(16.39f, 14.381f)
                lineTo(15.3905f, 16.1122f)
                lineTo(14.3986f, 15.5396f)
                curveTo(14.0057f, 15.9112f, 13.5267f, 16.1928f, 12.9946f, 16.3512f)
                verticalLineTo(17.4956f)
                horizontalLineTo(10.9955f)
                verticalLineTo(16.3512f)
                curveTo(10.4634f, 16.1929f, 9.9844f, 15.9114f, 9.5914f, 15.5397f)
                lineTo(8.5996f, 16.1123f)
                lineTo(7.6f, 14.3811f)
                lineTo(8.5912f, 13.8089f)
                close()
                moveTo(11.995f, 14.4971f)
                curveTo(12.823f, 14.4971f, 13.4942f, 13.8258f, 13.4942f, 12.9978f)
                curveTo(13.4942f, 12.1698f, 12.823f, 11.4985f, 11.995f, 11.4985f)
                curveTo(11.1669f, 11.4985f, 10.4957f, 12.1698f, 10.4957f, 12.9978f)
                curveTo(10.4957f, 13.8258f, 11.1669f, 14.4971f, 11.995f, 14.4971f)
                close()
            }
        }
        .build()
        return `_home-gear-line`!!
    }

private var `_home-gear-line`: ImageVector? = null
