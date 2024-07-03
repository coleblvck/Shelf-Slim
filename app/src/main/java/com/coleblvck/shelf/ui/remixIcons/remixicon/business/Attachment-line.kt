package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Attachment-line`: ImageVector
    get() {
        if (`_attachment-line` != null) {
            return `_attachment-line`!!
        }
        `_attachment-line` = Builder(name = "Attachment-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.5f)
                verticalLineTo(8.0f)
                curveTo(14.0f, 5.7909f, 12.2091f, 4.0f, 10.0f, 4.0f)
                curveTo(7.7909f, 4.0f, 6.0f, 5.7909f, 6.0f, 8.0f)
                verticalLineTo(13.5f)
                curveTo(6.0f, 17.0899f, 8.9101f, 20.0f, 12.5f, 20.0f)
                curveTo(16.0899f, 20.0f, 19.0f, 17.0899f, 19.0f, 13.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.5f)
                curveTo(21.0f, 18.1944f, 17.1944f, 22.0f, 12.5f, 22.0f)
                curveTo(7.8056f, 22.0f, 4.0f, 18.1944f, 4.0f, 13.5f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 4.6863f, 6.6863f, 2.0f, 10.0f, 2.0f)
                curveTo(13.3137f, 2.0f, 16.0f, 4.6863f, 16.0f, 8.0f)
                verticalLineTo(13.5f)
                curveTo(16.0f, 15.433f, 14.433f, 17.0f, 12.5f, 17.0f)
                curveTo(10.567f, 17.0f, 9.0f, 15.433f, 9.0f, 13.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.5f)
                curveTo(11.0f, 14.3284f, 11.6716f, 15.0f, 12.5f, 15.0f)
                curveTo(13.3284f, 15.0f, 14.0f, 14.3284f, 14.0f, 13.5f)
                close()
            }
        }
        .build()
        return `_attachment-line`!!
    }

private var `_attachment-line`: ImageVector? = null
