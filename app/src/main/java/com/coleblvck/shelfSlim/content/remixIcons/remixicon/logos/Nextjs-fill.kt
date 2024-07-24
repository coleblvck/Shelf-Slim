package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Nextjs-fill`: ImageVector
    get() {
        if (`_nextjs-fill` != null) {
            return `_nextjs-fill`!!
        }
        `_nextjs-fill` = Builder(name = "Nextjs-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(15.9999f, 8.0f)
                horizontalLineTo(14.6499f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.9999f)
                verticalLineTo(8.0f)
                close()
                moveTo(9.3461f, 9.7094f)
                lineTo(15.405f, 17.5379f)
                lineTo(16.4591f, 16.7293f)
                lineTo(9.6828f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.9969f)
                horizontalLineTo(9.3461f)
                verticalLineTo(9.7094f)
                close()
            }
        }
        .build()
        return `_nextjs-fill`!!
    }

private var `_nextjs-fill`: ImageVector? = null
