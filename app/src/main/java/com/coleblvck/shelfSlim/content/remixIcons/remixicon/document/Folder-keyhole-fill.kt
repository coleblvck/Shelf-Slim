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

public val DocumentGroup.`Folder-keyhole-fill`: ImageVector
    get() {
        if (`_folder-keyhole-fill` != null) {
            return `_folder-keyhole-fill`!!
        }
        `_folder-keyhole-fill` = Builder(name = "Folder-keyhole-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4142f, 3.0f)
                lineTo(12.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.8954f, 9.0f, 10.0f, 9.8954f, 10.0f, 11.0f)
                curveTo(10.0f, 11.7403f, 10.4022f, 12.3866f, 10.9999f, 12.7324f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(13.0011f, 12.7318f)
                curveTo(13.5983f, 12.3858f, 14.0f, 11.7398f, 14.0f, 11.0f)
                curveTo(14.0f, 9.8954f, 13.1046f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_folder-keyhole-fill`!!
    }

private var `_folder-keyhole-fill`: ImageVector? = null
