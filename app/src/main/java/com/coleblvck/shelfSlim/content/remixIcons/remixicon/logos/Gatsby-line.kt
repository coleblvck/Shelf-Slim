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

public val LogosGroup.`Gatsby-line`: ImageVector
    get() {
        if (`_gatsby-line` != null) {
            return `_gatsby-line`!!
        }
        `_gatsby-line` = Builder(name = "Gatsby-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7519f, 21.997f)
                curveTo(6.5306f, 21.8694f, 2.3017f, 17.7397f, 2.0163f, 12.559f)
                lineTo(2.0039f, 12.246f)
                lineTo(11.7519f, 21.997f)
                close()
                moveTo(12.0009f, 2.0f)
                curveTo(15.39f, 2.0f, 18.3854f, 3.686f, 20.194f, 6.2649f)
                lineTo(18.556f, 7.4129f)
                curveTo(17.1092f, 5.3492f, 14.7126f, 4.0f, 12.0009f, 4.0f)
                curveTo(8.5978f, 4.0f, 5.6911f, 6.1248f, 4.5349f, 9.1202f)
                lineTo(14.8807f, 19.466f)
                curveTo(17.2681f, 18.5445f, 19.1025f, 16.5109f, 19.7488f, 14.0004f)
                lineTo(15.5009f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0009f)
                curveTo(22.0009f, 16.7261f, 18.7223f, 20.6865f, 14.3155f, 21.7308f)
                lineTo(2.2701f, 9.6854f)
                curveTo(3.3144f, 5.2786f, 7.2748f, 2.0f, 12.0009f, 2.0f)
                close()
            }
        }
        .build()
        return `_gatsby-line`!!
    }

private var `_gatsby-line`: ImageVector? = null
