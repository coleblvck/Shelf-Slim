package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-up-down-fill`: ImageVector
    get() {
        if (`_arrow-up-down-fill` != null) {
            return `_arrow-up-down-fill`!!
        }
        `_arrow-up-down-fill` = Builder(name = "Arrow-up-down-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                horizontalLineTo(8.001f)
                lineTo(8.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                lineTo(7.0f, 3.0f)
                lineTo(12.0f, 8.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(17.0f, 21.0f)
                lineTo(12.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return `_arrow-up-down-fill`!!
    }

private var `_arrow-up-down-fill`: ImageVector? = null
