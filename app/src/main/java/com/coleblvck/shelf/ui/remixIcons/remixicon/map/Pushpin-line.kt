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

public val MapGroup.`Pushpin-line`: ImageVector
    get() {
        if (`_pushpin-line` != null) {
            return `_pushpin-line`!!
        }
        `_pushpin-line` = Builder(name = "Pushpin-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8273f, 1.69f)
                lineTo(22.3126f, 10.1753f)
                lineTo(20.8984f, 11.5895f)
                lineTo(20.1913f, 10.8824f)
                lineTo(15.9486f, 15.125f)
                lineTo(15.2415f, 18.6606f)
                lineTo(13.8273f, 20.0748f)
                lineTo(9.5847f, 15.8321f)
                lineTo(4.6349f, 20.7819f)
                lineTo(3.2207f, 19.3677f)
                lineTo(8.1705f, 14.4179f)
                lineTo(3.9278f, 10.1753f)
                lineTo(5.342f, 8.7611f)
                lineTo(8.8776f, 8.054f)
                lineTo(13.1202f, 3.8113f)
                lineTo(12.4131f, 3.1042f)
                lineTo(13.8273f, 1.69f)
                close()
                moveTo(14.5344f, 5.2255f)
                lineTo(9.8636f, 9.8964f)
                lineTo(7.0417f, 10.4607f)
                lineTo(13.5418f, 16.9609f)
                lineTo(14.1062f, 14.139f)
                lineTo(18.7771f, 9.4682f)
                lineTo(14.5344f, 5.2255f)
                close()
            }
        }
        .build()
        return `_pushpin-line`!!
    }

private var `_pushpin-line`: ImageVector? = null
