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

public val DocumentGroup.`File-pdf-2-line`: ImageVector
    get() {
        if (`_file-pdf-2-line` != null) {
            return `_file-pdf-2-line`!!
        }
        `_file-pdf-2-line` = Builder(name = "File-pdf-2-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.9985f, 2.0f)
                curveTo(3.4475f, 2.0f, 3.0f, 2.4441f, 3.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(3.0f, 21.5447f, 3.4448f, 22.0f, 3.9934f, 22.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5551f, 22.0f, 21.0f, 21.5489f, 21.0f, 20.9925f)
                lineTo(20.9997f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.9985f)
                close()
                moveTo(10.4999f, 7.5f)
                curveTo(10.4999f, 9.0775f, 10.0442f, 10.9373f, 9.2749f, 12.6534f)
                curveTo(8.5029f, 14.3757f, 7.4614f, 15.8502f, 6.3752f, 16.7191f)
                lineTo(7.5546f, 18.3321f)
                curveTo(10.4821f, 16.3804f, 13.7233f, 15.0421f, 16.8585f, 15.49f)
                lineTo(17.3162f, 13.5513f)
                curveTo(14.6435f, 12.6604f, 12.4999f, 9.9899f, 12.4999f, 7.5f)
                horizontalLineTo(10.4999f)
                close()
                moveTo(11.0999f, 13.4716f)
                curveTo(11.3673f, 12.8752f, 11.6042f, 12.2563f, 11.8037f, 11.6285f)
                curveTo(12.2753f, 12.3531f, 12.8553f, 13.0182f, 13.5101f, 13.5953f)
                curveTo(12.5283f, 13.7711f, 11.5665f, 14.0596f, 10.6352f, 14.4276f)
                curveTo(10.7999f, 14.1143f, 10.9551f, 13.7948f, 11.0999f, 13.4716f)
                close()
            }
        }
        .build()
        return `_file-pdf-2-line`!!
    }

private var `_file-pdf-2-line`: ImageVector? = null
