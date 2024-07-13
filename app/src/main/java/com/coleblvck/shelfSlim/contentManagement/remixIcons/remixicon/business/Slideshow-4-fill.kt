package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Slideshow-4-fill`: ImageVector
    get() {
        if (`_slideshow-4-fill` != null) {
            return `_slideshow-4-fill`!!
        }
        `_slideshow-4-fill` = Builder(name = "Slideshow-4-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1707f, 3.0f)
                curveTo(8.5825f, 1.8348f, 9.6938f, 1.0f, 11.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(14.3062f, 1.0f, 15.4175f, 1.8348f, 15.8293f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(8.1707f)
                close()
                moveTo(10.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(15.0f, 12.0f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(11.0f, 3.0f)
                curveTo(10.4477f, 3.0f, 10.0f, 3.4477f, 10.0f, 4.0f)
                curveTo(10.0f, 4.5523f, 10.4477f, 5.0f, 11.0f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 5.0f, 14.0f, 4.5523f, 14.0f, 4.0f)
                curveTo(14.0f, 3.4477f, 13.5523f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_slideshow-4-fill`!!
    }

private var `_slideshow-4-fill`: ImageVector? = null
