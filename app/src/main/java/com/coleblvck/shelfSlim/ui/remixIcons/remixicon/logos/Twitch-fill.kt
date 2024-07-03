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

public val LogosGroup.`Twitch-fill`: ImageVector
    get() {
        if (`_twitch-fill` != null) {
            return `_twitch-fill`!!
        }
        `_twitch-fill` = Builder(name = "Twitch-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.001f, 3.0f)
                verticalLineTo(14.7391f)
                lineTo(16.3053f, 19.4348f)
                horizontalLineTo(12.3923f)
                lineTo(9.9552f, 21.7826f)
                horizontalLineTo(6.914f)
                verticalLineTo(19.4348f)
                horizontalLineTo(3.001f)
                verticalLineTo(6.1304f)
                lineTo(4.2281f, 3.0f)
                horizontalLineTo(21.001f)
                close()
                moveTo(19.4358f, 4.5652f)
                horizontalLineTo(6.1314f)
                verticalLineTo(16.3043f)
                horizontalLineTo(9.2619f)
                verticalLineTo(18.6522f)
                lineTo(11.6097f, 16.3043f)
                horizontalLineTo(16.3053f)
                lineTo(19.4358f, 13.1739f)
                verticalLineTo(4.5652f)
                close()
                moveTo(16.3053f, 7.6957f)
                verticalLineTo(12.3913f)
                horizontalLineTo(14.7401f)
                verticalLineTo(7.6957f)
                horizontalLineTo(16.3053f)
                close()
                moveTo(12.3923f, 7.6957f)
                verticalLineTo(12.3913f)
                horizontalLineTo(10.8271f)
                verticalLineTo(7.6957f)
                horizontalLineTo(12.3923f)
                close()
            }
        }
        .build()
        return `_twitch-fill`!!
    }

private var `_twitch-fill`: ImageVector? = null
