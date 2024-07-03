package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Album-fill`: ImageVector
    get() {
        if (`_album-fill` != null) {
            return `_album-fill`!!
        }
        `_album-fill` = Builder(name = "Album-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(14.2133f, 16.0f, 16.0f, 14.2133f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7867f, 14.2133f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7867f, 8.0f, 8.0f, 9.7867f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2133f, 9.7867f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.55f, 11.0f, 13.0f, 11.45f, 13.0f, 12.0f)
                curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f)
                curveTo(11.45f, 13.0f, 11.0f, 12.55f, 11.0f, 12.0f)
                curveTo(11.0f, 11.45f, 11.45f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_album-fill`!!
    }

private var `_album-fill`: ImageVector? = null
