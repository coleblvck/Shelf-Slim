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

public val DesignGroup.`Ink-bottle-line`: ImageVector
    get() {
        if (`_ink-bottle-line` != null) {
            return `_ink-bottle-line`!!
        }
        `_ink-bottle-line` = Builder(name = "Ink-bottle-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.9967f)
                lineTo(20.3714f, 10.7452f)
                curveTo(20.751f, 10.8971f, 21.0f, 11.2648f, 21.0f, 11.6737f)
                verticalLineTo(20.9967f)
                curveTo(21.0f, 21.549f, 20.5523f, 21.9967f, 20.0f, 21.9967f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.9967f, 3.0f, 21.549f, 3.0f, 20.9967f)
                verticalLineTo(11.6737f)
                curveTo(3.0f, 11.2648f, 3.249f, 10.8971f, 3.6286f, 10.7452f)
                lineTo(8.0f, 8.9967f)
                horizontalLineTo(16.0f)
                close()
                moveTo(15.6148f, 10.9967f)
                horizontalLineTo(8.3852f)
                lineTo(5.0f, 12.3508f)
                verticalLineTo(19.9967f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.9967f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.9967f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.3508f)
                lineTo(15.6148f, 10.9967f)
                close()
                moveTo(16.0f, 2.9967f)
                curveTo(16.5523f, 2.9967f, 17.0f, 3.4444f, 17.0f, 3.9967f)
                verticalLineTo(7.9967f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.9967f)
                curveTo(7.0f, 3.4444f, 7.4477f, 2.9967f, 8.0f, 2.9967f)
                horizontalLineTo(16.0f)
                close()
                moveTo(15.0f, 4.9967f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.9967f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.9967f)
                close()
            }
        }
        .build()
        return `_ink-bottle-line`!!
    }

private var `_ink-bottle-line`: ImageVector? = null
