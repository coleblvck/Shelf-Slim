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

public val ArrowsGroup.`Expand-right-line`: ImageVector
    get() {
        if (`_expand-right-line` != null) {
            return `_expand-right-line`!!
        }
        `_expand-right-line` = Builder(name = "Expand-right-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1717f, 11.0001f)
                lineTo(12.5148f, 6.3432f)
                lineTo(13.929f, 4.929f)
                lineTo(21.0001f, 12.0001f)
                lineTo(13.929f, 19.0712f)
                lineTo(12.5148f, 17.6569f)
                lineTo(17.1716f, 13.0001f)
                lineTo(7.9998f, 13.0002f)
                lineTo(7.9998f, 11.0002f)
                lineTo(17.1717f, 11.0001f)
                close()
                moveTo(3.9999f, 19.0f)
                lineTo(3.9999f, 5.0f)
                horizontalLineTo(5.9999f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.9999f)
                close()
            }
        }
        .build()
        return `_expand-right-line`!!
    }

private var `_expand-right-line`: ImageVector? = null
