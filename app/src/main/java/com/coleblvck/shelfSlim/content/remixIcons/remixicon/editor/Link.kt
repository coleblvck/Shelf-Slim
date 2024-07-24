package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3638f, 15.5355f)
                lineTo(16.9496f, 14.1213f)
                lineTo(18.3638f, 12.7071f)
                curveTo(20.3164f, 10.7545f, 20.3164f, 7.5887f, 18.3638f, 5.636f)
                curveTo(16.4112f, 3.6834f, 13.2453f, 3.6834f, 11.2927f, 5.636f)
                lineTo(9.8785f, 7.0503f)
                lineTo(8.4643f, 5.636f)
                lineTo(9.8785f, 4.2218f)
                curveTo(12.6122f, 1.4882f, 17.0443f, 1.4882f, 19.778f, 4.2218f)
                curveTo(22.5117f, 6.9555f, 22.5117f, 11.3876f, 19.778f, 14.1213f)
                lineTo(18.3638f, 15.5355f)
                close()
                moveTo(15.5353f, 18.364f)
                lineTo(14.1211f, 19.7782f)
                curveTo(11.3875f, 22.5118f, 6.9553f, 22.5118f, 4.2216f, 19.7782f)
                curveTo(1.488f, 17.0445f, 1.488f, 12.6123f, 4.2216f, 9.8787f)
                lineTo(5.6358f, 8.4645f)
                lineTo(7.0501f, 9.8787f)
                lineTo(5.6358f, 11.2929f)
                curveTo(3.6832f, 13.2455f, 3.6832f, 16.4113f, 5.6358f, 18.364f)
                curveTo(7.5885f, 20.3166f, 10.7543f, 20.3166f, 12.7069f, 18.364f)
                lineTo(14.1211f, 16.9497f)
                lineTo(15.5353f, 18.364f)
                close()
                moveTo(14.8282f, 7.7574f)
                lineTo(16.2425f, 9.1716f)
                lineTo(9.1714f, 16.2426f)
                lineTo(7.7572f, 14.8284f)
                lineTo(14.8282f, 7.7574f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
