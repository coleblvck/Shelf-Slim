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

public val ArrowsGroup.`Arrow-left-s-fill`: ImageVector
    get() {
        if (`_arrow-left-s-fill` != null) {
            return `_arrow-left-s-fill`!!
        }
        `_arrow-left-s-fill` = Builder(name = "Arrow-left-s-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                lineTo(14.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(8.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_arrow-left-s-fill`!!
    }

private var `_arrow-left-s-fill`: ImageVector? = null
