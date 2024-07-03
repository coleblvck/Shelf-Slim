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

public val DesignGroup.`Align-item-horizontal-center-line`: ImageVector
    get() {
        if (`_align-item-horizontal-center-line` != null) {
            return `_align-item-horizontal-center-line`!!
        }
        `_align-item-horizontal-center-line` = Builder(name = "Align-item-horizontal-center-line",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 4.0f, 20.0f, 4.4477f, 20.0f, 5.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 10.5523f, 19.5523f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 13.0f, 18.0f, 13.4477f, 18.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 19.5523f, 17.5523f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 13.4477f, 6.4477f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 11.0f, 4.0f, 10.5523f, 4.0f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.4477f, 4.4477f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_align-item-horizontal-center-line`!!
    }

private var `_align-item-horizontal-center-line`: ImageVector? = null
