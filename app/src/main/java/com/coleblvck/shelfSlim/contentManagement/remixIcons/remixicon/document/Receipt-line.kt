package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Receipt-line`: ImageVector
    get() {
        if (`_receipt-line` != null) {
            return `_receipt-line`!!
        }
        `_receipt-line` = Builder(name = "Receipt-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(6.0f, 2.0f)
                lineTo(3.0f, 4.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.6569f, 4.3432f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 22.0f, 23.0f, 20.6569f, 23.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                lineTo(18.0f, 2.0f)
                lineTo(15.0f, 4.0f)
                lineTo(12.0f, 2.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                curveTo(7.0f, 19.5523f, 6.5523f, 20.0f, 6.0f, 20.0f)
                curveTo(5.4477f, 20.0f, 5.0f, 19.5523f, 5.0f, 19.0f)
                verticalLineTo(5.0704f)
                lineTo(6.0f, 4.4037f)
                lineTo(9.0f, 6.4037f)
                lineTo(12.0f, 4.4037f)
                lineTo(15.0f, 6.4037f)
                lineTo(18.0f, 4.4037f)
                lineTo(19.0f, 5.0704f)
                verticalLineTo(16.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineTo(8.8293f)
                curveTo(8.9398f, 19.6872f, 9.0f, 19.3506f, 9.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.5523f, 20.5523f, 20.0f, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_receipt-line`!!
    }

private var `_receipt-line`: ImageVector? = null
