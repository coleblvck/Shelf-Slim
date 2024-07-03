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

public val DocumentGroup.`Folder-check-line`: ImageVector
    get() {
        if (`_folder-check-line` != null) {
            return `_folder-check-line`!!
        }
        `_folder-check-line` = Builder(name = "Folder-check-line", defaultWidth = 24.0.dp,
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
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(12.4142f)
                lineTo(10.4142f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(15.4645f, 18.4647f)
                lineTo(19.0f, 22.0002f)
                lineTo(23.9497f, 17.0505f)
                lineTo(22.5355f, 15.6362f)
                lineTo(19.0f, 19.1718f)
                lineTo(16.8787f, 17.0505f)
                lineTo(15.4645f, 18.4647f)
                close()
            }
        }
        .build()
        return `_folder-check-line`!!
    }

private var `_folder-check-line`: ImageVector? = null
