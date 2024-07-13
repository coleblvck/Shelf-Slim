package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Collage-line`: ImageVector
    get() {
        if (`_collage-line` != null) {
            return `_collage-line`!!
        }
        `_collage-line` = Builder(name = "Collage-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.1067f)
                curveTo(20.5523f, 3.1067f, 21.0f, 3.5544f, 21.0f, 4.1067f)
                verticalLineTo(20.1067f)
                curveTo(21.0f, 20.659f, 20.5523f, 21.1067f, 20.0f, 21.1067f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.1067f, 3.0f, 20.659f, 3.0f, 20.1067f)
                verticalLineTo(4.1067f)
                curveTo(3.0f, 3.5544f, 3.4477f, 3.1067f, 4.0f, 3.1067f)
                horizontalLineTo(20.0f)
                close()
                moveTo(11.1888f, 13.2651f)
                lineTo(5.0f, 14.3557f)
                verticalLineTo(19.1067f)
                horizontalLineTo(12.218f)
                lineTo(11.1888f, 13.2651f)
                close()
                moveTo(19.0f, 5.1067f)
                horizontalLineTo(11.781f)
                lineTo(14.249f, 19.1067f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.1067f)
                close()
                moveTo(9.75f, 5.1067f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.3247f)
                lineTo(10.8415f, 11.2955f)
                lineTo(9.75f, 5.1067f)
                close()
            }
        }
        .build()
        return `_collage-line`!!
    }

private var `_collage-line`: ImageVector? = null
