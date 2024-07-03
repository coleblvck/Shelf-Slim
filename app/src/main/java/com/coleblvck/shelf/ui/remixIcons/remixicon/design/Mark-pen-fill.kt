package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Mark-pen-fill`: ImageVector
    get() {
        if (`_mark-pen-fill` != null) {
            return `_mark-pen-fill`!!
        }
        `_mark-pen-fill` = Builder(name = "Mark-pen-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9498f, 2.3902f)
                lineTo(21.6066f, 8.047f)
                curveTo(21.9972f, 8.4375f, 21.9972f, 9.0707f, 21.6066f, 9.4612f)
                lineTo(13.8285f, 17.2394f)
                lineTo(11.7071f, 17.9465f)
                lineTo(10.2929f, 19.3607f)
                curveTo(9.9024f, 19.7513f, 9.2692f, 19.7513f, 8.8787f, 19.3607f)
                lineTo(4.6361f, 15.1181f)
                curveTo(4.2456f, 14.7276f, 4.2456f, 14.0944f, 4.6361f, 13.7039f)
                lineTo(6.0503f, 12.2897f)
                lineTo(6.7574f, 10.1683f)
                lineTo(14.5356f, 2.3902f)
                curveTo(14.9261f, 1.9996f, 15.5593f, 1.9996f, 15.9498f, 2.3902f)
                close()
                moveTo(16.6569f, 5.9257f)
                lineTo(10.2929f, 12.2897f)
                lineTo(11.7071f, 13.7039f)
                lineTo(18.0711f, 7.3399f)
                lineTo(16.6569f, 5.9257f)
                close()
                moveTo(4.2825f, 16.8859f)
                lineTo(7.111f, 19.7143f)
                lineTo(5.6967f, 21.1285f)
                lineTo(1.4541f, 19.7143f)
                lineTo(4.2825f, 16.8859f)
                close()
            }
        }
        .build()
        return `_mark-pen-fill`!!
    }

private var `_mark-pen-fill`: ImageVector? = null
