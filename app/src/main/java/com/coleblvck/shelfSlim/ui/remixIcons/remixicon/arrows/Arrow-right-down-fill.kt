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

public val ArrowsGroup.`Arrow-right-down-fill`: ImageVector
    get() {
        if (`_arrow-right-down-fill` != null) {
            return `_arrow-right-down-fill`!!
        }
        `_arrow-right-down-fill` = Builder(name = "Arrow-right-down-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6366f, 13.0515f)
                lineTo(5.9797f, 7.3947f)
                lineTo(7.3939f, 5.9805f)
                lineTo(13.0508f, 11.6373f)
                lineTo(18.0006f, 6.6876f)
                verticalLineTo(18.0013f)
                horizontalLineTo(6.6868f)
                lineTo(11.6366f, 13.0515f)
                close()
            }
        }
        .build()
        return `_arrow-right-down-fill`!!
    }

private var `_arrow-right-down-fill`: ImageVector? = null
