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

public val DocumentGroup.`File-pdf-2-fill`: ImageVector
    get() {
        if (`_file-pdf-2-fill` != null) {
            return `_file-pdf-2-fill`!!
        }
        `_file-pdf-2-fill` = Builder(name = "File-pdf-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(10.5f, 7.5f)
                horizontalLineTo(12.5f)
                curveTo(12.5f, 9.9899f, 14.6436f, 12.6604f, 17.3162f, 13.5513f)
                lineTo(16.8586f, 15.49f)
                curveTo(13.7234f, 15.0421f, 10.4821f, 16.3804f, 7.5547f, 18.3321f)
                lineTo(6.3753f, 16.7191f)
                curveTo(7.4615f, 15.8502f, 8.5029f, 14.3757f, 9.275f, 12.6534f)
                curveTo(10.0443f, 10.9373f, 10.5f, 9.0775f, 10.5f, 7.5f)
                close()
                moveTo(11.1f, 13.4716f)
                curveTo(11.3673f, 12.8752f, 11.6043f, 12.2563f, 11.8037f, 11.6285f)
                curveTo(12.2754f, 12.3531f, 12.8553f, 13.0182f, 13.5102f, 13.5953f)
                curveTo(12.5284f, 13.7711f, 11.5666f, 14.0596f, 10.6353f, 14.4276f)
                curveTo(10.8f, 14.1143f, 10.9551f, 13.7948f, 11.1f, 13.4716f)
                close()
            }
        }
        .build()
        return `_file-pdf-2-fill`!!
    }

private var `_file-pdf-2-fill`: ImageVector? = null
