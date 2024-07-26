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

public val SystemGroup.`Filter-line`: ImageVector
    get() {
        if (`_filter-line` != null) {
            return `_filter-line`!!
        }
        `_filter-line` = Builder(name = "Filter-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                lineTo(15.0f, 13.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.5f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(6.4037f, 6.0f)
                lineTo(11.0f, 12.8944f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.8944f)
                lineTo(17.5963f, 6.0f)
                horizontalLineTo(6.4037f)
                close()
            }
        }
        .build()
        return `_filter-line`!!
    }

private var `_filter-line`: ImageVector? = null