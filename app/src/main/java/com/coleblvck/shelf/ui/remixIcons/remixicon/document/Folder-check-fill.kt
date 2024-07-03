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

public val DocumentGroup.`Folder-check-fill`: ImageVector
    get() {
        if (`_folder-check-fill` != null) {
            return `_folder-check-fill`!!
        }
        `_folder-check-fill` = Builder(name = "Folder-check-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveTo(20.0929f, 13.0f, 21.1175f, 13.2922f, 22.0f, 13.8027f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(12.4142f)
                lineTo(10.4142f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(13.3414f)
                curveTo(13.1203f, 20.3744f, 13.0f, 19.7013f, 13.0f, 19.0f)
                curveTo(13.0f, 15.6863f, 15.6863f, 13.0f, 19.0f, 13.0f)
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
        return `_folder-check-fill`!!
    }

private var `_folder-check-fill`: ImageVector? = null
