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

public val DocumentGroup.`Folder-close-fill`: ImageVector
    get() {
        if (`_folder-close-fill` != null) {
            return `_folder-close-fill`!!
        }
        `_folder-close-fill` = Builder(name = "Folder-close-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(20.0929f, 12.0f, 21.1175f, 12.2922f, 22.0f, 12.8027f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(12.4142f)
                lineTo(10.4142f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(13.8027f)
                curveTo(13.2922f, 20.1175f, 13.0f, 19.0929f, 13.0f, 18.0f)
                curveTo(13.0f, 14.6863f, 15.6863f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(20.4143f, 17.9999f)
                lineTo(22.5356f, 20.1212f)
                lineTo(21.1214f, 21.5354f)
                lineTo(19.0001f, 19.4141f)
                lineTo(16.8788f, 21.5354f)
                lineTo(15.4646f, 20.1212f)
                lineTo(17.5859f, 17.9999f)
                lineTo(15.4646f, 15.8786f)
                lineTo(16.8788f, 14.4644f)
                lineTo(19.0001f, 16.5857f)
                lineTo(21.1214f, 14.4644f)
                lineTo(22.5356f, 15.8786f)
                lineTo(20.4143f, 17.9999f)
                close()
            }
        }
        .build()
        return `_folder-close-fill`!!
    }

private var `_folder-close-fill`: ImageVector? = null
