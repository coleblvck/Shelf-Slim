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

public val SystemGroup.`Export-fill`: ImageVector
    get() {
        if (`_export-fill` != null) {
            return `_export-fill`!!
        }
        `_export-fill` = Builder(name = "Export-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4477f, 21.5523f, 3.0f, 21.0f, 3.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(10.3431f, 16.0f, 9.0f, 14.6569f, 9.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 14.6569f, 13.6569f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 6.5f)
                lineTo(16.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_export-fill`!!
    }

private var `_export-fill`: ImageVector? = null
