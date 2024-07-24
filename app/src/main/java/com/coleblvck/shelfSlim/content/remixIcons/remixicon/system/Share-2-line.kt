package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Share-2-line`: ImageVector
    get() {
        if (`_share-2-line` != null) {
            return `_share-2-line`!!
        }
        `_share-2-line` = Builder(name = "Share-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5858f)
                lineTo(18.2071f, 8.7929f)
                lineTo(16.7929f, 10.2071f)
                lineTo(13.0f, 6.4142f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.4142f)
                lineTo(7.2071f, 10.2071f)
                lineTo(5.7929f, 8.7929f)
                lineTo(12.0f, 2.5858f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                curveTo(5.0f, 18.5523f, 5.4477f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 19.0f, 19.0f, 18.5523f, 19.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_share-2-line`!!
    }

private var `_share-2-line`: ImageVector? = null
