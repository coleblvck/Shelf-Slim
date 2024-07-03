package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`More-2-fill`: ImageVector
    get() {
        if (`_more-2-fill` != null) {
            return `_more-2-fill`!!
        }
        `_more-2-fill` = Builder(name = "More-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(10.9f, 3.0f, 10.0f, 3.9f, 10.0f, 5.0f)
                curveTo(10.0f, 6.1f, 10.9f, 7.0f, 12.0f, 7.0f)
                curveTo(13.1f, 7.0f, 14.0f, 6.1f, 14.0f, 5.0f)
                curveTo(14.0f, 3.9f, 13.1f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(10.9f, 17.0f, 10.0f, 17.9f, 10.0f, 19.0f)
                curveTo(10.0f, 20.1f, 10.9f, 21.0f, 12.0f, 21.0f)
                curveTo(13.1f, 21.0f, 14.0f, 20.1f, 14.0f, 19.0f)
                curveTo(14.0f, 17.9f, 13.1f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1f, 10.9f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1f, 14.0f, 14.0f, 13.1f, 14.0f, 12.0f)
                curveTo(14.0f, 10.9f, 13.1f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_more-2-fill`!!
    }

private var `_more-2-fill`: ImageVector? = null
