package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Pie-chart-box-fill`: ImageVector
    get() {
        if (`_pie-chart-box-fill` != null) {
            return `_pie-chart-box-fill`!!
        }
        `_pie-chart-box-fill` = Builder(name = "Pie-chart-box-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(16.9f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.1f)
                curveTo(8.7178f, 7.5633f, 7.0f, 9.581f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                curveTo(14.419f, 17.0f, 16.4367f, 15.2822f, 16.9f, 13.0f)
                close()
                moveTo(16.9f, 11.0f)
                curveTo(16.5023f, 9.0409f, 14.9591f, 7.4977f, 13.0f, 7.1f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.9f)
                close()
            }
        }
        .build()
        return `_pie-chart-box-fill`!!
    }

private var `_pie-chart-box-fill`: ImageVector? = null
