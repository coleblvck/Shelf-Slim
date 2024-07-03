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

public val MediaGroup.`Memories-line`: ImageVector
    get() {
        if (`_memories-line` != null) {
            return `_memories-line`!!
        }
        `_memories-line` = Builder(name = "Memories-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(8.7287f, 2.0f, 5.8243f, 3.5707f, 3.9999f, 5.9992f)
                lineTo(4.0f, 3.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5f)
                lineTo(5.3845f, 7.5002f)
                curveTo(6.8245f, 5.3873f, 9.2502f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                close()
                moveTo(10.7774f, 8.5182f)
                lineTo(15.376f, 11.584f)
                curveTo(15.6728f, 11.7819f, 15.6728f, 12.2181f, 15.376f, 12.416f)
                lineTo(10.7773f, 15.4818f)
                curveTo(10.4451f, 15.7033f, 10.0f, 15.4651f, 10.0f, 15.0657f)
                verticalLineTo(8.9343f)
                curveTo(10.0f, 8.5349f, 10.4451f, 8.2967f, 10.7774f, 8.5182f)
                close()
            }
        }
        .build()
        return `_memories-line`!!
    }

private var `_memories-line`: ImageVector? = null
