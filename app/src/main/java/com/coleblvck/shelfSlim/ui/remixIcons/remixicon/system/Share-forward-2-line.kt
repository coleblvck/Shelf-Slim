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

public val SystemGroup.`Share-forward-2-line`: ImageVector
    get() {
        if (`_share-forward-2-line` != null) {
            return `_share-forward-2-line`!!
        }
        `_share-forward-2-line` = Builder(name = "Share-forward-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.9997f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.9997f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.9997f)
                curveTo(22.0f, 20.552f, 21.5523f, 20.9997f, 21.0f, 20.9997f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 20.9997f, 2.0f, 20.552f, 2.0f, 19.9997f)
                verticalLineTo(13.9997f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.9997f)
                close()
                moveTo(16.1716f, 6.9997f)
                lineTo(12.2218f, 3.05f)
                lineTo(13.636f, 1.6357f)
                lineTo(20.0f, 7.9997f)
                lineTo(13.636f, 14.3637f)
                lineTo(12.2218f, 12.9495f)
                lineTo(16.1716f, 8.9997f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.9997f)
                horizontalLineTo(16.1716f)
                close()
            }
        }
        .build()
        return `_share-forward-2-line`!!
    }

private var `_share-forward-2-line`: ImageVector? = null
