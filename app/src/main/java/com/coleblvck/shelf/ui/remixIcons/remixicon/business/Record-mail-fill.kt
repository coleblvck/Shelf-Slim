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

public val BusinessGroup.`Record-mail-fill`: ImageVector
    get() {
        if (`_record-mail-fill` != null) {
            return `_record-mail-fill`!!
        }
        `_record-mail-fill` = Builder(name = "Record-mail-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7428f, 15.0f)
                horizontalLineTo(14.2572f)
                curveTo(13.4718f, 14.0491f, 13.0f, 12.8296f, 13.0f, 11.5f)
                curveTo(13.0f, 8.4624f, 15.4624f, 6.0f, 18.5f, 6.0f)
                curveTo(21.5376f, 6.0f, 24.0f, 8.4624f, 24.0f, 11.5f)
                curveTo(24.0f, 14.5376f, 21.5376f, 17.0f, 18.5f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(2.4624f, 17.0f, 0.0f, 14.5376f, 0.0f, 11.5f)
                curveTo(0.0f, 8.4624f, 2.4624f, 6.0f, 5.5f, 6.0f)
                curveTo(8.5376f, 6.0f, 11.0f, 8.4624f, 11.0f, 11.5f)
                curveTo(11.0f, 12.8296f, 10.5282f, 14.0491f, 9.7428f, 15.0f)
                close()
                moveTo(5.5f, 13.0f)
                curveTo(6.3284f, 13.0f, 7.0f, 12.3284f, 7.0f, 11.5f)
                curveTo(7.0f, 10.6716f, 6.3284f, 10.0f, 5.5f, 10.0f)
                curveTo(4.6716f, 10.0f, 4.0f, 10.6716f, 4.0f, 11.5f)
                curveTo(4.0f, 12.3284f, 4.6716f, 13.0f, 5.5f, 13.0f)
                close()
                moveTo(18.5f, 13.0f)
                curveTo(19.3284f, 13.0f, 20.0f, 12.3284f, 20.0f, 11.5f)
                curveTo(20.0f, 10.6716f, 19.3284f, 10.0f, 18.5f, 10.0f)
                curveTo(17.6716f, 10.0f, 17.0f, 10.6716f, 17.0f, 11.5f)
                curveTo(17.0f, 12.3284f, 17.6716f, 13.0f, 18.5f, 13.0f)
                close()
            }
        }
        .build()
        return `_record-mail-fill`!!
    }

private var `_record-mail-fill`: ImageVector? = null
