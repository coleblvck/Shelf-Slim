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

public val BusinessGroup.`Slideshow-fill`: ImageVector
    get() {
        if (`_slideshow-fill` != null) {
            return `_slideshow-fill`!!
        }
        `_slideshow-fill` = Builder(name = "Slideshow-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(6.3432f, 10.0f, 5.0f, 11.3431f, 5.0f, 13.0f)
                curveTo(5.0f, 14.6569f, 6.3432f, 16.0f, 8.0f, 16.0f)
                curveTo(9.6568f, 16.0f, 11.0f, 14.6569f, 11.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(2.0f, 3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_slideshow-fill`!!
    }

private var `_slideshow-fill`: ImageVector? = null
