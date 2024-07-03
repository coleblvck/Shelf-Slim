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

public val BusinessGroup.`Archive-2-fill`: ImageVector
    get() {
        if (`_archive-2-fill` != null) {
            return `_archive-2-fill`!!
        }
        `_archive-2-fill` = Builder(name = "Archive-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                verticalLineTo(7.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                lineTo(2.0f, 7.0035f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                close()
                moveTo(5.2358f, 5.0f)
                horizontalLineTo(18.7638f)
                lineTo(19.7638f, 7.0f)
                horizontalLineTo(4.2368f)
                lineTo(5.2358f, 5.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_archive-2-fill`!!
    }

private var `_archive-2-fill`: ImageVector? = null
