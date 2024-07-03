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

public val ArrowsGroup.`Arrow-left-up-fill`: ImageVector
    get() {
        if (`_arrow-left-up-fill` != null) {
            return `_arrow-left-up-fill`!!
        }
        `_arrow-left-up-fill` = Builder(name = "Arrow-left-up-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3608f, 10.9468f)
                lineTo(18.0176f, 16.6037f)
                lineTo(16.6034f, 18.0179f)
                lineTo(10.9466f, 12.361f)
                lineTo(5.9968f, 17.3108f)
                verticalLineTo(5.9971f)
                horizontalLineTo(17.3105f)
                lineTo(12.3608f, 10.9468f)
                close()
            }
        }
        .build()
        return `_arrow-left-up-fill`!!
    }

private var `_arrow-left-up-fill`: ImageVector? = null
