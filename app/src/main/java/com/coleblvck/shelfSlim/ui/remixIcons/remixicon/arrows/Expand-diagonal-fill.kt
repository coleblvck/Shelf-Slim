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

public val ArrowsGroup.`Expand-diagonal-fill`: ImageVector
    get() {
        if (`_expand-diagonal-fill` != null) {
            return `_expand-diagonal-fill`!!
        }
        `_expand-diagonal-fill` = Builder(name = "Expand-diagonal-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(13.5f)
                lineTo(16.5429f, 6.0429f)
                lineTo(13.2929f, 9.2929f)
                lineTo(14.7071f, 10.7071f)
                lineTo(17.9571f, 7.4571f)
                lineTo(21.0f, 10.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineTo(10.5f)
                lineTo(7.4571f, 17.9571f)
                lineTo(10.7071f, 14.7071f)
                lineTo(9.2929f, 13.2929f)
                lineTo(6.0429f, 16.5429f)
                lineTo(3.0f, 13.5f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_expand-diagonal-fill`!!
    }

private var `_expand-diagonal-fill`: ImageVector? = null