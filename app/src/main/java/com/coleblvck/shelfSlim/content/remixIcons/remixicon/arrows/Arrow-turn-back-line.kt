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

public val ArrowsGroup.`Arrow-turn-back-line`: ImageVector
    get() {
        if (`_arrow-turn-back-line` != null) {
            return `_arrow-turn-back-line`!!
        }
        `_arrow-turn-back-line` = Builder(name = "Arrow-turn-back-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0004f, 18.1716f)
                lineTo(14.4649f, 15.636f)
                lineTo(13.0507f, 17.0503f)
                lineTo(18.0004f, 22.0f)
                lineTo(22.9502f, 17.0503f)
                lineTo(21.536f, 15.636f)
                lineTo(19.0004f, 18.1716f)
                verticalLineTo(11.0f)
                curveTo(19.0004f, 6.5817f, 15.4187f, 3.0f, 11.0004f, 3.0f)
                curveTo(6.5822f, 3.0f, 3.0004f, 6.5817f, 3.0004f, 11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0004f)
                verticalLineTo(11.0f)
                curveTo(5.0004f, 7.6863f, 7.6867f, 5.0f, 11.0004f, 5.0f)
                curveTo(14.3142f, 5.0f, 17.0004f, 7.6863f, 17.0004f, 11.0f)
                verticalLineTo(18.1716f)
                close()
            }
        }
        .build()
        return `_arrow-turn-back-line`!!
    }

private var `_arrow-turn-back-line`: ImageVector? = null
