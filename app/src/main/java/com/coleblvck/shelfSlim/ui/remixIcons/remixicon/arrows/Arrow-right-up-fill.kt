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

public val ArrowsGroup.`Arrow-right-up-fill`: ImageVector
    get() {
        if (`_arrow-right-up-fill` != null) {
            return `_arrow-right-up-fill`!!
        }
        `_arrow-right-up-fill` = Builder(name = "Arrow-right-up-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0508f, 12.361f)
                lineTo(7.3939f, 18.0179f)
                lineTo(5.9797f, 16.6037f)
                lineTo(11.6366f, 10.9468f)
                lineTo(6.6868f, 5.9971f)
                horizontalLineTo(18.0006f)
                verticalLineTo(17.3108f)
                lineTo(13.0508f, 12.361f)
                close()
            }
        }
        .build()
        return `_arrow-right-up-fill`!!
    }

private var `_arrow-right-up-fill`: ImageVector? = null
