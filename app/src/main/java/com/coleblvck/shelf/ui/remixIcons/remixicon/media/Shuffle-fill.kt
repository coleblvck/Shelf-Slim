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

public val MediaGroup.`Shuffle-fill`: ImageVector
    get() {
        if (`_shuffle-fill` != null) {
            return `_shuffle-fill`!!
        }
        `_shuffle-fill` = Builder(name = "Shuffle-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.8832f)
                verticalLineTo(16.0f)
                lineTo(23.0f, 19.0f)
                lineTo(18.0f, 22.0f)
                verticalLineTo(19.9095f)
                curveTo(14.9224f, 19.4698f, 12.2513f, 17.4584f, 11.0029f, 14.5453f)
                lineTo(11.0f, 14.5386f)
                lineTo(10.9971f, 14.5453f)
                curveTo(9.5789f, 17.8544f, 6.3251f, 20.0f, 2.7248f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.7248f)
                curveTo(5.525f, 18.0f, 8.0558f, 16.3312f, 9.1588f, 13.7574f)
                lineTo(9.912f, 12.0f)
                lineTo(9.1588f, 10.2426f)
                curveTo(8.0558f, 7.6688f, 5.525f, 6.0f, 2.7248f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.7248f)
                curveTo(6.3251f, 4.0f, 9.5789f, 6.1456f, 10.9971f, 9.4547f)
                lineTo(11.0f, 9.4614f)
                lineTo(11.0029f, 9.4547f)
                curveTo(12.2513f, 6.5416f, 14.9224f, 4.5302f, 18.0f, 4.0905f)
                verticalLineTo(2.0f)
                lineTo(23.0f, 5.0f)
                lineTo(18.0f, 8.0f)
                verticalLineTo(6.1168f)
                curveTo(15.7266f, 6.5376f, 13.7737f, 8.0667f, 12.8412f, 10.2426f)
                lineTo(12.088f, 12.0f)
                lineTo(12.8412f, 13.7574f)
                curveTo(13.7737f, 15.9333f, 15.7266f, 17.4624f, 18.0f, 17.8832f)
                close()
            }
        }
        .build()
        return `_shuffle-fill`!!
    }

private var `_shuffle-fill`: ImageVector? = null
