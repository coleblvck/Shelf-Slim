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

public val DevelopmentGroup.`Html5-line`: ImageVector
    get() {
        if (`_html5-line` != null) {
            return `_html5-line`!!
        }
        `_html5-line` = Builder(name = "Html5-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.1778f)
                lineTo(7.3808f, 16.9222f)
                lineTo(7.0517f, 13.3778f)
                horizontalLineTo(9.3216f)
                lineTo(9.4804f, 15.2222f)
                lineTo(12.0f, 15.8889f)
                lineTo(14.5195f, 15.2222f)
                lineTo(14.7806f, 12.3556f)
                horizontalLineTo(6.9609f)
                lineTo(6.3253f, 5.6778f)
                horizontalLineTo(17.6747f)
                lineTo(17.4477f, 7.8889f)
                horizontalLineTo(8.8222f)
                lineTo(9.0265f, 10.1444f)
                horizontalLineTo(17.2434f)
                lineTo(16.6192f, 16.9222f)
                lineTo(12.0f, 18.1778f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                lineTo(19.377f, 20.0f)
                lineTo(12.0f, 22.0f)
                lineTo(4.623f, 20.0f)
                lineTo(3.0f, 2.0f)
                close()
                moveTo(5.1884f, 4.0f)
                lineTo(6.4899f, 18.4339f)
                lineTo(12.0f, 19.9278f)
                lineTo(17.5101f, 18.4339f)
                lineTo(18.8116f, 4.0f)
                horizontalLineTo(5.1884f)
                close()
            }
        }
        .build()
        return `_html5-line`!!
    }

private var `_html5-line`: ImageVector? = null
