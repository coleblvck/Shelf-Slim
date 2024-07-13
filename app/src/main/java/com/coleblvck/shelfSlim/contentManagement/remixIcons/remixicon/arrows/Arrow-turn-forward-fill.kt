package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-turn-forward-fill`: ImageVector
    get() {
        if (`_arrow-turn-forward-fill` != null) {
            return `_arrow-turn-forward-fill`!!
        }
        `_arrow-turn-forward-fill` = Builder(name = "Arrow-turn-forward-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 16.3137f, 14.3137f, 19.0f, 11.0f, 19.0f)
                curveTo(7.6863f, 19.0f, 5.0f, 16.3137f, 5.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 17.4183f, 6.5817f, 21.0f, 11.0f, 21.0f)
                curveTo(15.4183f, 21.0f, 19.0f, 17.4183f, 19.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(23.0f)
                lineTo(18.0f, 2.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_arrow-turn-forward-fill`!!
    }

private var `_arrow-turn-forward-fill`: ImageVector? = null
