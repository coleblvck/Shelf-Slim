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

public val DocumentGroup.`File-shield-2-fill`: ImageVector
    get() {
        if (`_file-shield-2-fill` != null) {
            return `_file-shield-2-fill`!!
        }
        `_file-shield-2-fill` = Builder(name = "File-shield-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.3823f)
                curveTo(11.0f, 18.9449f, 11.7775f, 20.4053f, 13.074f, 21.2742f)
                lineTo(14.1569f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4553f, 3.4469f, 2.0f, 3.9983f, 2.0f)
                horizontalLineTo(15.9968f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.3823f)
                curveTo(21.0f, 18.2786f, 20.5544f, 19.1156f, 19.8125f, 19.6128f)
                lineTo(17.0f, 21.4978f)
                lineTo(14.1875f, 19.6128f)
                curveTo(13.4456f, 19.1156f, 13.0f, 18.2786f, 13.0f, 17.3823f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_file-shield-2-fill`!!
    }

private var `_file-shield-2-fill`: ImageVector? = null
