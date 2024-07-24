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

public val MediaGroup.`Image-edit-line`: ImageVector
    get() {
        if (`_image-edit-line` != null) {
            return `_image-edit-line`!!
        }
        `_image-edit-line` = Builder(name = "Image-edit-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(5.757f)
                lineTo(19.0f, 7.757f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.1f)
                lineTo(9.0f, 9.1005f)
                lineTo(13.328f, 13.429f)
                lineTo(11.9132f, 14.8422f)
                lineTo(9.0f, 11.9289f)
                lineTo(5.0f, 15.928f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.533f)
                lineTo(16.2414f, 19.0012f)
                lineTo(17.57f, 17.671f)
                lineTo(18.8995f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.242f)
                lineTo(21.0f, 14.242f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 21.0f, 3.0f, 20.55f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(21.7782f, 7.8076f)
                lineTo(23.1924f, 9.2218f)
                lineTo(15.4142f, 17.0f)
                lineTo(13.9979f, 16.9979f)
                lineTo(14.0f, 15.5858f)
                lineTo(21.7782f, 7.8076f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(16.3284f, 7.0f, 17.0f, 7.6716f, 17.0f, 8.5f)
                curveTo(17.0f, 9.3284f, 16.3284f, 10.0f, 15.5f, 10.0f)
                curveTo(14.6716f, 10.0f, 14.0f, 9.3284f, 14.0f, 8.5f)
                curveTo(14.0f, 7.6716f, 14.6716f, 7.0f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return `_image-edit-line`!!
    }

private var `_image-edit-line`: ImageVector? = null
