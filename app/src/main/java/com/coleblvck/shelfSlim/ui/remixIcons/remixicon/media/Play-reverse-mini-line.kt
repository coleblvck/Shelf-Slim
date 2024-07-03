package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Play-reverse-mini-line`: ImageVector
    get() {
        if (`_play-reverse-mini-line` != null) {
            return `_play-reverse-mini-line`!!
        }
        `_play-reverse-mini-line` = Builder(name = "Play-reverse-mini-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.4822f)
                verticalLineTo(15.518f)
                lineTo(8.9692f, 12.0001f)
                lineTo(15.0f, 8.4822f)
                close()
                moveTo(16.248f, 5.4387f)
                lineTo(5.7403f, 11.5682f)
                curveTo(5.5018f, 11.7073f, 5.4212f, 12.0135f, 5.5604f, 12.252f)
                curveTo(5.6038f, 12.3265f, 5.6658f, 12.3885f, 5.7403f, 12.432f)
                lineTo(16.248f, 18.5615f)
                curveTo(16.4865f, 18.7006f, 16.7927f, 18.62f, 16.9318f, 18.3815f)
                curveTo(16.9764f, 18.305f, 17.0f, 18.2181f, 17.0f, 18.1296f)
                verticalLineTo(5.8706f)
                curveTo(17.0f, 5.5945f, 16.7761f, 5.3706f, 16.5f, 5.3706f)
                curveTo(16.4114f, 5.3706f, 16.3245f, 5.3941f, 16.248f, 5.4387f)
                close()
            }
        }
        .build()
        return `_play-reverse-mini-line`!!
    }

private var `_play-reverse-mini-line`: ImageVector? = null
