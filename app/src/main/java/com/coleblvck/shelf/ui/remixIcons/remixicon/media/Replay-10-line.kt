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

public val MediaGroup.`Replay-10-line`: ImageVector
    get() {
        if (`_replay-10-line` != null) {
            return `_replay-10-line`!!
        }
        `_replay-10-line` = Builder(name = "Replay-10-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(9.2502f, 4.0f, 6.8245f, 5.3873f, 5.3845f, 7.5002f)
                lineTo(8.0f, 7.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(4.0f)
                lineTo(3.9999f, 5.9992f)
                curveTo(5.8243f, 3.5707f, 8.7287f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.5f, 13.25f)
                curveTo(15.5f, 13.8023f, 15.0523f, 14.25f, 14.5f, 14.25f)
                curveTo(13.9477f, 14.25f, 13.5f, 13.8023f, 13.5f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(13.5f, 10.1977f, 13.9477f, 9.75f, 14.5f, 9.75f)
                curveTo(15.0523f, 9.75f, 15.5f, 10.1977f, 15.5f, 10.75f)
                verticalLineTo(13.25f)
                close()
                moveTo(14.5f, 8.25f)
                curveTo(13.1193f, 8.25f, 12.0f, 9.3693f, 12.0f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(12.0f, 14.6307f, 13.1193f, 15.75f, 14.5f, 15.75f)
                curveTo(15.8807f, 15.75f, 17.0f, 14.6307f, 17.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(17.0f, 9.3693f, 15.8807f, 8.25f, 14.5f, 8.25f)
                close()
                moveTo(8.5f, 15.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return `_replay-10-line`!!
    }

private var `_replay-10-line`: ImageVector? = null
