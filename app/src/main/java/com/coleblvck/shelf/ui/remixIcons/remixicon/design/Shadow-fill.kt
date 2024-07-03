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

public val DesignGroup.`Shadow-fill`: ImageVector
    get() {
        if (`_shadow-fill` != null) {
            return `_shadow-fill`!!
        }
        `_shadow-fill` = Builder(name = "Shadow-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                curveTo(2.0f, 2.4477f, 2.4477f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 2.0f, 18.0f, 2.4477f, 18.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 6.0f, 22.0f, 6.4477f, 22.0f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 22.0f, 6.0f, 21.5523f, 6.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 18.0f, 2.0f, 17.5523f, 2.0f, 17.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.4393f)
                lineTo(9.4393f, 18.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(11.5607f, 18.0f)
                lineTo(13.5607f, 20.0f)
                horizontalLineTo(16.4393f)
                lineTo(14.4393f, 18.0f)
                horizontalLineTo(11.5607f)
                close()
                moveTo(20.0f, 20.0f)
                verticalLineTo(18.5607f)
                lineTo(18.0f, 16.5607f)
                verticalLineTo(17.0f)
                curveTo(18.0f, 17.5523f, 17.5523f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(16.5607f)
                lineTo(18.5607f, 20.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(20.0f, 13.5607f)
                lineTo(18.0f, 11.5607f)
                verticalLineTo(14.4393f)
                lineTo(20.0f, 16.4393f)
                verticalLineTo(13.5607f)
                close()
                moveTo(20.0f, 11.4393f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.4393f)
                lineTo(20.0f, 11.4393f)
                close()
            }
        }
        .build()
        return `_shadow-fill`!!
    }

private var `_shadow-fill`: ImageVector? = null
