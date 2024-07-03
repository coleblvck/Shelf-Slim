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

public val MediaGroup.`Replay-10-fill`: ImageVector
    get() {
        if (`_replay-10-fill` != null) {
            return `_replay-10-fill`!!
        }
        `_replay-10-fill` = Builder(name = "Replay-10-fill", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(9.5361f, 4.0f, 7.3324f, 5.1138f, 5.8649f, 6.8654f)
                lineTo(8.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                lineTo(4.4466f, 5.4465f)
                curveTo(6.28f, 3.3351f, 8.9841f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.5f, 8.25f)
                curveTo(13.1193f, 8.25f, 12.0f, 9.3693f, 12.0f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(12.0f, 14.6307f, 13.1193f, 15.75f, 14.5f, 15.75f)
                curveTo(15.8807f, 15.75f, 17.0f, 14.6307f, 17.0f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(17.0f, 9.3693f, 15.8807f, 8.25f, 14.5f, 8.25f)
                close()
                moveTo(15.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(15.5f, 13.8023f, 15.0523f, 14.25f, 14.5f, 14.25f)
                curveTo(13.9477f, 14.25f, 13.5f, 13.8023f, 13.5f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(13.5f, 10.1977f, 13.9477f, 9.75f, 14.5f, 9.75f)
                curveTo(15.0523f, 9.75f, 15.5f, 10.1977f, 15.5f, 10.75f)
                close()
                moveTo(10.0f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return `_replay-10-fill`!!
    }

private var `_replay-10-fill`: ImageVector? = null
