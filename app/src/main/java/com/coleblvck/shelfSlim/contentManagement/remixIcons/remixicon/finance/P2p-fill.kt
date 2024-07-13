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

public val FinanceGroup.`P2p-fill`: ImageVector
    get() {
        if (`_p2p-fill` != null) {
            return `_p2p-fill`!!
        }
        `_p2p-fill` = Builder(name = "P2p-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveTo(20.0f, 6.6568f, 18.6569f, 8.0f, 17.0f, 8.0f)
                curveTo(15.3431f, 8.0f, 14.0f, 6.6568f, 14.0f, 5.0f)
                curveTo(14.0f, 3.3431f, 15.3431f, 2.0f, 17.0f, 2.0f)
                curveTo(18.6569f, 2.0f, 20.0f, 3.3431f, 20.0f, 5.0f)
                close()
                moveTo(7.0f, 3.0f)
                curveTo(4.7909f, 3.0f, 3.0f, 4.7909f, 3.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.8954f, 5.8954f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 21.0f)
                curveTo(19.2091f, 21.0f, 21.0f, 19.2091f, 21.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.1046f, 18.1046f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(8.6568f, 16.0f, 10.0f, 14.6569f, 10.0f, 13.0f)
                curveTo(10.0f, 11.3431f, 8.6568f, 10.0f, 7.0f, 10.0f)
                curveTo(5.3432f, 10.0f, 4.0f, 11.3431f, 4.0f, 13.0f)
                curveTo(4.0f, 14.6569f, 5.3432f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(17.0f, 9.0f)
                curveTo(14.7909f, 9.0f, 13.0f, 10.7909f, 13.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 10.7909f, 19.2091f, 9.0f, 17.0f, 9.0f)
                close()
                moveTo(3.0f, 21.0f)
                curveTo(3.0f, 18.7909f, 4.7909f, 17.0f, 7.0f, 17.0f)
                curveTo(9.2091f, 17.0f, 11.0f, 18.7909f, 11.0f, 21.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_p2p-fill`!!
    }

private var `_p2p-fill`: ImageVector? = null
