package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Slideshow-2-line`: ImageVector
    get() {
        if (`_slideshow-2-line` != null) {
            return `_slideshow-2-line`!!
        }
        `_slideshow-2-line` = Builder(name = "Slideshow-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 17.0f, 3.0f, 16.5523f, 3.0f, 16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 16.5523f, 20.5523f, 17.0f, 20.0f, 17.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineTo(15.0f, 9.5f)
                lineTo(10.0f, 13.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_slideshow-2-line`!!
    }

private var `_slideshow-2-line`: ImageVector? = null
