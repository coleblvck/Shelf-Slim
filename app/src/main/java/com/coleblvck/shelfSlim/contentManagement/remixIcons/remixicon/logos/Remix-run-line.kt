package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Remix-run-line`: ImageVector
    get() {
        if (`_remix-run-line` != null) {
            return `_remix-run-line`!!
        }
        `_remix-run-line` = Builder(name = "Remix-run-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(17.8137f, 2.0f, 20.5f, 4.6863f, 20.5f, 8.0f)
                curveTo(20.5f, 10.1984f, 19.3177f, 12.1206f, 17.5543f, 13.1655f)
                curveTo(19.0376f, 14.2579f, 20.0f, 16.0166f, 20.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 15.7909f, 16.2091f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.5f)
                curveTo(16.7091f, 12.0f, 18.5f, 10.2091f, 18.5f, 8.0f)
                curveTo(18.5f, 5.7909f, 16.7091f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.0f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_remix-run-line`!!
    }

private var `_remix-run-line`: ImageVector? = null
