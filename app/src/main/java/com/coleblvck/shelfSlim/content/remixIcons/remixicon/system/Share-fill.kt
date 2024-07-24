package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Share-fill`: ImageVector
    get() {
        if (`_share-fill` != null) {
            return `_share-fill`!!
        }
        `_share-fill` = Builder(name = "Share-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5759f, 17.2714f)
                lineTo(8.4658f, 14.484f)
                curveTo(7.8331f, 15.112f, 6.9619f, 15.5f, 6.0f, 15.5f)
                curveTo(4.067f, 15.5f, 2.5f, 13.933f, 2.5f, 12.0f)
                curveTo(2.5f, 10.067f, 4.067f, 8.5f, 6.0f, 8.5f)
                curveTo(6.9618f, 8.5f, 7.833f, 8.888f, 8.4656f, 9.5159f)
                lineTo(13.5759f, 6.7285f)
                curveTo(13.5262f, 6.4935f, 13.5f, 6.2498f, 13.5f, 6.0f)
                curveTo(13.5f, 4.067f, 15.067f, 2.5f, 17.0f, 2.5f)
                curveTo(18.933f, 2.5f, 20.5f, 4.067f, 20.5f, 6.0f)
                curveTo(20.5f, 7.933f, 18.933f, 9.5f, 17.0f, 9.5f)
                curveTo(16.0381f, 9.5f, 15.1669f, 9.112f, 14.5343f, 8.484f)
                lineTo(9.424f, 11.2713f)
                curveTo(9.4738f, 11.5064f, 9.5f, 11.7501f, 9.5f, 12.0f)
                curveTo(9.5f, 12.2498f, 9.4738f, 12.4935f, 9.4241f, 12.7285f)
                lineTo(14.5343f, 15.516f)
                curveTo(15.167f, 14.888f, 16.0382f, 14.5f, 17.0f, 14.5f)
                curveTo(18.933f, 14.5f, 20.5f, 16.067f, 20.5f, 18.0f)
                curveTo(20.5f, 19.933f, 18.933f, 21.5f, 17.0f, 21.5f)
                curveTo(15.067f, 21.5f, 13.5f, 19.933f, 13.5f, 18.0f)
                curveTo(13.5f, 17.7502f, 13.5262f, 17.5064f, 13.5759f, 17.2714f)
                close()
            }
        }
        .build()
        return `_share-fill`!!
    }

private var `_share-fill`: ImageVector? = null
