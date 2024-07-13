package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-diagonal-2-fill`: ImageVector
    get() {
        if (`_expand-diagonal-2-fill` != null) {
            return `_expand-diagonal-2-fill`!!
        }
        `_expand-diagonal-2-fill` = Builder(name = "Expand-diagonal-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(10.5f)
                lineTo(7.4571f, 6.0429f)
                lineTo(10.7071f, 9.2929f)
                lineTo(9.2929f, 10.7071f)
                lineTo(6.0429f, 7.4571f)
                lineTo(3.0f, 10.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(13.5f)
                lineTo(16.5429f, 17.9571f)
                lineTo(13.2929f, 14.7071f)
                lineTo(14.7071f, 13.2929f)
                lineTo(17.9571f, 16.5429f)
                lineTo(21.0f, 13.5f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_expand-diagonal-2-fill`!!
    }

private var `_expand-diagonal-2-fill`: ImageVector? = null
