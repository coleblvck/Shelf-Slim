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

public val DocumentGroup.`File-gif-fill`: ImageVector
    get() {
        if (`_file-gif-fill` != null) {
            return `_file-gif-fill`!!
        }
        `_file-gif-fill` = Builder(name = "File-gif-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(20.9997f, 7.0f)
                lineTo(21.0f, 20.9925f)
                curveTo(21.0f, 21.5489f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4441f, 3.4475f, 2.0f, 3.9985f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(7.8954f, 10.0f, 7.0f, 10.8954f, 7.0f, 12.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 14.1046f, 7.8954f, 15.0f, 9.0f, 15.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 15.0f, 11.0f, 14.5523f, 11.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 14.0f, 8.0f, 13.5523f, 8.0f, 13.0f)
                verticalLineTo(12.0f)
                curveTo(8.0f, 11.4477f, 8.4477f, 11.0f, 9.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(17.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_file-gif-fill`!!
    }

private var `_file-gif-fill`: ImageVector? = null
