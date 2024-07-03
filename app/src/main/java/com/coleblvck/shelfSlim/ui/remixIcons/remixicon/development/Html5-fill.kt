package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Html5-fill`: ImageVector
    get() {
        if (`_html5-fill` != null) {
            return `_html5-fill`!!
        }
        `_html5-fill` = Builder(name = "Html5-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.1778f)
                lineTo(16.6192f, 16.9222f)
                lineTo(17.2434f, 10.1444f)
                horizontalLineTo(9.0265f)
                lineTo(8.8222f, 7.8889f)
                horizontalLineTo(17.4477f)
                lineTo(17.6747f, 5.6778f)
                horizontalLineTo(6.3253f)
                lineTo(6.9609f, 12.3556f)
                horizontalLineTo(14.7806f)
                lineTo(14.5195f, 15.2222f)
                lineTo(12.0f, 15.8889f)
                lineTo(9.4804f, 15.2222f)
                lineTo(9.3216f, 13.3778f)
                horizontalLineTo(7.0517f)
                lineTo(7.3808f, 16.9222f)
                lineTo(12.0f, 18.1778f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                lineTo(19.377f, 20.0f)
                lineTo(12.0f, 22.0f)
                lineTo(4.623f, 20.0f)
                lineTo(3.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_html5-fill`!!
    }

private var `_html5-fill`: ImageVector? = null
