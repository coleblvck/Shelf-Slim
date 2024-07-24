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

public val LogosGroup.`Tumblr-line`: ImageVector
    get() {
        if (`_tumblr-line` != null) {
            return `_tumblr-line`!!
        }
        `_tumblr-line` = Builder(name = "Tumblr-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.001f, 8.0f)
                curveTo(9.0761f, 8.0f, 11.4983f, 7.3267f, 11.4983f, 3.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.9982f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.9982f)
                verticalLineTo(12.9091f)
                curveTo(13.0013f, 15.3906f, 13.0013f, 16.596f, 13.001f, 17.0f)
                curveTo(12.9992f, 19.2084f, 14.6163f, 20.4f, 17.7861f, 20.4f)
                verticalLineTo(22.0f)
                curveTo(17.1509f, 21.9992f, 16.4034f, 21.9992f, 15.5437f, 22.0f)
                curveTo(13.1417f, 22.0023f, 10.9982f, 19.9649f, 10.9982f, 17.4545f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.001f)
                close()
            }
        }
        .build()
        return `_tumblr-line`!!
    }

private var `_tumblr-line`: ImageVector? = null
