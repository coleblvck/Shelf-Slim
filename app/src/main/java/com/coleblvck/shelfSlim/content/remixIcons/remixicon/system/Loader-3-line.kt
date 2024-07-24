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

public val SystemGroup.`Loader-3-line`: ImageVector
    get() {
        if (`_loader-3-line` != null) {
            return `_loader-3-line`!!
        }
        `_loader-3-line` = Builder(name = "Loader-3-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0547f, 13.0f)
                horizontalLineTo(5.0707f)
                curveTo(5.5559f, 16.3923f, 8.4733f, 19.0f, 11.9998f, 19.0f)
                curveTo(15.5262f, 19.0f, 18.4436f, 16.3923f, 18.9289f, 13.0f)
                horizontalLineTo(20.9448f)
                curveTo(20.4474f, 17.5f, 16.6323f, 21.0f, 11.9998f, 21.0f)
                curveTo(7.3672f, 21.0f, 3.5521f, 17.5f, 3.0547f, 13.0f)
                close()
                moveTo(3.0547f, 11.0f)
                curveTo(3.5521f, 6.5001f, 7.3672f, 3.0f, 11.9998f, 3.0f)
                curveTo(16.6323f, 3.0f, 20.4474f, 6.5001f, 20.9448f, 11.0f)
                horizontalLineTo(18.9289f)
                curveTo(18.4436f, 7.6077f, 15.5262f, 5.0f, 11.9998f, 5.0f)
                curveTo(8.4733f, 5.0f, 5.5559f, 7.6077f, 5.0707f, 11.0f)
                horizontalLineTo(3.0547f)
                close()
            }
        }
        .build()
        return `_loader-3-line`!!
    }

private var `_loader-3-line`: ImageVector? = null
