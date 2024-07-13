package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Price-tag-2-fill`: ImageVector
    get() {
        if (`_price-tag-2-fill` != null) {
            return `_price-tag-2-fill`!!
        }
        `_price-tag-2-fill` = Builder(name = "Price-tag-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0049f, 6.9997f)
                lineTo(11.4502f, 1.3695f)
                curveTo(11.7861f, 1.1456f, 12.2237f, 1.1456f, 12.5596f, 1.3695f)
                lineTo(21.0049f, 6.9997f)
                verticalLineTo(20.9997f)
                curveTo(21.0049f, 21.552f, 20.5572f, 21.9997f, 20.0049f, 21.9997f)
                horizontalLineTo(4.0049f)
                curveTo(3.4526f, 21.9997f, 3.0049f, 21.552f, 3.0049f, 20.9997f)
                verticalLineTo(6.9997f)
                close()
                moveTo(12.0049f, 10.9997f)
                curveTo(13.1095f, 10.9997f, 14.0049f, 10.1043f, 14.0049f, 8.9997f)
                curveTo(14.0049f, 7.8952f, 13.1095f, 6.9997f, 12.0049f, 6.9997f)
                curveTo(10.9003f, 6.9997f, 10.0049f, 7.8952f, 10.0049f, 8.9997f)
                curveTo(10.0049f, 10.1043f, 10.9003f, 10.9997f, 12.0049f, 10.9997f)
                close()
                moveTo(8.0049f, 15.9997f)
                verticalLineTo(17.9997f)
                horizontalLineTo(16.0049f)
                verticalLineTo(15.9997f)
                horizontalLineTo(8.0049f)
                close()
                moveTo(8.0049f, 12.9997f)
                verticalLineTo(14.9997f)
                horizontalLineTo(16.0049f)
                verticalLineTo(12.9997f)
                horizontalLineTo(8.0049f)
                close()
            }
        }
        .build()
        return `_price-tag-2-fill`!!
    }

private var `_price-tag-2-fill`: ImageVector? = null
