package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Android-fill`: ImageVector
    get() {
        if (`_android-fill` != null) {
            return `_android-fill`!!
        }
        `_android-fill` = Builder(name = "Android-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3823f, 3.9681f)
                curveTo(7.922f, 2.7365f, 9.875f, 2.0f, 12.0f, 2.0f)
                curveTo(14.125f, 2.0f, 16.078f, 2.7365f, 17.6177f, 3.9681f)
                lineTo(19.0711f, 2.5147f)
                lineTo(20.4853f, 3.9289f)
                lineTo(19.0319f, 5.3823f)
                curveTo(20.2635f, 6.922f, 21.0f, 8.875f, 21.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 8.875f, 3.7365f, 6.922f, 4.9681f, 5.3823f)
                lineTo(3.5147f, 3.9289f)
                lineTo(4.9289f, 2.5147f)
                lineTo(6.3823f, 3.9681f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(9.5523f, 9.0f, 10.0f, 8.5523f, 10.0f, 8.0f)
                curveTo(10.0f, 7.4477f, 9.5523f, 7.0f, 9.0f, 7.0f)
                curveTo(8.4477f, 7.0f, 8.0f, 7.4477f, 8.0f, 8.0f)
                curveTo(8.0f, 8.5523f, 8.4477f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(15.5523f, 9.0f, 16.0f, 8.5523f, 16.0f, 8.0f)
                curveTo(16.0f, 7.4477f, 15.5523f, 7.0f, 15.0f, 7.0f)
                curveTo(14.4477f, 7.0f, 14.0f, 7.4477f, 14.0f, 8.0f)
                curveTo(14.0f, 8.5523f, 14.4477f, 9.0f, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_android-fill`!!
    }

private var `_android-fill`: ImageVector? = null
