package com.coleblvck.shelf.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Phone-find-line`: ImageVector
    get() {
        if (`_phone-find-line` != null) {
            return `_phone-find-line`!!
        }
        `_phone-find-line` = Builder(name = "Phone-find-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                curveTo(18.5523f, 2.0f, 19.0f, 2.4477f, 19.0f, 3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 22.0f, 5.0f, 21.5523f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.4477f, 5.4477f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(17.2091f, 12.0f, 19.0f, 13.7909f, 19.0f, 16.0f)
                curveTo(19.0f, 16.7419f, 18.798f, 17.4366f, 18.446f, 18.0322f)
                lineTo(20.6569f, 20.2426f)
                lineTo(19.2426f, 21.6569f)
                lineTo(17.0313f, 19.4466f)
                curveTo(16.4359f, 19.7982f, 15.7415f, 20.0f, 15.0f, 20.0f)
                curveTo(12.7909f, 20.0f, 11.0f, 18.2091f, 11.0f, 16.0f)
                curveTo(11.0f, 13.7909f, 12.7909f, 12.0f, 15.0f, 12.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(13.8954f, 14.0f, 13.0f, 14.8954f, 13.0f, 16.0f)
                curveTo(13.0f, 17.1046f, 13.8954f, 18.0f, 15.0f, 18.0f)
                curveTo(16.1046f, 18.0f, 17.0f, 17.1046f, 17.0f, 16.0f)
                curveTo(17.0f, 14.8954f, 16.1046f, 14.0f, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_phone-find-line`!!
    }

private var `_phone-find-line`: ImageVector? = null
