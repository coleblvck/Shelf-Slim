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

public val SystemGroup.`Information-2-fill`: ImageVector
    get() {
        if (`_information-2-fill` != null) {
            return `_information-2-fill`!!
        }
        `_information-2-fill` = Builder(name = "Information-2-fill", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 9.5f)
                curveTo(12.8284f, 9.5f, 13.5f, 8.8284f, 13.5f, 8.0f)
                curveTo(13.5f, 7.1716f, 12.8284f, 6.5f, 12.0f, 6.5f)
                curveTo(11.1716f, 6.5f, 10.5f, 7.1716f, 10.5f, 8.0f)
                curveTo(10.5f, 8.8284f, 11.1716f, 9.5f, 12.0f, 9.5f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_information-2-fill`!!
    }

private var `_information-2-fill`: ImageVector? = null
