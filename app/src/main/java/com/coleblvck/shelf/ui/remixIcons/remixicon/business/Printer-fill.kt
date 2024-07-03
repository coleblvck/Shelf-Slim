package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Printer-fill`: ImageVector
    get() {
        if (`_printer-fill` != null) {
            return `_printer-fill`!!
        }
        `_printer-fill` = Builder(name = "Printer-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.4477f, 2.4477f, 8.0f, 3.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 8.4477f, 22.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(5.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 2.0f, 18.0f, 2.4477f, 18.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                curveTo(6.0f, 2.4477f, 6.4477f, 2.0f, 7.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_printer-fill`!!
    }

private var `_printer-fill`: ImageVector? = null
