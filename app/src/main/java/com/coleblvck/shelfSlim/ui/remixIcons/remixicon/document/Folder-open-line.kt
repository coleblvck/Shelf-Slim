package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Folder-open-line`: ImageVector
    get() {
        if (`_folder-open-line` != null) {
            return `_folder-open-line`!!
        }
        `_folder-open-line` = Builder(name = "Folder-open-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                lineTo(12.4142f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 5.0f, 21.0f, 5.4477f, 21.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5858f)
                lineTo(9.5858f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.998f)
                lineTo(5.5f, 11.0f)
                horizontalLineTo(22.5f)
                lineTo(20.1894f, 20.2425f)
                curveTo(20.0781f, 20.6877f, 19.6781f, 21.0f, 19.2192f, 21.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(19.9384f, 13.0f)
                horizontalLineTo(7.0616f)
                lineTo(5.5616f, 19.0f)
                horizontalLineTo(18.4384f)
                lineTo(19.9384f, 13.0f)
                close()
            }
        }
        .build()
        return `_folder-open-line`!!
    }

private var `_folder-open-line`: ImageVector? = null
