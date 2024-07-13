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

public val DesignGroup.`Brush-3-line`: ImageVector
    get() {
        if (`_brush-3-line` != null) {
            return `_brush-3-line`!!
        }
        `_brush-3-line` = Builder(name = "Brush-3-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.9967f)
                verticalLineTo(14.9967f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.9967f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.9967f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.9967f)
                horizontalLineTo(8.0f)
                close()
                moveTo(4.0f, 10.9967f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.9967f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.9967f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.9967f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.9967f)
                close()
                moveTo(3.0f, 20.9967f)
                verticalLineTo(12.9967f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.9967f)
                curveTo(2.0f, 6.4444f, 2.4477f, 5.9967f, 3.0f, 5.9967f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.9967f)
                curveTo(8.0f, 2.4444f, 8.4477f, 1.9967f, 9.0f, 1.9967f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 1.9967f, 16.0f, 2.4444f, 16.0f, 2.9967f)
                verticalLineTo(5.9967f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.9967f, 22.0f, 6.4444f, 22.0f, 6.9967f)
                verticalLineTo(12.9967f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.9967f)
                curveTo(21.0f, 21.549f, 20.5523f, 21.9967f, 20.0f, 21.9967f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.9967f, 3.0f, 21.549f, 3.0f, 20.9967f)
                close()
            }
        }
        .build()
        return `_brush-3-line`!!
    }

private var `_brush-3-line`: ImageVector? = null
