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

public val DesignGroup.`Brush-4-line`: ImageVector
    get() {
        if (`_brush-4-line` != null) {
            return `_brush-4-line`!!
        }
        `_brush-4-line` = Builder(name = "Brush-4-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.9967f)
                verticalLineTo(11.2694f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.9967f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.9967f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.9967f)
                horizontalLineTo(9.0f)
                close()
                moveTo(20.0f, 15.9967f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.9967f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.9967f)
                close()
                moveTo(3.0f, 13.9967f)
                verticalLineTo(3.9967f)
                curveTo(3.0f, 3.4444f, 3.4477f, 2.9967f, 4.0f, 2.9967f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.9967f, 21.0f, 3.4444f, 21.0f, 3.9967f)
                verticalLineTo(13.9967f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.9967f)
                curveTo(22.0f, 19.549f, 21.5523f, 19.9967f, 21.0f, 19.9967f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.9967f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.9967f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 19.9967f, 2.0f, 19.549f, 2.0f, 18.9967f)
                verticalLineTo(13.9967f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_brush-4-line`!!
    }

private var `_brush-4-line`: ImageVector? = null
