package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Subway-line`: ImageVector
    get() {
        if (`_subway-line` != null) {
            return `_subway-line`!!
        }
        `_subway-line` = Builder(name = "Subway-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 20.0f)
                lineTo(19.0f, 21.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.5f)
                lineTo(6.8f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 20.0f, 3.0f, 19.1046f, 3.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.7909f, 4.7909f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2091f, 3.0f, 21.0f, 4.7909f, 21.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.1046f, 20.1046f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(17.2f)
                close()
                moveTo(13.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.8954f, 18.1046f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineTo(7.0f)
                curveTo(5.8954f, 5.0f, 5.0f, 5.8954f, 5.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(7.5f, 17.0f)
                curveTo(6.6716f, 17.0f, 6.0f, 16.3284f, 6.0f, 15.5f)
                curveTo(6.0f, 14.6716f, 6.6716f, 14.0f, 7.5f, 14.0f)
                curveTo(8.3284f, 14.0f, 9.0f, 14.6716f, 9.0f, 15.5f)
                curveTo(9.0f, 16.3284f, 8.3284f, 17.0f, 7.5f, 17.0f)
                close()
                moveTo(16.5f, 17.0f)
                curveTo(15.6716f, 17.0f, 15.0f, 16.3284f, 15.0f, 15.5f)
                curveTo(15.0f, 14.6716f, 15.6716f, 14.0f, 16.5f, 14.0f)
                curveTo(17.3284f, 14.0f, 18.0f, 14.6716f, 18.0f, 15.5f)
                curveTo(18.0f, 16.3284f, 17.3284f, 17.0f, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return `_subway-line`!!
    }

private var `_subway-line`: ImageVector? = null
