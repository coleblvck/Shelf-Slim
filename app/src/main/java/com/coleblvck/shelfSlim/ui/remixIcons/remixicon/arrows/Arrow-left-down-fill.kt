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

public val ArrowsGroup.`Arrow-left-down-fill`: ImageVector
    get() {
        if (`_arrow-left-down-fill` != null) {
            return `_arrow-left-down-fill`!!
        }
        `_arrow-left-down-fill` = Builder(name = "Arrow-left-down-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3608f, 13.0515f)
                lineTo(17.3105f, 18.0013f)
                horizontalLineTo(5.9968f)
                verticalLineTo(6.6876f)
                lineTo(10.9466f, 11.6373f)
                lineTo(16.6034f, 5.9805f)
                lineTo(18.0176f, 7.3947f)
                lineTo(12.3608f, 13.0515f)
                close()
            }
        }
        .build()
        return `_arrow-left-down-fill`!!
    }

private var `_arrow-left-down-fill`: ImageVector? = null
