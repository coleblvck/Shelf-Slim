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

public val MediaGroup.`Skip-back-mini-line`: ImageVector
    get() {
        if (`_skip-back-mini-line` != null) {
            return `_skip-back-mini-line`!!
        }
        `_skip-back-mini-line` = Builder(name = "Skip-back-mini-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveTo(7.5523f, 6.0f, 8.0f, 6.4477f, 8.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(8.0f, 17.5523f, 7.5523f, 18.0f, 7.0f, 18.0f)
                curveTo(6.4477f, 18.0f, 6.0f, 17.5523f, 6.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 6.4477f, 6.4477f, 6.0f, 7.0f, 6.0f)
                close()
                moveTo(15.0f, 14.1402f)
                verticalLineTo(9.8598f)
                lineTo(11.9681f, 12.0f)
                lineTo(15.0f, 14.1402f)
                close()
                moveTo(9.0787f, 12.4085f)
                curveTo(9.0321f, 12.3756f, 8.9914f, 12.3349f, 8.9585f, 12.2883f)
                curveTo(8.7993f, 12.0627f, 8.8531f, 11.7508f, 9.0787f, 11.5915f)
                lineTo(16.2117f, 6.5565f)
                curveTo(16.296f, 6.4969f, 16.3967f, 6.465f, 16.5f, 6.465f)
                curveTo(16.7761f, 6.465f, 17.0f, 6.6888f, 17.0f, 6.965f)
                verticalLineTo(17.035f)
                curveTo(17.0f, 17.1383f, 16.968f, 17.239f, 16.9085f, 17.3234f)
                curveTo(16.7492f, 17.549f, 16.4373f, 17.6028f, 16.2117f, 17.4435f)
                lineTo(9.0787f, 12.4085f)
                close()
            }
        }
        .build()
        return `_skip-back-mini-line`!!
    }

private var `_skip-back-mini-line`: ImageVector? = null
