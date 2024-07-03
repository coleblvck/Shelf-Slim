package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Archive-fill`: ImageVector
    get() {
        if (`_archive-fill` != null) {
            return `_archive-fill`!!
        }
        `_archive-fill` = Builder(name = "Archive-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0044f)
                curveTo(21.0f, 20.5543f, 20.5551f, 21.0f, 20.0066f, 21.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 21.0f, 3.0f, 20.5552f, 3.0f, 20.0044f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(2.0f, 3.9998f)
                curveTo(2.0f, 3.4476f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.4437f, 22.0f, 3.9998f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.9998f)
                close()
            }
        }
        .build()
        return `_archive-fill`!!
    }

private var `_archive-fill`: ImageVector? = null
