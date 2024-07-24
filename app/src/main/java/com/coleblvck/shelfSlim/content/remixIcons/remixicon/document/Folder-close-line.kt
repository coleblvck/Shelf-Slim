package com.coleblvck.shelfSlim.content.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Folder-close-line`: ImageVector
    get() {
        if (`_folder-close-line` != null) {
            return `_folder-close-line`!!
        }
        `_folder-close-line` = Builder(name = "Folder-close-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.5858f)
                lineTo(11.5858f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(12.4142f)
                lineTo(10.4142f, 3.0f)
                horizontalLineTo(3.0f)
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
        return `_folder-close-line`!!
    }

private var `_folder-close-line`: ImageVector? = null
