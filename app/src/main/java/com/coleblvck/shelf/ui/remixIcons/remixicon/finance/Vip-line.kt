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

public val FinanceGroup.`Vip-line`: ImageVector
    get() {
        if (`_vip-line` != null) {
            return `_vip-line`!!
        }
        `_vip-line` = Builder(name = "Vip-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0049f, 19.0f)
                horizontalLineTo(22.0049f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(19.0f)
                close()
                moveTo(11.0049f, 8.0f)
                horizontalLineTo(13.0049f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0049f)
                verticalLineTo(8.0f)
                close()
                moveTo(7.97f, 8.0f)
                lineTo(6.1091f, 13.1127f)
                lineTo(4.2482f, 8.0f)
                horizontalLineTo(2.1233f)
                lineTo(5.1091f, 15.9637f)
                horizontalLineTo(7.1091f)
                lineTo(10.0949f, 8.0f)
                horizontalLineTo(7.97f)
                close()
                moveTo(17.0049f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0049f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0049f)
                curveTo(20.6617f, 8.0f, 22.0049f, 9.3432f, 22.0049f, 11.0f)
                curveTo(22.0049f, 12.6569f, 20.6617f, 14.0f, 19.0049f, 14.0f)
                horizontalLineTo(17.0049f)
                close()
                moveTo(17.0049f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0049f)
                curveTo(19.5572f, 12.0f, 20.0049f, 11.5523f, 20.0049f, 11.0f)
                curveTo(20.0049f, 10.4477f, 19.5572f, 10.0f, 19.0049f, 10.0f)
                horizontalLineTo(17.0049f)
                close()
                moveTo(2.0049f, 3.0f)
                horizontalLineTo(22.0049f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_vip-line`!!
    }

private var `_vip-line`: ImageVector? = null
