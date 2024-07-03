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

public val DocumentGroup.`Folder-unknow-line`: ImageVector
    get() {
        if (`_folder-unknow-line` != null) {
            return `_folder-unknow-line`!!
        }
        `_folder-unknow-line` = Builder(name = "Folder-unknow-line", defaultWidth = 24.0.dp,
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
                moveTo(11.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(8.5673f, 10.8135f)
                curveTo(8.8864f, 9.2092f, 10.302f, 8.0f, 12.0f, 8.0f)
                curveTo(13.933f, 8.0f, 15.5f, 9.567f, 15.5f, 11.5f)
                curveTo(15.5f, 13.433f, 13.933f, 15.0f, 12.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                curveTo(12.8284f, 13.0f, 13.5f, 12.3284f, 13.5f, 11.5f)
                curveTo(13.5f, 10.6716f, 12.8284f, 10.0f, 12.0f, 10.0f)
                curveTo(11.2723f, 10.0f, 10.6656f, 10.5182f, 10.5288f, 11.2058f)
                lineTo(8.5673f, 10.8135f)
                close()
            }
        }
        .build()
        return `_folder-unknow-line`!!
    }

private var `_folder-unknow-line`: ImageVector? = null