package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Music-2-fill`: ImageVector
    get() {
        if (`_music-2-fill` != null) {
            return `_music-2-fill`!!
        }
        `_music-2-fill` = Builder(name = "Music-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 19.2091f, 18.2091f, 21.0f, 16.0f, 21.0f)
                curveTo(13.7909f, 21.0f, 12.0f, 19.2091f, 12.0f, 17.0f)
                curveTo(12.0f, 14.7909f, 13.7909f, 13.0f, 16.0f, 13.0f)
                curveTo(16.7286f, 13.0f, 17.4117f, 13.1948f, 18.0f, 13.5351f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 19.2091f, 7.2091f, 21.0f, 5.0f, 21.0f)
                curveTo(2.7909f, 21.0f, 1.0f, 19.2091f, 1.0f, 17.0f)
                curveTo(1.0f, 14.7909f, 2.7909f, 13.0f, 5.0f, 13.0f)
                curveTo(5.7286f, 13.0f, 6.4117f, 13.1948f, 7.0f, 13.5351f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_music-2-fill`!!
    }

private var `_music-2-fill`: ImageVector? = null
