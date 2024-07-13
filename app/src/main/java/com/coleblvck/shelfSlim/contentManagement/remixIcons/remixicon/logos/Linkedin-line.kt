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

public val LogosGroup.`Linkedin-line`: ImageVector
    get() {
        if (`_linkedin-line` != null) {
            return `_linkedin-line`!!
        }
        `_linkedin-line` = Builder(name = "Linkedin-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 9.55f)
                curveTo(12.9181f, 8.6133f, 14.1121f, 8.0f, 15.501f, 8.0f)
                curveTo(18.5385f, 8.0f, 21.001f, 10.4624f, 21.001f, 13.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(13.5f)
                curveTo(19.001f, 11.567f, 17.434f, 10.0f, 15.501f, 10.0f)
                curveTo(13.568f, 10.0f, 12.001f, 11.567f, 12.001f, 13.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.001f)
                verticalLineTo(8.5f)
                horizontalLineTo(12.001f)
                verticalLineTo(9.55f)
                close()
                moveTo(5.001f, 6.5f)
                curveTo(4.1726f, 6.5f, 3.501f, 5.8284f, 3.501f, 5.0f)
                curveTo(3.501f, 4.1716f, 4.1726f, 3.5f, 5.001f, 3.5f)
                curveTo(5.8294f, 3.5f, 6.501f, 4.1716f, 6.501f, 5.0f)
                curveTo(6.501f, 5.8284f, 5.8294f, 6.5f, 5.001f, 6.5f)
                close()
                moveTo(4.001f, 8.5f)
                horizontalLineTo(6.001f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.001f)
                verticalLineTo(8.5f)
                close()
            }
        }
        .build()
        return `_linkedin-line`!!
    }

private var `_linkedin-line`: ImageVector? = null
