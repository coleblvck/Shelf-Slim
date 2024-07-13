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

public val DocumentGroup.`Folder-image-fill`: ImageVector
    get() {
        if (`_folder-image-fill` != null) {
            return `_folder-image-fill`!!
        }
        `_folder-image-fill` = Builder(name = "Folder-image-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                lineTo(12.4142f, 5.0f)
                close()
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 9.6716f, 9.3284f, 9.0f, 8.5f, 9.0f)
                curveTo(7.6716f, 9.0f, 7.0f, 9.6716f, 7.0f, 10.5f)
                curveTo(7.0f, 11.3284f, 7.6716f, 12.0f, 8.5f, 12.0f)
                curveTo(9.3284f, 12.0f, 10.0f, 11.3284f, 10.0f, 10.5f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(14.0f, 11.0f)
                lineTo(7.0f, 17.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_folder-image-fill`!!
    }

private var `_folder-image-fill`: ImageVector? = null
