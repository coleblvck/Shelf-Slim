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

public val FinanceGroup.`Hand-coin-fill`: ImageVector
    get() {
        if (`_hand-coin-fill` != null) {
            return `_hand-coin-fill`!!
        }
        `_hand-coin-fill` = Builder(name = "Hand-coin-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3349f, 11.5023f)
                lineTo(11.5049f, 11.5028f)
                curveTo(13.9902f, 11.5028f, 16.0049f, 13.5175f, 16.0049f, 16.0028f)
                horizontalLineTo(9.0039f)
                lineTo(9.0049f, 17.0028f)
                lineTo(17.0049f, 17.002f)
                verticalLineTo(16.0028f)
                curveTo(17.0049f, 14.9204f, 16.6867f, 13.8997f, 16.1188f, 13.002f)
                lineTo(19.0049f, 13.0028f)
                curveTo(20.9972f, 13.0028f, 22.7173f, 14.1681f, 23.521f, 15.8542f)
                curveTo(21.1562f, 18.9748f, 17.3268f, 21.0028f, 13.0049f, 21.0028f)
                curveTo(10.2436f, 21.0028f, 7.9044f, 20.4122f, 6.0046f, 19.378f)
                lineTo(6.0059f, 10.0738f)
                curveTo(7.2515f, 10.2522f, 8.3912f, 10.7585f, 9.3349f, 11.5023f)
                close()
                moveTo(5.0049f, 19.0028f)
                curveTo(5.0049f, 19.5551f, 4.5572f, 20.0028f, 4.0049f, 20.0028f)
                horizontalLineTo(2.0049f)
                curveTo(1.4526f, 20.0028f, 1.0049f, 19.5551f, 1.0049f, 19.0028f)
                verticalLineTo(10.0028f)
                curveTo(1.0049f, 9.4505f, 1.4526f, 9.0028f, 2.0049f, 9.0028f)
                horizontalLineTo(4.0049f)
                curveTo(4.5572f, 9.0028f, 5.0049f, 9.4505f, 5.0049f, 10.0028f)
                verticalLineTo(19.0028f)
                close()
                moveTo(18.0049f, 5.0028f)
                curveTo(19.6617f, 5.0028f, 21.0049f, 6.346f, 21.0049f, 8.0028f)
                curveTo(21.0049f, 9.6597f, 19.6617f, 11.0028f, 18.0049f, 11.0028f)
                curveTo(16.348f, 11.0028f, 15.0049f, 9.6597f, 15.0049f, 8.0028f)
                curveTo(15.0049f, 6.346f, 16.348f, 5.0028f, 18.0049f, 5.0028f)
                close()
                moveTo(11.0049f, 2.0028f)
                curveTo(12.6617f, 2.0028f, 14.0049f, 3.3459f, 14.0049f, 5.0028f)
                curveTo(14.0049f, 6.6597f, 12.6617f, 8.0028f, 11.0049f, 8.0028f)
                curveTo(9.348f, 8.0028f, 8.0049f, 6.6597f, 8.0049f, 5.0028f)
                curveTo(8.0049f, 3.3459f, 9.348f, 2.0028f, 11.0049f, 2.0028f)
                close()
            }
        }
        .build()
        return `_hand-coin-fill`!!
    }

private var `_hand-coin-fill`: ImageVector? = null
