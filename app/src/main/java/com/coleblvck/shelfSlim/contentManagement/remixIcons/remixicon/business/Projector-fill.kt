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

public val BusinessGroup.`Projector-fill`: ImageVector
    get() {
        if (`_projector-fill` != null) {
            return `_projector-fill`!!
        }
        `_projector-fill` = Builder(name = "Projector-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1115f, 12.0f)
                curveTo(11.5662f, 14.004f, 13.3584f, 15.5f, 15.5f, 15.5f)
                curveTo(17.6416f, 15.5f, 19.4338f, 14.004f, 19.8885f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.1115f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(15.5f, 13.5f)
                curveTo(14.1193f, 13.5f, 13.0f, 12.3807f, 13.0f, 11.0f)
                curveTo(13.0f, 9.6193f, 14.1193f, 8.5f, 15.5f, 8.5f)
                curveTo(16.8807f, 8.5f, 18.0f, 9.6193f, 18.0f, 11.0f)
                curveTo(18.0f, 12.3807f, 16.8807f, 13.5f, 15.5f, 13.5f)
                close()
                moveTo(11.1115f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.8885f)
                curveTo(19.4338f, 7.996f, 17.6416f, 6.5f, 15.5f, 6.5f)
                curveTo(13.3584f, 6.5f, 11.5662f, 7.996f, 11.1115f, 10.0f)
                close()
            }
        }
        .build()
        return `_projector-fill`!!
    }

private var `_projector-fill`: ImageVector? = null
