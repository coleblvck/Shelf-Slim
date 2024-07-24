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

public val SystemGroup.`Share-2-fill`: ImageVector
    get() {
        if (`_share-2-fill` != null) {
            return `_share-2-fill`!!
        }
        `_share-2-fill` = Builder(name = "Share-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4144f, 9.0001f)
                lineTo(12.0002f, 2.5859f)
                lineTo(5.5859f, 9.0001f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0001f)
                horizontalLineTo(18.4144f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.6569f, 4.3432f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.5523f, 18.5523f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_share-2-fill`!!
    }

private var `_share-2-fill`: ImageVector? = null
