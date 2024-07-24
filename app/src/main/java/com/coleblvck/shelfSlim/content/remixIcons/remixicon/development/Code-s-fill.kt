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

public val DevelopmentGroup.`Code-s-fill`: ImageVector
    get() {
        if (`_code-s-fill` != null) {
            return `_code-s-fill`!!
        }
        `_code-s-fill` = Builder(name = "Code-s-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                lineTo(18.3431f, 17.6568f)
                lineTo(16.9289f, 16.2426f)
                lineTo(21.1716f, 12.0f)
                lineTo(16.9289f, 7.7573f)
                lineTo(18.3431f, 6.3431f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(2.8284f, 12.0f)
                lineTo(7.0711f, 16.2426f)
                lineTo(5.6568f, 17.6568f)
                lineTo(0.0f, 12.0f)
                lineTo(5.6568f, 6.3431f)
                lineTo(7.0711f, 7.7573f)
                lineTo(2.8284f, 12.0f)
                close()
            }
        }
        .build()
        return `_code-s-fill`!!
    }

private var `_code-s-fill`: ImageVector? = null
