package com.coleblvck.shelfSlim.content.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-chart-line`: ImageVector
    get() {
        if (`_file-chart-line` != null) {
            return `_file-chart-line`!!
        }
        `_file-chart-line` = Builder(name = "File-chart-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(15.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.0f, 2.9918f)
                curveTo(3.0f, 2.4441f, 3.4475f, 2.0f, 3.9985f, 2.0f)
                horizontalLineTo(16.0f)
                lineTo(20.9997f, 7.0f)
                lineTo(21.0f, 20.9925f)
                curveTo(21.0f, 21.5489f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                close()
            }
        }
        .build()
        return `_file-chart-line`!!
    }

private var `_file-chart-line`: ImageVector? = null