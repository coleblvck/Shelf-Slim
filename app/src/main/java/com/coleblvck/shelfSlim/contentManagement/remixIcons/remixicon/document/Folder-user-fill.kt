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

public val DocumentGroup.`Folder-user-fill`: ImageVector
    get() {
        if (`_folder-user-fill` != null) {
            return `_folder-user-fill`!!
        }
        `_folder-user-fill` = Builder(name = "Folder-user-fill", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 13.0f)
                curveTo(13.3807f, 13.0f, 14.5f, 11.8807f, 14.5f, 10.5f)
                curveTo(14.5f, 9.1193f, 13.3807f, 8.0f, 12.0f, 8.0f)
                curveTo(10.6193f, 8.0f, 9.5f, 9.1193f, 9.5f, 10.5f)
                curveTo(9.5f, 11.8807f, 10.6193f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 15.7909f, 14.2091f, 14.0f, 12.0f, 14.0f)
                curveTo(9.7909f, 14.0f, 8.0f, 15.7909f, 8.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_folder-user-fill`!!
    }

private var `_folder-user-fill`: ImageVector? = null
