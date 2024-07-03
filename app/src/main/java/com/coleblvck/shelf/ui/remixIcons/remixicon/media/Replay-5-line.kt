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

public val MediaGroup.`Replay-5-line`: ImageVector
    get() {
        if (`_replay-5-line` != null) {
            return `_replay-5-line`!!
        }
        `_replay-5-line` = Builder(name = "Replay-5-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.5f, 8.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.625f)
                curveTo(13.7986f, 11.25f, 14.75f, 12.2014f, 14.75f, 13.375f)
                curveTo(14.75f, 14.5486f, 13.7986f, 15.5f, 12.625f, 15.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.625f)
                curveTo(12.9702f, 14.0f, 13.25f, 13.7202f, 13.25f, 13.375f)
                curveTo(13.25f, 13.0298f, 12.9702f, 12.75f, 12.625f, 12.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return `_replay-5-line`!!
    }

private var `_replay-5-line`: ImageVector? = null
