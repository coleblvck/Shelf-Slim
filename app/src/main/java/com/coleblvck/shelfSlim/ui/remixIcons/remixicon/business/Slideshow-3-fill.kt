package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Slideshow-3-fill`: ImageVector
    get() {
        if (`_slideshow-3-fill` != null) {
            return `_slideshow-3-fill`!!
        }
        `_slideshow-3-fill` = Builder(name = "Slideshow-3-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 18.0f, 2.0f, 17.5523f, 2.0f, 17.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 17.5523f, 21.5523f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(10.0f, 7.5f)
                verticalLineTo(13.5f)
                lineTo(15.0f, 10.5f)
                lineTo(10.0f, 7.5f)
                close()
            }
        }
        .build()
        return `_slideshow-3-fill`!!
    }

private var `_slideshow-3-fill`: ImageVector? = null
