package com.coleblvck.shelfSlim.content.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Money-rupee-circle-fill`: ImageVector
    get() {
        if (`_money-rupee-circle-fill` != null) {
            return `_money-rupee-circle-fill`!!
        }
        `_money-rupee-circle-fill` = Builder(name = "Money-rupee-circle-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.5003f, 8.0f)
                curveTo(13.8278f, 8.4361f, 14.0625f, 8.9458f, 14.175f, 9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.175f)
                curveTo(13.8275f, 12.7117f, 12.3142f, 14.0f, 10.5f, 14.0f)
                horizontalLineTo(10.3107f)
                lineTo(14.0303f, 17.7197f)
                lineTo(12.9697f, 18.7803f)
                lineTo(8.0f, 13.8107f)
                verticalLineTo(12.5f)
                horizontalLineTo(10.5f)
                curveTo(11.4797f, 12.5f, 12.3131f, 11.8739f, 12.622f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(12.622f)
                curveTo(12.3131f, 8.6261f, 11.4797f, 8.0f, 10.5f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.5003f)
                close()
            }
        }
        .build()
        return `_money-rupee-circle-fill`!!
    }

private var `_money-rupee-circle-fill`: ImageVector? = null
