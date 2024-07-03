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

public val DocumentGroup.`Folder-shield-2-fill`: ImageVector
    get() {
        if (`_folder-shield-2-fill` != null) {
            return `_folder-shield-2-fill`!!
        }
        `_folder-shield-2-fill` = Builder(name = "Folder-shield-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.3823f)
                curveTo(12.0f, 18.7906f, 12.6315f, 20.1159f, 13.7054f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.4142f)
                lineTo(12.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.3823f)
                curveTo(22.0f, 18.2786f, 21.5544f, 19.1156f, 20.8125f, 19.6128f)
                lineTo(18.0f, 21.4978f)
                lineTo(15.1875f, 19.6128f)
                curveTo(14.4456f, 19.1156f, 14.0f, 18.2786f, 14.0f, 17.3823f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_folder-shield-2-fill`!!
    }

private var `_folder-shield-2-fill`: ImageVector? = null
