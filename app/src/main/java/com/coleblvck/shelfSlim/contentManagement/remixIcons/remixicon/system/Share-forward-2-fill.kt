package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Share-forward-2-fill`: ImageVector
    get() {
        if (`_share-forward-2-fill` != null) {
            return `_share-forward-2-fill`!!
        }
        `_share-forward-2-fill` = Builder(name = "Share-forward-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(12.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(7.0044f, 10.0f, 5.2364f, 10.9742f, 4.1456f, 12.473f)
                curveTo(4.8583f, 8.7851f, 8.1039f, 6.0f, 12.0f, 6.0f)
                verticalLineTo(2.0f)
                lineTo(20.0f, 8.0f)
                lineTo(12.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_share-forward-2-fill`!!
    }

private var `_share-forward-2-fill`: ImageVector? = null
