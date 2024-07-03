package com.coleblvck.shelf.ui.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Code-s-slash-line`: ImageVector
    get() {
        if (`_code-s-slash-line` != null) {
            return `_code-s-slash-line`!!
        }
        `_code-s-slash-line` = Builder(name = "Code-s-slash-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                lineTo(18.3431f, 17.6569f)
                lineTo(16.9289f, 16.2426f)
                lineTo(21.1716f, 12.0f)
                lineTo(16.9289f, 7.7574f)
                lineTo(18.3431f, 6.3432f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(2.8284f, 12.0f)
                lineTo(7.0711f, 16.2426f)
                lineTo(5.6568f, 17.6569f)
                lineTo(0.0f, 12.0f)
                lineTo(5.6568f, 6.3432f)
                lineTo(7.0711f, 7.7574f)
                lineTo(2.8284f, 12.0f)
                close()
                moveTo(9.7885f, 21.0f)
                horizontalLineTo(7.6601f)
                lineTo(14.2116f, 3.0f)
                horizontalLineTo(16.3399f)
                lineTo(9.7885f, 21.0f)
                close()
            }
        }
        .build()
        return `_code-s-slash-line`!!
    }

private var `_code-s-slash-line`: ImageVector? = null
