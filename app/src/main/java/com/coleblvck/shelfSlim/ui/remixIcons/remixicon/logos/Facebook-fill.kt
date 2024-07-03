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

public val LogosGroup.`Facebook-fill`: ImageVector
    get() {
        if (`_facebook-fill` != null) {
            return `_facebook-fill`!!
        }
        `_facebook-fill` = Builder(name = "Facebook-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.5f)
                horizontalLineTo(16.5f)
                lineTo(17.5f, 9.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                curveTo(14.0f, 6.4706f, 14.0f, 5.5f, 16.0f, 5.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(2.1401f)
                curveTo(17.1743f, 2.0968f, 15.943f, 2.0f, 14.6429f, 2.0f)
                curveTo(11.9284f, 2.0f, 10.0f, 3.6569f, 10.0f, 6.6997f)
                verticalLineTo(9.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return `_facebook-fill`!!
    }

private var `_facebook-fill`: ImageVector? = null
