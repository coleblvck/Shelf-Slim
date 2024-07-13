package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Filter-3-fill`: ImageVector
    get() {
        if (`_filter-3-fill` != null) {
            return `_filter-3-fill`!!
        }
        `_filter-3-fill` = Builder(name = "Filter-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(3.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_filter-3-fill`!!
    }

private var `_filter-3-fill`: ImageVector? = null