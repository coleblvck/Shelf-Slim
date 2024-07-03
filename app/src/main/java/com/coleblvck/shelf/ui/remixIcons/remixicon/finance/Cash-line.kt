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

public val FinanceGroup.`Cash-line`: ImageVector
    get() {
        if (`_cash-line` != null) {
            return `_cash-line`!!
        }
        `_cash-line` = Builder(name = "Cash-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 16.0f)
                curveTo(14.2095f, 16.0f, 16.0004f, 14.2091f, 16.0004f, 12.0f)
                curveTo(16.0004f, 9.7909f, 14.2095f, 8.0f, 12.0004f, 8.0f)
                curveTo(9.7912f, 8.0f, 8.0004f, 9.7909f, 8.0004f, 12.0f)
                curveTo(8.0004f, 14.2091f, 9.7912f, 16.0f, 12.0004f, 16.0f)
                close()
                moveTo(21.0049f, 4.0029f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 4.0029f, 2.0049f, 4.4506f, 2.0049f, 5.0029f)
                verticalLineTo(19.0029f)
                curveTo(2.0049f, 19.5552f, 2.4526f, 20.0029f, 3.0049f, 20.0029f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 20.0029f, 22.0049f, 19.5552f, 22.0049f, 19.0029f)
                verticalLineTo(5.0029f)
                curveTo(22.0049f, 4.4506f, 21.5572f, 4.0029f, 21.0049f, 4.0029f)
                close()
                moveTo(4.0049f, 15.6463f)
                verticalLineTo(8.3537f)
                curveTo(5.1307f, 8.017f, 6.0184f, 7.1289f, 6.3545f, 6.0029f)
                horizontalLineTo(17.6462f)
                curveTo(17.9833f, 7.1319f, 18.8748f, 8.0218f, 20.0049f, 8.3564f)
                verticalLineTo(15.6436f)
                curveTo(18.8729f, 15.9788f, 17.9802f, 16.8711f, 17.6444f, 18.0029f)
                horizontalLineTo(6.3563f)
                curveTo(6.0214f, 16.8742f, 5.1326f, 15.9836f, 4.0049f, 15.6463f)
                close()
            }
        }
        .build()
        return `_cash-line`!!
    }

private var `_cash-line`: ImageVector? = null
