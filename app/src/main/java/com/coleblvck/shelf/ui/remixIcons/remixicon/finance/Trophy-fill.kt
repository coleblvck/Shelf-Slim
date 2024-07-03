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

public val FinanceGroup.`Trophy-fill`: ImageVector
    get() {
        if (`_trophy-fill` != null) {
            return `_trophy-fill`!!
        }
        `_trophy-fill` = Builder(name = "Trophy-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0049f, 16.9409f)
                verticalLineTo(19.0027f)
                horizontalLineTo(18.0049f)
                verticalLineTo(21.0027f)
                horizontalLineTo(6.0049f)
                verticalLineTo(19.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(16.9409f)
                curveTo(7.0586f, 16.4488f, 4.0049f, 13.0824f, 4.0049f, 9.0028f)
                verticalLineTo(3.0027f)
                horizontalLineTo(20.0049f)
                verticalLineTo(9.0028f)
                curveTo(20.0049f, 13.0824f, 16.9512f, 16.4488f, 13.0049f, 16.9409f)
                close()
                moveTo(1.0049f, 5.0027f)
                horizontalLineTo(3.0049f)
                verticalLineTo(9.0028f)
                horizontalLineTo(1.0049f)
                verticalLineTo(5.0027f)
                close()
                moveTo(21.0049f, 5.0027f)
                horizontalLineTo(23.0049f)
                verticalLineTo(9.0028f)
                horizontalLineTo(21.0049f)
                verticalLineTo(5.0027f)
                close()
            }
        }
        .build()
        return `_trophy-fill`!!
    }

private var `_trophy-fill`: ImageVector? = null
