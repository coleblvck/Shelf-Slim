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

public val DocumentGroup.`Folder-shared-fill`: ImageVector
    get() {
        if (`_folder-shared-fill` != null) {
            return `_folder-shared-fill`!!
        }
        `_folder-shared-fill` = Builder(name = "Folder-shared-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.126f)
                curveTo(21.0149f, 12.4174f, 19.8062f, 12.0f, 18.5f, 12.0f)
                curveTo(15.1863f, 12.0f, 12.5f, 14.6863f, 12.5f, 18.0f)
                curveTo(12.5f, 19.0929f, 12.7922f, 20.1175f, 13.3027f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                lineTo(12.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(13.126f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineTo(13.5f)
                lineTo(23.0f, 18.0f)
                lineTo(18.0f, 22.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_folder-shared-fill`!!
    }

private var `_folder-shared-fill`: ImageVector? = null
