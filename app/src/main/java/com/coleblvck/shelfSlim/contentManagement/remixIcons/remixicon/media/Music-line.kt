package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Music-line`: ImageVector
    get() {
        if (`_music-line` != null) {
            return `_music-line`!!
        }
        `_music-line` = Builder(name = "Music-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.5351f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                curveTo(14.0f, 19.2091f, 12.2091f, 21.0f, 10.0f, 21.0f)
                curveTo(7.7909f, 21.0f, 6.0f, 19.2091f, 6.0f, 17.0f)
                curveTo(6.0f, 14.7909f, 7.7909f, 13.0f, 10.0f, 13.0f)
                curveTo(10.7286f, 13.0f, 11.4117f, 13.1948f, 12.0f, 13.5351f)
                close()
                moveTo(10.0f, 19.0f)
                curveTo(11.1046f, 19.0f, 12.0f, 18.1046f, 12.0f, 17.0f)
                curveTo(12.0f, 15.8954f, 11.1046f, 15.0f, 10.0f, 15.0f)
                curveTo(8.8954f, 15.0f, 8.0f, 15.8954f, 8.0f, 17.0f)
                curveTo(8.0f, 18.1046f, 8.8954f, 19.0f, 10.0f, 19.0f)
                close()
            }
        }
        .build()
        return `_music-line`!!
    }

private var `_music-line`: ImageVector? = null
