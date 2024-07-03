package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Gatsby-fill`: ImageVector
    get() {
        if (`_gatsby-fill` != null) {
            return `_gatsby-fill`!!
        }
        `_gatsby-fill` = Builder(name = "Gatsby-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(6.501f, 2.0f, 2.001f, 6.5f, 2.001f, 12.0f)
                curveTo(2.001f, 17.5f, 6.501f, 22.0f, 12.001f, 22.0f)
                curveTo(17.501f, 22.0f, 22.001f, 17.5f, 22.001f, 12.0f)
                curveTo(22.001f, 6.5f, 17.501f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(6.4296f, 17.5714f)
                curveTo(4.9296f, 16.0714f, 4.1438f, 14.0714f, 4.1438f, 12.1429f)
                lineTo(11.9297f, 19.8571f)
                curveTo(9.9297f, 19.7857f, 7.9297f, 19.0714f, 6.4296f, 17.5714f)
                close()
                moveTo(13.7151f, 19.6429f)
                lineTo(4.3581f, 10.2857f)
                curveTo(5.1438f, 6.7857f, 8.2868f, 4.1429f, 12.001f, 4.1429f)
                curveTo(14.6439f, 4.1429f, 16.9297f, 5.4286f, 18.3581f, 7.3571f)
                lineTo(17.2868f, 8.2857f)
                curveTo(16.0722f, 6.6429f, 14.1439f, 5.5714f, 12.001f, 5.5714f)
                curveTo(9.2151f, 5.5714f, 6.8581f, 7.3571f, 5.9296f, 9.8571f)
                lineTo(14.1439f, 18.0714f)
                curveTo(16.2151f, 17.3571f, 17.7868f, 15.5714f, 18.2868f, 13.4286f)
                horizontalLineTo(14.8581f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.8581f)
                curveTo(19.8581f, 15.7143f, 17.2151f, 18.8571f, 13.7151f, 19.6429f)
                close()
            }
        }
        .build()
        return `_gatsby-fill`!!
    }

private var `_gatsby-fill`: ImageVector? = null
