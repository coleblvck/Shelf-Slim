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

public val DocumentGroup.`Folder-shield-2-line`: ImageVector
    get() {
        if (`_folder-shield-2-line` != null) {
            return `_folder-shield-2-line`!!
        }
        `_folder-shield-2-line` = Builder(name = "Folder-shield-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5858f)
                lineTo(9.5858f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.4469f)
                curveTo(11.8089f, 19.7916f, 12.3786f, 20.4853f, 13.1114f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                lineTo(12.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.949f)
                curveTo(22.0f, 17.9397f, 21.4987f, 18.8648f, 20.6641f, 19.4144f)
                lineTo(17.5f, 21.4978f)
                lineTo(14.3359f, 19.4144f)
                curveTo(13.5013f, 18.8648f, 13.0f, 17.9397f, 13.0f, 16.949f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.0f, 16.949f)
                curveTo(15.0f, 17.2652f, 15.1616f, 17.5634f, 15.4358f, 17.744f)
                lineTo(17.5f, 19.1032f)
                lineTo(19.5642f, 17.744f)
                curveTo(19.8384f, 17.5634f, 20.0f, 17.2652f, 20.0f, 16.949f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.949f)
                close()
            }
        }
        .build()
        return `_folder-shield-2-line`!!
    }

private var `_folder-shield-2-line`: ImageVector? = null
