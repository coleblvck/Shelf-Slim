package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Box-1-fill`: ImageVector
    get() {
        if (`_box-1-fill` != null) {
            return `_box-1-fill`!!
        }
        `_box-1-fill` = Builder(name = "Box-1-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(21.5f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(13.0f, 22.4211f)
                verticalLineTo(11.4234f)
                lineTo(3.4979f, 5.9222f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(2.5f, 7.6555f)
                verticalLineTo(17.5f)
                lineTo(11.0f, 22.4211f)
                verticalLineTo(12.5765f)
                lineTo(2.5f, 7.6555f)
                close()
            }
        }
        .build()
        return `_box-1-fill`!!
    }

private var `_box-1-fill`: ImageVector? = null
