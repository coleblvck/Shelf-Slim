package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Number-8`: ImageVector
    get() {
        if (`_number-8` != null) {
            return `_number-8`!!
        }
        `_number-8` = Builder(name = "Number-8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                curveTo(15.0376f, 1.5f, 17.5f, 3.9624f, 17.5f, 7.0f)
                curveTo(17.5f, 8.7758f, 16.6584f, 10.355f, 15.3523f, 11.3606f)
                curveTo(17.2389f, 12.4091f, 18.5f, 14.3186f, 18.5f, 16.5f)
                curveTo(18.5f, 19.8137f, 15.5899f, 22.5f, 12.0f, 22.5f)
                curveTo(8.4101f, 22.5f, 5.5f, 19.8137f, 5.5f, 16.5f)
                curveTo(5.5f, 14.3186f, 6.7611f, 12.4091f, 8.647f, 11.3589f)
                curveTo(7.3416f, 10.355f, 6.5f, 8.7758f, 6.5f, 7.0f)
                curveTo(6.5f, 3.9624f, 8.9624f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 12.5f)
                curveTo(9.4805f, 12.5f, 7.5f, 14.3282f, 7.5f, 16.5f)
                curveTo(7.5f, 18.6718f, 9.4805f, 20.5f, 12.0f, 20.5f)
                curveTo(14.5194f, 20.5f, 16.5f, 18.6718f, 16.5f, 16.5f)
                curveTo(16.5f, 14.3282f, 14.5194f, 12.5f, 12.0f, 12.5f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7.0f)
                curveTo(8.5f, 8.933f, 10.067f, 10.5f, 12.0f, 10.5f)
                curveTo(13.933f, 10.5f, 15.5f, 8.933f, 15.5f, 7.0f)
                curveTo(15.5f, 5.067f, 13.933f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return `_number-8`!!
    }

private var `_number-8`: ImageVector? = null
