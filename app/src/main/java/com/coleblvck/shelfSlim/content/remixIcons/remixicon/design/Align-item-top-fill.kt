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

public val DesignGroup.`Align-item-top-fill`: ImageVector
    get() {
        if (`_align-item-top-fill` != null) {
            return `_align-item-top-fill`!!
        }
        `_align-item-top-fill` = Builder(name = "Align-item-top-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(14.0f, 7.0f)
                curveTo(13.4477f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 16.5523f, 13.4477f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 16.5523f, 20.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 7.4477f, 19.5523f, 7.0f, 19.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                close()
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 7.4477f, 4.4477f, 7.0f, 5.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                curveTo(10.5523f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                lineTo(11.0f, 20.0f)
                curveTo(11.0f, 20.5523f, 10.5523f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0f, 4.0f, 20.5523f, 4.0f, 20.0f)
                lineTo(4.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_align-item-top-fill`!!
    }

private var `_align-item-top-fill`: ImageVector? = null
