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

public val ArrowsGroup.`Expand-right-fill`: ImageVector
    get() {
        if (`_expand-right-fill` != null) {
            return `_expand-right-fill`!!
        }
        `_expand-right-fill` = Builder(name = "Expand-right-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9999f, 4.9998f)
                lineTo(21.0001f, 11.9999f)
                lineTo(13.9999f, 18.9998f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.9998f)
                lineTo(7.9998f, 11.0f)
                horizontalLineTo(13.9999f)
                verticalLineTo(4.9998f)
                close()
                moveTo(3.9999f, 18.9998f)
                lineTo(3.9999f, 4.9998f)
                horizontalLineTo(5.9999f)
                verticalLineTo(18.9998f)
                horizontalLineTo(3.9999f)
                close()
            }
        }
        .build()
        return `_expand-right-fill`!!
    }

private var `_expand-right-fill`: ImageVector? = null
