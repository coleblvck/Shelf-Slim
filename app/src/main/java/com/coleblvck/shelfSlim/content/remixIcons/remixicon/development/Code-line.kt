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

public val DevelopmentGroup.`Code-line`: ImageVector
    get() {
        if (`_code-line` != null) {
            return `_code-line`!!
        }
        `_code-line` = Builder(name = "Code-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(15.9289f, 19.0711f)
                lineTo(14.5147f, 17.6569f)
                lineTo(20.1716f, 12.0f)
                lineTo(14.5147f, 6.3432f)
                lineTo(15.9289f, 4.929f)
                lineTo(23.0f, 12.0f)
                close()
                moveTo(3.8284f, 12.0f)
                lineTo(9.4853f, 17.6569f)
                lineTo(8.0711f, 19.0711f)
                lineTo(1.0f, 12.0f)
                lineTo(8.0711f, 4.929f)
                lineTo(9.4853f, 6.3432f)
                lineTo(3.8284f, 12.0f)
                close()
            }
        }
        .build()
        return `_code-line`!!
    }

private var `_code-line`: ImageVector? = null
