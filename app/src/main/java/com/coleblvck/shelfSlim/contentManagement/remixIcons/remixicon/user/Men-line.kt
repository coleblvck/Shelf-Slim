package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.UserGroup

public val UserGroup.`Men-line`: ImageVector
    get() {
        if (`_men-line` != null) {
            return `_men-line`!!
        }
        `_men-line` = Builder(name = "Men-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0491f, 8.5367f)
                lineTo(18.5858f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.4142f)
                lineTo(16.4633f, 9.9509f)
                curveTo(17.4274f, 11.2127f, 18.0f, 12.7895f, 18.0f, 14.5f)
                curveTo(18.0f, 18.6421f, 14.6421f, 22.0f, 10.5f, 22.0f)
                curveTo(6.3579f, 22.0f, 3.0f, 18.6421f, 3.0f, 14.5f)
                curveTo(3.0f, 10.3579f, 6.3579f, 7.0f, 10.5f, 7.0f)
                curveTo(12.2105f, 7.0f, 13.7873f, 7.5726f, 15.0491f, 8.5367f)
                close()
                moveTo(10.5f, 20.0f)
                curveTo(13.5376f, 20.0f, 16.0f, 17.5376f, 16.0f, 14.5f)
                curveTo(16.0f, 11.4624f, 13.5376f, 9.0f, 10.5f, 9.0f)
                curveTo(7.4624f, 9.0f, 5.0f, 11.4624f, 5.0f, 14.5f)
                curveTo(5.0f, 17.5376f, 7.4624f, 20.0f, 10.5f, 20.0f)
                close()
            }
        }
        .build()
        return `_men-line`!!
    }

private var `_men-line`: ImageVector? = null
