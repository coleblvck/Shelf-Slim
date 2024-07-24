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

public val LogosGroup.`Facebook-line`: ImageVector
    get() {
        if (`_facebook-line` != null) {
            return `_facebook-line`!!
        }
        `_facebook-line` = Builder(name = "Facebook-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(17.5f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.1278f)
                curveTo(11.0f, 5.3447f, 11.1857f, 4.6982f, 11.5343f, 4.0463f)
                curveTo(11.8829f, 3.3945f, 12.3945f, 2.8829f, 13.0463f, 2.5343f)
                curveTo(13.6982f, 2.1857f, 14.3447f, 2.0f, 16.1278f, 2.0f)
                curveTo(16.6498f, 2.0f, 17.1072f, 2.05f, 17.5f, 2.15f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.1278f)
                curveTo(14.8041f, 4.0f, 14.401f, 4.0778f, 13.9895f, 4.2979f)
                curveTo(13.6862f, 4.4601f, 13.4601f, 4.6862f, 13.2979f, 4.9895f)
                curveTo(13.0778f, 5.401f, 13.0f, 5.8041f, 13.0f, 7.1278f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_facebook-line`!!
    }

private var `_facebook-line`: ImageVector? = null
