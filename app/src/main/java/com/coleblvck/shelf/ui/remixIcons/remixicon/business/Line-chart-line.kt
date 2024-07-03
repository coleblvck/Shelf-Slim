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

public val BusinessGroup.`Line-chart-line`: ImageVector
    get() {
        if (`_line-chart-line` != null) {
            return `_line-chart-line`!!
        }
        `_line-chart-line` = Builder(name = "Line-chart-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(20.2929f, 6.2929f)
                lineTo(21.7071f, 7.7071f)
                lineTo(16.0f, 13.4142f)
                lineTo(13.0f, 10.415f)
                lineTo(8.7071f, 14.7071f)
                lineTo(7.2929f, 13.2929f)
                lineTo(13.0f, 7.5858f)
                lineTo(16.0f, 10.585f)
                lineTo(20.2929f, 6.2929f)
                close()
            }
        }
        .build()
        return `_line-chart-line`!!
    }

private var `_line-chart-line`: ImageVector? = null
