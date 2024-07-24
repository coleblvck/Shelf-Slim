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

public val SystemGroup.`Share-box-fill`: ImageVector
    get() {
        if (`_share-box-fill` != null) {
            return `_share-box-fill`!!
        }
        `_share-box-fill` = Builder(name = "Share-box-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(17.7071f, 7.7071f)
                lineTo(12.0f, 13.4142f)
                lineTo(10.5858f, 12.0f)
                lineTo(16.2929f, 6.2929f)
                lineTo(13.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                lineTo(17.7071f, 7.7071f)
                close()
            }
        }
        .build()
        return `_share-box-fill`!!
    }

private var `_share-box-fill`: ImageVector? = null
