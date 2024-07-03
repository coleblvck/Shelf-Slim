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

public val MediaGroup.`Camera-lens-line`: ImageVector
    get() {
        if (`_camera-lens-line` != null) {
            return `_camera-lens-line`!!
        }
        `_camera-lens-line` = Builder(name = "Camera-lens-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.858f, 19.71f)
                lineTo(12.0f, 16.0f)
                horizontalLineTo(5.0703f)
                curveTo(6.1069f, 17.7921f, 7.8188f, 19.1447f, 9.858f, 19.71f)
                close()
                moveTo(4.252f, 14.0f)
                horizontalLineTo(8.5359f)
                lineTo(5.071f, 7.9987f)
                curveTo(4.3899f, 9.1757f, 4.0f, 10.5423f, 4.0f, 12.0f)
                curveTo(4.0f, 12.6906f, 4.0875f, 13.3608f, 4.252f, 14.0f)
                close()
                moveTo(6.395f, 6.2918f)
                lineTo(8.5359f, 10.0f)
                lineTo(12.0f, 4.0f)
                curveTo(9.8171f, 4.0f, 7.8384f, 4.8743f, 6.395f, 6.2918f)
                close()
                moveTo(14.142f, 4.29f)
                lineTo(12.0f, 8.0f)
                horizontalLineTo(18.9297f)
                curveTo(17.8931f, 6.2079f, 16.1812f, 4.8553f, 14.142f, 4.29f)
                close()
                moveTo(19.748f, 10.0f)
                horizontalLineTo(15.4641f)
                lineTo(18.929f, 16.0013f)
                curveTo(19.6101f, 14.8243f, 20.0f, 13.4577f, 20.0f, 12.0f)
                curveTo(20.0f, 11.3094f, 19.9125f, 10.6392f, 19.748f, 10.0f)
                close()
                moveTo(17.605f, 17.7082f)
                lineTo(15.4641f, 14.0f)
                lineTo(12.0f, 20.0f)
                curveTo(14.1829f, 20.0f, 16.1616f, 19.1257f, 17.605f, 17.7082f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.1547f, 10.0f)
                horizontalLineTo(10.8453f)
                lineTo(9.6906f, 12.0f)
                lineTo(10.8453f, 14.0f)
                horizontalLineTo(13.1547f)
                lineTo(14.3094f, 12.0f)
                lineTo(13.1547f, 10.0f)
                close()
            }
        }
        .build()
        return `_camera-lens-line`!!
    }

private var `_camera-lens-line`: ImageVector? = null
