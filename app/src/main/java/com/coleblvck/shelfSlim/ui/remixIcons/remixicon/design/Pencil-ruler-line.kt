package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Pencil-ruler-line`: ImageVector
    get() {
        if (`_pencil-ruler-line` != null) {
            return `_pencil-ruler-line`!!
        }
        `_pencil-ruler-line` = Builder(name = "Pencil-ruler-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(3.0f, 7.0f)
                lineTo(7.0f, 2.0f)
                lineTo(11.0f, 7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 4.0f, 21.0f, 4.4477f, 21.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 4.4477f, 13.4477f, 4.0f, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_pencil-ruler-line`!!
    }

private var `_pencil-ruler-line`: ImageVector? = null