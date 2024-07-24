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

public val LogosGroup.`Switch-line`: ImageVector
    get() {
        if (`_switch-line` != null) {
            return `_switch-line`!!
        }
        `_switch-line` = Builder(name = "Switch-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.601f)
                curveTo(5.0605f, 21.0f, 3.001f, 18.9405f, 3.001f, 16.4f)
                verticalLineTo(7.6f)
                curveTo(3.001f, 5.0595f, 5.0605f, 3.0f, 7.601f, 3.0f)
                horizontalLineTo(12.001f)
                close()
                moveTo(10.001f, 5.0f)
                horizontalLineTo(7.601f)
                curveTo(6.165f, 5.0f, 5.001f, 6.1641f, 5.001f, 7.6f)
                verticalLineTo(16.4f)
                curveTo(5.001f, 17.8359f, 6.165f, 19.0f, 7.601f, 19.0f)
                horizontalLineTo(10.001f)
                verticalLineTo(5.0f)
                close()
                moveTo(7.501f, 10.0f)
                curveTo(6.6726f, 10.0f, 6.001f, 9.3284f, 6.001f, 8.5f)
                curveTo(6.001f, 7.6716f, 6.6726f, 7.0f, 7.501f, 7.0f)
                curveTo(8.3294f, 7.0f, 9.001f, 7.6716f, 9.001f, 8.5f)
                curveTo(9.001f, 9.3284f, 8.3294f, 10.0f, 7.501f, 10.0f)
                close()
                moveTo(14.001f, 3.0f)
                horizontalLineTo(16.401f)
                curveTo(18.9415f, 3.0f, 21.001f, 5.0595f, 21.001f, 7.6f)
                verticalLineTo(16.4f)
                curveTo(21.001f, 18.9405f, 18.9415f, 21.0f, 16.401f, 21.0f)
                horizontalLineTo(14.001f)
                verticalLineTo(3.0f)
                close()
                moveTo(17.001f, 14.7f)
                curveTo(17.9951f, 14.7f, 18.801f, 13.8941f, 18.801f, 12.9f)
                curveTo(18.801f, 11.9059f, 17.9951f, 11.1f, 17.001f, 11.1f)
                curveTo(16.0069f, 11.1f, 15.201f, 11.9059f, 15.201f, 12.9f)
                curveTo(15.201f, 13.8941f, 16.0069f, 14.7f, 17.001f, 14.7f)
                close()
            }
        }
        .build()
        return `_switch-line`!!
    }

private var `_switch-line`: ImageVector? = null
