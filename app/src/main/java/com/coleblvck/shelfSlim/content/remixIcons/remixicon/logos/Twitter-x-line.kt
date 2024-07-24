package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Twitter-x-line`: ImageVector
    get() {
        if (`_twitter-x-line` != null) {
            return `_twitter-x-line`!!
        }
        `_twitter-x-line` = Builder(name = "Twitter-x-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                horizontalLineTo(1.0f)
                lineTo(9.2609f, 13.0145f)
                lineTo(1.4499f, 21.9999f)
                horizontalLineTo(4.1f)
                lineTo(10.4883f, 14.651f)
                lineTo(16.0f, 22.0f)
                horizontalLineTo(23.0f)
                lineTo(14.3917f, 10.5223f)
                lineTo(21.8001f, 2.0f)
                horizontalLineTo(19.1501f)
                lineTo(13.1643f, 8.8858f)
                lineTo(8.0f, 2.0f)
                close()
                moveTo(17.0f, 20.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineTo(7.0f)
                lineTo(19.0f, 20.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_twitter-x-line`!!
    }

private var `_twitter-x-line`: ImageVector? = null
