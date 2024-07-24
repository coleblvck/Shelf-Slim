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

public val MediaGroup.`Clapperboard-fill`: ImageVector
    get() {
        if (`_clapperboard-fill` != null) {
            return `_clapperboard-fill`!!
        }
        `_clapperboard-fill` = Builder(name = "Clapperboard-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9981f, 7.0f)
                lineTo(20.3075f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.9934f)
                verticalLineTo(20.0066f)
                curveTo(22.0f, 20.5552f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5551f, 2.0f, 20.0066f)
                verticalLineTo(3.9934f)
                curveTo(2.0f, 3.4448f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(5.9981f)
                lineTo(3.6887f, 7.0f)
                horizontalLineTo(5.9981f)
                lineTo(8.3075f, 3.0f)
                horizontalLineTo(11.9981f)
                lineTo(9.6887f, 7.0f)
                horizontalLineTo(11.9981f)
                lineTo(14.3075f, 3.0f)
                horizontalLineTo(17.9981f)
                lineTo(15.6887f, 7.0f)
                horizontalLineTo(17.9981f)
                close()
            }
        }
        .build()
        return `_clapperboard-fill`!!
    }

private var `_clapperboard-fill`: ImageVector? = null
