package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Forward-5-fill`: ImageVector
    get() {
        if (`_forward-5-fill` != null) {
            return `_forward-5-fill`!!
        }
        `_forward-5-fill` = Builder(name = "Forward-5-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(15.0159f, 2.0f, 17.72f, 3.3351f, 19.5534f, 5.4465f)
                lineTo(22.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                lineTo(18.1351f, 6.8654f)
                curveTo(16.6676f, 5.1138f, 14.4639f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
                moveTo(14.5f, 10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(12.625f)
                curveTo(12.9702f, 12.75f, 13.25f, 13.0298f, 13.25f, 13.375f)
                curveTo(13.25f, 13.7202f, 12.9702f, 14.0f, 12.625f, 14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(12.625f)
                curveTo(13.7986f, 15.5f, 14.75f, 14.5486f, 14.75f, 13.375f)
                curveTo(14.75f, 12.2014f, 13.7986f, 11.25f, 12.625f, 11.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return `_forward-5-fill`!!
    }

private var `_forward-5-fill`: ImageVector? = null