package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Funds-box-fill`: ImageVector
    get() {
        if (`_funds-box-fill` != null) {
            return `_funds-box-fill`!!
        }
        `_funds-box-fill` = Builder(name = "Funds-box-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0049f, 3.0028f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 3.0028f, 22.0049f, 3.4505f, 22.0049f, 4.0028f)
                verticalLineTo(20.0028f)
                curveTo(22.0049f, 20.5551f, 21.5572f, 21.0028f, 21.0049f, 21.0028f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 21.0028f, 2.0049f, 20.5551f, 2.0049f, 20.0028f)
                verticalLineTo(4.0028f)
                curveTo(2.0049f, 3.4505f, 2.4526f, 3.0028f, 3.0049f, 3.0028f)
                close()
                moveTo(14.7978f, 9.7957f)
                lineTo(12.348f, 12.2454f)
                lineTo(10.2267f, 10.1241f)
                lineTo(5.9841f, 14.3668f)
                lineTo(7.3983f, 15.781f)
                lineTo(10.2267f, 12.9526f)
                lineTo(12.348f, 15.0739f)
                lineTo(16.212f, 11.2099f)
                lineTo(18.0049f, 13.0028f)
                verticalLineTo(8.0028f)
                horizontalLineTo(13.0049f)
                lineTo(14.7978f, 9.7957f)
                close()
            }
        }
        .build()
        return `_funds-box-fill`!!
    }

private var `_funds-box-fill`: ImageVector? = null
