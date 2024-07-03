package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Play-mini-line`: ImageVector
    get() {
        if (`_play-mini-line` != null) {
            return `_play-mini-line`!!
        }
        `_play-mini-line` = Builder(name = "Play-mini-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.4822f)
                verticalLineTo(15.518f)
                lineTo(15.0307f, 12.0001f)
                lineTo(9.0f, 8.4822f)
                close()
                moveTo(7.7519f, 5.4387f)
                lineTo(18.2596f, 11.5682f)
                curveTo(18.4981f, 11.7073f, 18.5787f, 12.0135f, 18.4396f, 12.252f)
                curveTo(18.3961f, 12.3265f, 18.3341f, 12.3885f, 18.2596f, 12.432f)
                lineTo(7.7519f, 18.5615f)
                curveTo(7.5134f, 18.7006f, 7.2073f, 18.62f, 7.0681f, 18.3815f)
                curveTo(7.0235f, 18.305f, 7.0f, 18.2181f, 7.0f, 18.1296f)
                verticalLineTo(5.8706f)
                curveTo(7.0f, 5.5945f, 7.2239f, 5.3706f, 7.5f, 5.3706f)
                curveTo(7.5885f, 5.3706f, 7.6755f, 5.3941f, 7.7519f, 5.4387f)
                close()
            }
        }
        .build()
        return `_play-mini-line`!!
    }

private var `_play-mini-line`: ImageVector? = null
