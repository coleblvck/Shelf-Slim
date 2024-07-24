package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Crosshair-2-line`: ImageVector
    get() {
        if (`_crosshair-2-line` != null) {
            return `_crosshair-2-line`!!
        }
        `_crosshair-2-line` = Builder(name = "Crosshair-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0709f)
                curveTo(7.9343f, 5.5094f, 5.5094f, 7.9343f, 5.0709f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0709f)
                curveTo(5.5094f, 16.0657f, 7.9343f, 18.4906f, 11.0f, 18.9291f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.9291f)
                curveTo(16.0657f, 18.4906f, 18.4906f, 16.0657f, 18.9291f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.9291f)
                curveTo(18.4906f, 7.9343f, 16.0657f, 5.5094f, 13.0f, 5.0709f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0709f)
                close()
                moveTo(3.0549f, 11.0f)
                curveTo(3.5161f, 6.8284f, 6.8284f, 3.5161f, 11.0f, 3.0549f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0549f)
                curveTo(17.1716f, 3.5161f, 20.4839f, 6.8284f, 20.9451f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.9451f)
                curveTo(20.4839f, 17.1716f, 17.1716f, 20.4839f, 13.0f, 20.9451f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.9451f)
                curveTo(6.8284f, 20.4839f, 3.5161f, 17.1716f, 3.0549f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0549f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_crosshair-2-line`!!
    }

private var `_crosshair-2-line`: ImageVector? = null
