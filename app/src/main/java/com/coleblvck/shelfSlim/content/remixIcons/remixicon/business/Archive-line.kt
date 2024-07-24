package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Archive-line`: ImageVector
    get() {
        if (`_archive-line` != null) {
            return `_archive-line`!!
        }
        `_archive-line` = Builder(name = "Archive-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0029f)
                curveTo(2.0f, 3.449f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.4379f, 22.0f, 4.0029f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0015f)
                curveTo(21.0f, 20.553f, 20.5551f, 21.0f, 20.0066f, 21.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 21.0f, 3.0f, 20.5525f, 3.0f, 20.0015f)
                verticalLineTo(10.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_archive-line`!!
    }

private var `_archive-line`: ImageVector? = null
