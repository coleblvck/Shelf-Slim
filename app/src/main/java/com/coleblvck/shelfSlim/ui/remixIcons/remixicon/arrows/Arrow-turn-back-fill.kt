package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-turn-back-fill`: ImageVector
    get() {
        if (`_arrow-turn-back-fill` != null) {
            return `_arrow-turn-back-fill`!!
        }
        `_arrow-turn-back-fill` = Builder(name = "Arrow-turn-back-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                horizontalLineTo(13.0f)
                lineTo(18.0f, 22.0f)
                lineTo(23.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 6.5817f, 15.4183f, 3.0f, 11.0f, 3.0f)
                curveTo(6.5817f, 3.0f, 3.0f, 6.5817f, 3.0f, 11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 7.6863f, 7.6863f, 5.0f, 11.0f, 5.0f)
                curveTo(14.3137f, 5.0f, 17.0f, 7.6863f, 17.0f, 11.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_arrow-turn-back-fill`!!
    }

private var `_arrow-turn-back-fill`: ImageVector? = null
