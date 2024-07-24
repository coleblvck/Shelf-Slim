package com.coleblvck.shelfSlim.content.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Cursor-line`: ImageVector
    get() {
        if (`_cursor-line` != null) {
            return `_cursor-line`!!
        }
        `_cursor-line` = Builder(name = "Cursor-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3873f, 13.4975f)
                lineTo(17.9403f, 20.5117f)
                lineTo(13.2418f, 22.2218f)
                lineTo(10.6889f, 15.2076f)
                lineTo(6.79f, 17.6529f)
                lineTo(8.4086f, 1.6332f)
                lineTo(19.9457f, 12.8646f)
                lineTo(15.3873f, 13.4975f)
                close()
                moveTo(15.3768f, 19.3163f)
                lineTo(12.6618f, 11.8568f)
                lineTo(15.6212f, 11.4459f)
                lineTo(9.982f, 5.9561f)
                lineTo(9.1909f, 13.7863f)
                lineTo(11.7221f, 12.1988f)
                lineTo(14.4371f, 19.6583f)
                lineTo(15.3768f, 19.3163f)
                close()
            }
        }
        .build()
        return `_cursor-line`!!
    }

private var `_cursor-line`: ImageVector? = null
