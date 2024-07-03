package com.coleblvck.shelf.ui.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Vip-crown-line`: ImageVector
    get() {
        if (`_vip-crown-line` != null) {
            return `_vip-crown-line`!!
        }
        `_vip-crown-line` = Builder(name = "Vip-crown-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0049f, 19.0f)
                horizontalLineTo(22.0049f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(19.0f)
                close()
                moveTo(2.0049f, 5.0f)
                lineTo(7.0049f, 8.5f)
                lineTo(12.0049f, 2.0f)
                lineTo(17.0049f, 8.5f)
                lineTo(22.0049f, 5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(5.0f)
                close()
                moveTo(4.0049f, 8.8413f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0049f)
                verticalLineTo(8.8413f)
                lineTo(16.5854f, 11.2349f)
                lineTo(12.0049f, 5.2802f)
                lineTo(7.4243f, 11.2349f)
                lineTo(4.0049f, 8.8413f)
                close()
            }
        }
        .build()
        return `_vip-crown-line`!!
    }

private var `_vip-crown-line`: ImageVector? = null
