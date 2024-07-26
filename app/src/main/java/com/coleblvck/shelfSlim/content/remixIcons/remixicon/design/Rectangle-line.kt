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

public val DesignGroup.`Rectangle-line`: ImageVector
    get() {
        if (`_rectangle-line` != null) {
            return `_rectangle-line`!!
        }
        `_rectangle-line` = Builder(name = "Rectangle-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 4.0f, 22.0f, 4.4477f, 22.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 4.4477f, 2.4477f, 4.0f, 3.0f, 4.0f)
                close()
                moveTo(4.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_rectangle-line`!!
    }

private var `_rectangle-line`: ImageVector? = null