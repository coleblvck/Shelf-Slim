package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Headphone-fill`: ImageVector
    get() {
        if (`_headphone-fill` != null) {
            return `_headphone-fill`!!
        }
        `_headphone-fill` = Builder(name = "Headphone-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                horizontalLineTo(7.0f)
                curveTo(8.1046f, 12.0f, 9.0f, 12.8954f, 9.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 20.1046f, 8.1046f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 21.0f, 2.0f, 20.1046f, 2.0f, 19.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.1046f, 21.1046f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(15.8954f, 21.0f, 15.0f, 20.1046f, 15.0f, 19.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 12.8954f, 15.8954f, 12.0f, 17.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_headphone-fill`!!
    }

private var `_headphone-fill`: ImageVector? = null
