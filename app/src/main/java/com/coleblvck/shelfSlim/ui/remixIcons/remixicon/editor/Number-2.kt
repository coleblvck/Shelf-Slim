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

public val EditorGroup.`Number-2`: ImageVector
    get() {
        if (`_number-2` != null) {
            return `_number-2`!!
        }
        `_number-2` = Builder(name = "Number-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0002f, 7.5f)
                curveTo(16.0002f, 5.2909f, 14.2094f, 3.5f, 12.0002f, 3.5f)
                curveTo(9.7911f, 3.5f, 8.0002f, 5.2909f, 8.0002f, 7.5f)
                horizontalLineTo(6.0002f)
                curveTo(6.0002f, 4.1863f, 8.6865f, 1.5f, 12.0002f, 1.5f)
                curveTo(15.314f, 1.5f, 18.0002f, 4.1863f, 18.0002f, 7.5f)
                curveTo(18.0002f, 8.9309f, 17.4993f, 10.2448f, 16.6633f, 11.276f)
                lineTo(9.344f, 19.9991f)
                lineTo(18.0002f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0002f)
                lineTo(6.0f, 20.8731f)
                lineTo(15.0642f, 10.071f)
                curveTo(15.6485f, 9.3759f, 16.0002f, 8.479f, 16.0002f, 7.5f)
                close()
            }
        }
        .build()
        return `_number-2`!!
    }

private var `_number-2`: ImageVector? = null
