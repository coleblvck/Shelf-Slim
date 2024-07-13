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

public val ArrowsGroup.`Expand-diagonal-s-fill`: ImageVector
    get() {
        if (`_expand-diagonal-s-fill` != null) {
            return `_expand-diagonal-s-fill`!!
        }
        `_expand-diagonal-s-fill` = Builder(name = "Expand-diagonal-s-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                horizontalLineTo(11.5f)
                lineTo(14.5429f, 8.0429f)
                lineTo(8.0429f, 14.5429f)
                lineTo(5.0f, 11.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.5f)
                lineTo(9.4571f, 15.9571f)
                lineTo(15.9571f, 9.4571f)
                lineTo(19.0f, 12.5f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_expand-diagonal-s-fill`!!
    }

private var `_expand-diagonal-s-fill`: ImageVector? = null
