package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-paper-fill`: ImageVector
    get() {
        if (`_file-paper-fill` != null) {
            return `_file-paper-fill`!!
        }
        `_file-paper-fill` = Builder(name = "File-paper-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 15.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.6569f, 19.6569f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 22.0f, 1.0f, 20.6569f, 1.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.5523f, 17.4477f, 20.0f, 18.0f, 20.0f)
                curveTo(18.5523f, 20.0f, 19.0f, 19.5523f, 19.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_file-paper-fill`!!
    }

private var `_file-paper-fill`: ImageVector? = null
