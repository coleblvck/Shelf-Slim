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

public val LogosGroup.`Microsoft-loop-fill`: ImageVector
    get() {
        if (`_microsoft-loop-fill` != null) {
            return `_microsoft-loop-fill`!!
        }
        `_microsoft-loop-fill` = Builder(name = "Microsoft-loop-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(6.6647f)
                curveTo(8.6846f, 20.5479f, 10.0f, 18.1776f, 10.0f, 15.5f)
                horizontalLineTo(12.0f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12.0f)
                curveTo(15.5f, 10.067f, 13.933f, 8.5f, 12.0f, 8.5f)
                curveTo(10.067f, 8.5f, 8.5f, 10.067f, 8.5f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(8.5f, 19.0899f, 5.5898f, 22.0f, 2.0f, 22.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_microsoft-loop-fill`!!
    }

private var `_microsoft-loop-fill`: ImageVector? = null
