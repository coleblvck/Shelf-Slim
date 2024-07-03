package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Find-replace-fill`: ImageVector
    get() {
        if (`_find-replace-fill` != null) {
            return `_find-replace-fill`!!
        }
        `_find-replace-fill` = Builder(name = "Find-replace-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.031f, 16.6168f)
                lineTo(22.3137f, 20.8995f)
                lineTo(20.8995f, 22.3137f)
                lineTo(16.6168f, 18.031f)
                curveTo(15.0769f, 19.263f, 13.124f, 20.0f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                curveTo(15.968f, 2.0f, 20.0f, 6.032f, 20.0f, 11.0f)
                curveTo(20.0f, 13.124f, 19.263f, 15.0769f, 18.031f, 16.6168f)
                close()
                moveTo(16.6589f, 9.0f)
                curveTo(15.8357f, 6.6691f, 13.6136f, 5.0f, 11.0f, 5.0f)
                curveTo(7.685f, 5.0f, 5.0f, 7.685f, 5.0f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 8.792f, 8.792f, 7.0f, 11.0f, 7.0f)
                curveTo(11.6912f, 7.0f, 12.3417f, 7.1756f, 12.9092f, 7.4847f)
                lineTo(12.0f, 9.0f)
                horizontalLineTo(16.6589f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 13.208f, 13.208f, 15.0f, 11.0f, 15.0f)
                curveTo(10.3088f, 15.0f, 9.6583f, 14.8244f, 9.0908f, 14.5153f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(7.5357f)
                horizontalLineTo(5.3411f)
                curveTo(6.1643f, 15.3309f, 8.3863f, 17.0f, 11.0f, 17.0f)
                curveTo(14.315f, 17.0f, 17.0f, 14.315f, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_find-replace-fill`!!
    }

private var `_find-replace-fill`: ImageVector? = null
