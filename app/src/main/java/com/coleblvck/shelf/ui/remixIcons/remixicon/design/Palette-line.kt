package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Palette-line`: ImageVector
    get() {
        if (`_palette-line` != null) {
            return `_palette-line`!!
        }
        `_palette-line` = Builder(name = "Palette-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5222f, 2.0f, 22.0f, 5.9778f, 22.0f, 10.8889f)
                curveTo(22.0f, 13.9556f, 19.5111f, 16.4444f, 16.4444f, 16.4444f)
                horizontalLineTo(14.4778f)
                curveTo(13.5556f, 16.4444f, 12.8111f, 17.1889f, 12.8111f, 18.1111f)
                curveTo(12.8111f, 18.5333f, 12.9778f, 18.9222f, 13.2333f, 19.2111f)
                curveTo(13.5f, 19.5111f, 13.6667f, 19.9f, 13.6667f, 20.3333f)
                curveTo(13.6667f, 21.2556f, 12.9f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4778f, 22.0f, 2.0f, 17.5222f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4778f, 6.4778f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.8111f, 18.1111f)
                curveTo(10.8111f, 16.0843f, 12.451f, 14.4444f, 14.4778f, 14.4444f)
                horizontalLineTo(16.4444f)
                curveTo(18.4065f, 14.4444f, 20.0f, 12.851f, 20.0f, 10.8889f)
                curveTo(20.0f, 7.1392f, 16.4677f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5823f, 4.0f, 4.0f, 7.5823f, 4.0f, 12.0f)
                curveTo(4.0f, 16.19f, 7.2226f, 19.6285f, 11.324f, 19.9718f)
                curveTo(10.9948f, 19.4168f, 10.8111f, 18.7761f, 10.8111f, 18.1111f)
                close()
                moveTo(7.5f, 12.0f)
                curveTo(6.6716f, 12.0f, 6.0f, 11.3284f, 6.0f, 10.5f)
                curveTo(6.0f, 9.6716f, 6.6716f, 9.0f, 7.5f, 9.0f)
                curveTo(8.3284f, 9.0f, 9.0f, 9.6716f, 9.0f, 10.5f)
                curveTo(9.0f, 11.3284f, 8.3284f, 12.0f, 7.5f, 12.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(15.6716f, 12.0f, 15.0f, 11.3284f, 15.0f, 10.5f)
                curveTo(15.0f, 9.6716f, 15.6716f, 9.0f, 16.5f, 9.0f)
                curveTo(17.3284f, 9.0f, 18.0f, 9.6716f, 18.0f, 10.5f)
                curveTo(18.0f, 11.3284f, 17.3284f, 12.0f, 16.5f, 12.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(11.1716f, 9.0f, 10.5f, 8.3284f, 10.5f, 7.5f)
                curveTo(10.5f, 6.6716f, 11.1716f, 6.0f, 12.0f, 6.0f)
                curveTo(12.8284f, 6.0f, 13.5f, 6.6716f, 13.5f, 7.5f)
                curveTo(13.5f, 8.3284f, 12.8284f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_palette-line`!!
    }

private var `_palette-line`: ImageVector? = null
