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

public val MediaGroup.`Forward-15-fill`: ImageVector
    get() {
        if (`_forward-15-fill` != null) {
            return `_forward-15-fill`!!
        }
        `_forward-15-fill` = Builder(name = "Forward-15-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(14.4639f, 4.0f, 16.6676f, 5.1138f, 18.1351f, 6.8654f)
                lineTo(16.5001f, 8.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(14.875f)
                curveTo(15.2202f, 12.75f, 15.5f, 13.0298f, 15.5f, 13.375f)
                curveTo(15.5f, 13.7202f, 15.2202f, 14.0f, 14.875f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.875f)
                curveTo(16.0486f, 15.5f, 17.0f, 14.5486f, 17.0f, 13.375f)
                curveTo(17.0f, 12.2014f, 16.0486f, 11.25f, 14.875f, 11.25f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.0f)
                lineTo(19.5534f, 5.4465f)
                curveTo(17.72f, 3.3351f, 15.0159f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.5f, 8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return `_forward-15-fill`!!
    }

private var `_forward-15-fill`: ImageVector? = null
