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

public val FinanceGroup.`Ticket-fill`: ImageVector
    get() {
        if (`_ticket-fill` != null) {
            return `_ticket-fill`!!
        }
        `_ticket-fill` = Builder(name = "Ticket-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0049f, 2.9997f)
                curveTo(21.5572f, 2.9997f, 22.0049f, 3.4474f, 22.0049f, 3.9997f)
                verticalLineTo(9.4997f)
                curveTo(20.6242f, 9.4997f, 19.5049f, 10.619f, 19.5049f, 11.9997f)
                curveTo(19.5049f, 13.3804f, 20.6242f, 14.4997f, 22.0049f, 14.4997f)
                verticalLineTo(19.9997f)
                curveTo(22.0049f, 20.5519f, 21.5572f, 20.9997f, 21.0049f, 20.9997f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9997f, 2.0049f, 20.5519f, 2.0049f, 19.9997f)
                verticalLineTo(14.4997f)
                curveTo(3.3856f, 14.4997f, 4.5049f, 13.3804f, 4.5049f, 11.9997f)
                curveTo(4.5049f, 10.619f, 3.3856f, 9.4997f, 2.0049f, 9.4997f)
                verticalLineTo(3.9997f)
                curveTo(2.0049f, 3.4474f, 2.4526f, 2.9997f, 3.0049f, 2.9997f)
                horizontalLineTo(21.0049f)
                close()
            }
        }
        .build()
        return `_ticket-fill`!!
    }

private var `_ticket-fill`: ImageVector? = null
