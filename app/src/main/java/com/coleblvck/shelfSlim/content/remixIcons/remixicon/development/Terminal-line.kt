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

public val DevelopmentGroup.`Terminal-line`: ImageVector
    get() {
        if (`_terminal-line` != null) {
            return `_terminal-line`!!
        }
        `_terminal-line` = Builder(name = "Terminal-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9999f, 12.0f)
                lineTo(3.9289f, 19.0711f)
                lineTo(2.5147f, 17.6569f)
                lineTo(8.1715f, 12.0f)
                lineTo(2.5147f, 6.3432f)
                lineTo(3.9289f, 4.929f)
                lineTo(10.9999f, 12.0f)
                close()
                moveTo(10.9999f, 19.0f)
                horizontalLineTo(20.9999f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.9999f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_terminal-line`!!
    }

private var `_terminal-line`: ImageVector? = null
