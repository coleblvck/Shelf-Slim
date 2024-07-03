package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Delete-bin-2-line`: ImageVector
    get() {
        if (`_delete-bin-2-line` != null) {
            return `_delete-bin-2-line`!!
        }
        `_delete-bin-2-line` = Builder(name = "Delete-bin-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.4477f, 7.4477f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 2.0f, 17.0f, 2.4477f, 17.0f, 3.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(13.4142f, 13.9997f)
                lineTo(15.182f, 15.7675f)
                lineTo(13.7678f, 17.1817f)
                lineTo(12.0f, 15.4139f)
                lineTo(10.2322f, 17.1817f)
                lineTo(8.818f, 15.7675f)
                lineTo(10.5858f, 13.9997f)
                lineTo(8.818f, 12.232f)
                lineTo(10.2322f, 10.8178f)
                lineTo(12.0f, 12.5855f)
                lineTo(13.7678f, 10.8178f)
                lineTo(15.182f, 12.232f)
                lineTo(13.4142f, 13.9997f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_delete-bin-2-line`!!
    }

private var `_delete-bin-2-line`: ImageVector? = null
