package com.coleblvck.shelf.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Folder-shield-line`: ImageVector
    get() {
        if (`_folder-shield-line` != null) {
            return `_folder-shield-line`!!
        }
        `_folder-shield-line` = Builder(name = "Folder-shield-line", defaultWidth = 24.0.dp,
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
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5858f)
                lineTo(9.5858f, 5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.904f)
                curveTo(16.0f, 14.7956f, 15.5544f, 15.6282f, 14.8125f, 16.1228f)
                lineTo(12.0f, 17.9978f)
                lineTo(9.1875f, 16.1228f)
                curveTo(8.4456f, 15.6282f, 8.0f, 14.7956f, 8.0f, 13.904f)
                verticalLineTo(9.0f)
                close()
                moveTo(10.0f, 13.904f)
                curveTo(10.0f, 14.1269f, 10.1114f, 14.335f, 10.2969f, 14.4587f)
                lineTo(12.0f, 15.5941f)
                lineTo(13.7031f, 14.4587f)
                curveTo(13.8886f, 14.335f, 14.0f, 14.1269f, 14.0f, 13.904f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.904f)
                close()
            }
        }
        .build()
        return `_folder-shield-line`!!
    }

private var `_folder-shield-line`: ImageVector? = null
