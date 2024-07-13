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

public val ArrowsGroup.`Arrow-turn-forward-line`: ImageVector
    get() {
        if (`_arrow-turn-forward-line` != null) {
            return `_arrow-turn-forward-line`!!
        }
        `_arrow-turn-forward-line` = Builder(name = "Arrow-turn-forward-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0005f, 5.8284f)
                verticalLineTo(13.0f)
                curveTo(17.0005f, 16.3137f, 14.3142f, 19.0f, 11.0005f, 19.0f)
                curveTo(7.6867f, 19.0f, 5.0005f, 16.3137f, 5.0005f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0004f)
                verticalLineTo(13.0f)
                curveTo(3.0004f, 17.4183f, 6.5822f, 21.0f, 11.0005f, 21.0f)
                curveTo(15.4187f, 21.0f, 19.0005f, 17.4183f, 19.0005f, 13.0f)
                verticalLineTo(5.8284f)
                lineTo(21.536f, 8.364f)
                lineTo(22.9502f, 6.9497f)
                lineTo(18.0005f, 2.0f)
                lineTo(13.0507f, 6.9497f)
                lineTo(14.4649f, 8.364f)
                lineTo(17.0005f, 5.8284f)
                close()
            }
        }
        .build()
        return `_arrow-turn-forward-line`!!
    }

private var `_arrow-turn-forward-line`: ImageVector? = null
