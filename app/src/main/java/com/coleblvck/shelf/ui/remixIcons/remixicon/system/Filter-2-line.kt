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

public val SystemGroup.`Filter-2-line`: ImageVector
    get() {
        if (`_filter-2-line` != null) {
            return `_filter-2-line`!!
        }
        `_filter-2-line` = Builder(name = "Filter-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                verticalLineTo(20.0f)
                lineTo(10.0f, 22.0f)
                verticalLineTo(14.0f)
                lineTo(4.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                lineTo(14.0f, 14.0f)
                close()
                moveTo(6.4037f, 5.0f)
                lineTo(12.0f, 13.3944f)
                lineTo(17.5963f, 5.0f)
                horizontalLineTo(6.4037f)
                close()
            }
        }
        .build()
        return `_filter-2-line`!!
    }

private var `_filter-2-line`: ImageVector? = null
