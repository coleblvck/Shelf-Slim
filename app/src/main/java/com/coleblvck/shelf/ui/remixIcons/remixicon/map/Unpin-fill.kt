package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Unpin-fill`: ImageVector
    get() {
        if (`_unpin-fill` != null) {
            return `_unpin-fill`!!
        }
        `_unpin-fill` = Builder(name = "Unpin-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9711f, 17.1715f)
                lineTo(19.5568f, 18.5858f)
                lineTo(16.0223f, 15.0513f)
                lineTo(15.9486f, 15.125f)
                lineTo(15.2415f, 18.6605f)
                lineTo(13.8273f, 20.0747f)
                lineTo(9.5847f, 15.8321f)
                lineTo(4.6349f, 20.7818f)
                lineTo(3.2207f, 19.3676f)
                lineTo(8.1705f, 14.4179f)
                lineTo(3.9278f, 10.1752f)
                lineTo(5.342f, 8.761f)
                lineTo(8.8776f, 8.0539f)
                lineTo(8.9513f, 7.9802f)
                lineTo(5.4147f, 4.4436f)
                lineTo(6.8289f, 3.0294f)
                lineTo(20.9711f, 17.1715f)
                close()
                moveTo(18.8508f, 12.2228f)
                lineTo(20.1913f, 10.8823f)
                lineTo(20.8984f, 11.5894f)
                lineTo(22.3126f, 10.1752f)
                lineTo(13.8273f, 1.6899f)
                lineTo(12.4131f, 3.1042f)
                lineTo(13.1202f, 3.8113f)
                lineTo(11.7797f, 5.1518f)
                lineTo(18.8508f, 12.2228f)
                close()
            }
        }
        .build()
        return `_unpin-fill`!!
    }

private var `_unpin-fill`: ImageVector? = null
