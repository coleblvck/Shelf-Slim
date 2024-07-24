package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Link-m`: ImageVector
    get() {
        if (`_link-m` != null) {
            return `_link-m`!!
        }
        `_link-m` = Builder(name = "Link-m", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6567f, 14.8284f)
                lineTo(16.2425f, 13.4142f)
                lineTo(17.6567f, 12.0f)
                curveTo(19.2188f, 10.4379f, 19.2188f, 7.9052f, 17.6567f, 6.3431f)
                curveTo(16.0946f, 4.7811f, 13.5619f, 4.7811f, 11.9998f, 6.3431f)
                lineTo(10.5856f, 7.7574f)
                lineTo(9.1714f, 6.3431f)
                lineTo(10.5856f, 4.9289f)
                curveTo(12.9287f, 2.5858f, 16.7277f, 2.5858f, 19.0709f, 4.9289f)
                curveTo(21.414f, 7.2721f, 21.414f, 11.0711f, 19.0709f, 13.4142f)
                lineTo(17.6567f, 14.8284f)
                close()
                moveTo(14.8282f, 17.6569f)
                lineTo(13.414f, 19.0711f)
                curveTo(11.0709f, 21.4142f, 7.2719f, 21.4142f, 4.9288f, 19.0711f)
                curveTo(2.5856f, 16.7279f, 2.5856f, 12.9289f, 4.9288f, 10.5858f)
                lineTo(6.343f, 9.1716f)
                lineTo(7.7572f, 10.5858f)
                lineTo(6.343f, 12.0f)
                curveTo(4.7809f, 13.5621f, 4.7809f, 16.0948f, 6.343f, 17.6569f)
                curveTo(7.9051f, 19.2189f, 10.4377f, 19.2189f, 11.9998f, 17.6569f)
                lineTo(13.414f, 16.2426f)
                lineTo(14.8282f, 17.6569f)
                close()
                moveTo(14.8282f, 7.7574f)
                lineTo(16.2425f, 9.1716f)
                lineTo(9.1714f, 16.2426f)
                lineTo(7.7572f, 14.8284f)
                lineTo(14.8282f, 7.7574f)
                close()
            }
        }
        .build()
        return `_link-m`!!
    }

private var `_link-m`: ImageVector? = null
