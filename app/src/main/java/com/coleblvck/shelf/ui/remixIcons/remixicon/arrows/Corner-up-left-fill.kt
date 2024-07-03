package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Corner-up-left-fill`: ImageVector
    get() {
        if (`_corner-up-left-fill` != null) {
            return `_corner-up-left-fill`!!
        }
        `_corner-up-left-fill` = Builder(name = "Corner-up-left-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0001f, 10.0001f)
                lineTo(19.0003f, 19.0f)
                lineTo(17.0003f, 19.0f)
                lineTo(17.0002f, 12.0001f)
                lineTo(9.4141f, 12.0f)
                verticalLineTo(17.4142f)
                lineTo(2.9999f, 11.0f)
                lineTo(9.4141f, 4.5858f)
                lineTo(9.4141f, 10.0f)
                lineTo(19.0001f, 10.0001f)
                close()
            }
        }
        .build()
        return `_corner-up-left-fill`!!
    }

private var `_corner-up-left-fill`: ImageVector? = null
