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

public val DocumentGroup.`Folders-fill`: ImageVector
    get() {
        if (`_folders-fill` != null) {
            return `_folders-fill`!!
        }
        `_folders-fill` = Builder(name = "Folders-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 3.4477f, 6.4477f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(13.4142f)
                lineTo(15.4142f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.5523f, 21.5523f, 17.0f, 21.0f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 20.5523f, 17.5523f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 7.4477f, 2.4477f, 7.0f, 3.0f, 7.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_folders-fill`!!
    }

private var `_folders-fill`: ImageVector? = null
