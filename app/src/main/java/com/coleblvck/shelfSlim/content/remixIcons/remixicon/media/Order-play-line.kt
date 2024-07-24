package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Order-play-line`: ImageVector
    get() {
        if (`_order-play-line` != null) {
            return `_order-play-line`!!
        }
        `_order-play-line` = Builder(name = "Order-play-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                verticalLineTo(2.0675f)
                curveTo(17.0f, 1.7914f, 17.2239f, 1.5675f, 17.5f, 1.5675f)
                curveTo(17.617f, 1.5675f, 17.7302f, 1.6085f, 17.8201f, 1.6834f)
                lineTo(21.9391f, 5.1159f)
                curveTo(22.1512f, 5.2927f, 22.1799f, 5.6079f, 22.0031f, 5.8201f)
                curveTo(21.9081f, 5.9341f, 21.7674f, 6.0f, 21.619f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(2.0f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_order-play-line`!!
    }

private var `_order-play-line`: ImageVector? = null
