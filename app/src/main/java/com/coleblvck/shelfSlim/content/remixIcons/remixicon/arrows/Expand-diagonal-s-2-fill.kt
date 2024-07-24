package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-diagonal-s-2-fill`: ImageVector
    get() {
        if (`_expand-diagonal-s-2-fill` != null) {
            return `_expand-diagonal-s-2-fill`!!
        }
        `_expand-diagonal-s-2-fill` = Builder(name = "Expand-diagonal-s-2-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 12.5f)
                lineTo(8.0429f, 9.4571f)
                lineTo(14.5429f, 15.9571f)
                lineTo(11.5f, 19.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 11.5f)
                lineTo(15.9571f, 14.5429f)
                lineTo(9.4571f, 8.0429f)
                lineTo(12.5f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
            }
        }
        .build()
        return `_expand-diagonal-s-2-fill`!!
    }

private var `_expand-diagonal-s-2-fill`: ImageVector? = null
