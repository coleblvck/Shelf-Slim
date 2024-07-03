package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Information-2-line`: ImageVector
    get() {
        if (`_information-2-line` != null) {
            return `_information-2-line`!!
        }
        `_information-2-line` = Builder(name = "Information-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(13.0f, 10.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.5f, 8.0f)
                curveTo(13.5f, 8.8284f, 12.8284f, 9.5f, 12.0f, 9.5f)
                curveTo(11.1716f, 9.5f, 10.5f, 8.8284f, 10.5f, 8.0f)
                curveTo(10.5f, 7.1716f, 11.1716f, 6.5f, 12.0f, 6.5f)
                curveTo(12.8284f, 6.5f, 13.5f, 7.1716f, 13.5f, 8.0f)
                close()
            }
        }
        .build()
        return `_information-2-line`!!
    }

private var `_information-2-line`: ImageVector? = null
