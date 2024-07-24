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

public val MediaGroup.`Vidicon-2-fill`: ImageVector
    get() {
        if (`_vidicon-2-fill` != null) {
            return `_vidicon-2-fill`!!
        }
        `_vidicon-2-fill` = Builder(name = "Vidicon-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 6.0f, 17.0f, 6.4477f, 17.0f, 7.0f)
                verticalLineTo(9.2f)
                lineTo(22.2133f, 5.5507f)
                curveTo(22.4395f, 5.3924f, 22.7513f, 5.4474f, 22.9096f, 5.6736f)
                curveTo(22.9684f, 5.7576f, 23.0f, 5.8577f, 23.0f, 5.9603f)
                verticalLineTo(18.0397f)
                curveTo(23.0f, 18.3158f, 22.7761f, 18.5397f, 22.5f, 18.5397f)
                curveTo(22.3974f, 18.5397f, 22.2973f, 18.5081f, 22.2133f, 18.4493f)
                lineTo(17.0f, 14.8f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.5523f, 16.5523f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 20.0f, 1.0f, 19.5523f, 1.0f, 19.0f)
                verticalLineTo(7.0f)
                curveTo(1.0f, 6.4477f, 1.4477f, 6.0f, 2.0f, 6.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(5.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_vidicon-2-fill`!!
    }

private var `_vidicon-2-fill`: ImageVector? = null
