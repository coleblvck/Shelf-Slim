package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Plug-line`: ImageVector
    get() {
        if (`_plug-line` != null) {
            return `_plug-line`!!
        }
        `_plug-line` = Builder(name = "Plug-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                curveTo(11.8954f, 22.0f, 11.0f, 21.1046f, 11.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(5.7909f, 18.0f, 4.0f, 16.2091f, 4.0f, 14.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 6.4477f, 4.4477f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 6.0f, 20.0f, 6.4477f, 20.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 16.2091f, 18.2091f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 16.0f, 18.0f, 15.1046f, 18.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 15.1046f, 6.8954f, 16.0f, 8.0f, 16.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(11.4477f, 14.5f, 11.0f, 14.0523f, 11.0f, 13.5f)
                curveTo(11.0f, 12.9477f, 11.4477f, 12.5f, 12.0f, 12.5f)
                curveTo(12.5523f, 12.5f, 13.0f, 12.9477f, 13.0f, 13.5f)
                curveTo(13.0f, 14.0523f, 12.5523f, 14.5f, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return `_plug-line`!!
    }

private var `_plug-line`: ImageVector? = null
