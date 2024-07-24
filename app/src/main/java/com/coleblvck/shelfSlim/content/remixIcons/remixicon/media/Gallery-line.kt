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

public val MediaGroup.`Gallery-line`: ImageVector
    get() {
        if (`_gallery-line` != null) {
            return `_gallery-line`!!
        }
        `_gallery-line` = Builder(name = "Gallery-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveTo(18.3221f, 13.0f, 16.7514f, 13.4592f, 15.4068f, 14.2587f)
                curveTo(16.5908f, 15.6438f, 17.5269f, 17.2471f, 18.1465f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(16.0037f, 19.0f)
                curveTo(14.0446f, 14.3021f, 9.4079f, 11.0f, 4.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0037f)
                close()
                moveTo(4.0f, 9.0f)
                curveTo(7.8291f, 9.0f, 11.3232f, 10.4348f, 13.9738f, 12.7961f)
                curveTo(15.7047f, 11.6605f, 17.7752f, 11.0f, 20.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.9934f)
                verticalLineTo(20.0066f)
                curveTo(22.0f, 20.5552f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5551f, 2.0f, 20.0066f)
                verticalLineTo(3.9934f)
                curveTo(2.0f, 3.4448f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.0f, 1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(16.5f, 10.0f)
                curveTo(15.6716f, 10.0f, 15.0f, 9.3284f, 15.0f, 8.5f)
                curveTo(15.0f, 7.6716f, 15.6716f, 7.0f, 16.5f, 7.0f)
                curveTo(17.3284f, 7.0f, 18.0f, 7.6716f, 18.0f, 8.5f)
                curveTo(18.0f, 9.3284f, 17.3284f, 10.0f, 16.5f, 10.0f)
                close()
            }
        }
        .build()
        return `_gallery-line`!!
    }

private var `_gallery-line`: ImageVector? = null
