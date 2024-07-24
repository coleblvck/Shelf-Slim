package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-up-line`: ImageVector
    get() {
        if (`_arrow-up-line` != null) {
            return `_arrow-up-line`!!
        }
        `_arrow-up-line` = Builder(name = "Arrow-up-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0001f, 7.8284f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0001f)
                verticalLineTo(7.8284f)
                lineTo(5.6361f, 13.1924f)
                lineTo(4.2219f, 11.7782f)
                lineTo(12.0001f, 4.0f)
                lineTo(19.7783f, 11.7782f)
                lineTo(18.3641f, 13.1924f)
                lineTo(13.0001f, 7.8284f)
                close()
            }
        }
        .build()
        return `_arrow-up-line`!!
    }

private var `_arrow-up-line`: ImageVector? = null
