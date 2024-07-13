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

public val MediaGroup.`Speaker-fill`: ImageVector
    get() {
        if (`_speaker-fill` != null) {
            return `_speaker-fill`!!
        }
        `_speaker-fill` = Builder(name = "Speaker-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(14.7614f, 20.0f, 17.0f, 17.7614f, 17.0f, 15.0f)
                curveTo(17.0f, 12.2386f, 14.7614f, 10.0f, 12.0f, 10.0f)
                curveTo(9.2386f, 10.0f, 7.0f, 12.2386f, 7.0f, 15.0f)
                curveTo(7.0f, 17.7614f, 9.2386f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.8284f, 8.0f, 13.5f, 7.3284f, 13.5f, 6.5f)
                curveTo(13.5f, 5.6716f, 12.8284f, 5.0f, 12.0f, 5.0f)
                curveTo(11.1716f, 5.0f, 10.5f, 5.6716f, 10.5f, 6.5f)
                curveTo(10.5f, 7.3284f, 11.1716f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(10.3431f, 18.0f, 9.0f, 16.6569f, 9.0f, 15.0f)
                curveTo(9.0f, 13.3431f, 10.3431f, 12.0f, 12.0f, 12.0f)
                curveTo(13.6569f, 12.0f, 15.0f, 13.3431f, 15.0f, 15.0f)
                curveTo(15.0f, 16.6569f, 13.6569f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_speaker-fill`!!
    }

private var `_speaker-fill`: ImageVector? = null
