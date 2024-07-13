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

public val MediaGroup.`Speaker-line`: ImageVector
    get() {
        if (`_speaker-line` != null) {
            return `_speaker-line`!!
        }
        `_speaker-line` = Builder(name = "Speaker-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                close()
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
                moveTo(12.0f, 17.0f)
                curveTo(13.3807f, 17.0f, 14.5f, 15.8807f, 14.5f, 14.5f)
                curveTo(14.5f, 13.1193f, 13.3807f, 12.0f, 12.0f, 12.0f)
                curveTo(10.6193f, 12.0f, 9.5f, 13.1193f, 9.5f, 14.5f)
                curveTo(9.5f, 15.8807f, 10.6193f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(9.5147f, 19.0f, 7.5f, 16.9853f, 7.5f, 14.5f)
                curveTo(7.5f, 12.0147f, 9.5147f, 10.0f, 12.0f, 10.0f)
                curveTo(14.4853f, 10.0f, 16.5f, 12.0147f, 16.5f, 14.5f)
                curveTo(16.5f, 16.9853f, 14.4853f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 8.5f)
                curveTo(11.1716f, 8.5f, 10.5f, 7.8284f, 10.5f, 7.0f)
                curveTo(10.5f, 6.1716f, 11.1716f, 5.5f, 12.0f, 5.5f)
                curveTo(12.8284f, 5.5f, 13.5f, 6.1716f, 13.5f, 7.0f)
                curveTo(13.5f, 7.8284f, 12.8284f, 8.5f, 12.0f, 8.5f)
                close()
            }
        }
        .build()
        return `_speaker-line`!!
    }

private var `_speaker-line`: ImageVector? = null
