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

public val FinanceGroup.`Percent-fill`: ImageVector
    get() {
        if (`_percent-fill` != null) {
            return `_percent-fill`!!
        }
        `_percent-fill` = Builder(name = "Percent-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5049f, 21.0027f)
                curveTo(15.5719f, 21.0027f, 14.0049f, 19.4357f, 14.0049f, 17.5027f)
                curveTo(14.0049f, 15.5697f, 15.5719f, 14.0027f, 17.5049f, 14.0027f)
                curveTo(19.4379f, 14.0027f, 21.0049f, 15.5697f, 21.0049f, 17.5027f)
                curveTo(21.0049f, 19.4357f, 19.4379f, 21.0027f, 17.5049f, 21.0027f)
                close()
                moveTo(6.5049f, 10.0027f)
                curveTo(4.5719f, 10.0027f, 3.0049f, 8.4357f, 3.0049f, 6.5027f)
                curveTo(3.0049f, 4.5697f, 4.5719f, 3.0027f, 6.5049f, 3.0027f)
                curveTo(8.4379f, 3.0027f, 10.0049f, 4.5697f, 10.0049f, 6.5027f)
                curveTo(10.0049f, 8.4357f, 8.4379f, 10.0027f, 6.5049f, 10.0027f)
                close()
                moveTo(19.076f, 3.5175f)
                lineTo(20.4902f, 4.9317f)
                lineTo(4.9338f, 20.488f)
                lineTo(3.5196f, 19.0738f)
                lineTo(19.076f, 3.5175f)
                close()
            }
        }
        .build()
        return `_percent-fill`!!
    }

private var `_percent-fill`: ImageVector? = null
