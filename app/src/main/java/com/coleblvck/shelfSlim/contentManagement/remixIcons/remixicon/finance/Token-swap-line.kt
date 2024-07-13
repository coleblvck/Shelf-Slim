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

public val FinanceGroup.`Token-swap-line`: ImageVector
    get() {
        if (`_token-swap-line` != null) {
            return `_token-swap-line`!!
        }
        `_token-swap-line` = Builder(name = "Token-swap-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.5f)
                lineTo(6.5f, 15.0f)
                lineTo(9.0f, 17.5f)
                lineTo(11.5f, 15.0f)
                lineTo(9.0f, 12.5f)
                close()
                moveTo(15.0f, 2.5f)
                curveTo(11.5724f, 2.5f, 8.7644f, 5.153f, 8.5176f, 8.5176f)
                curveTo(5.153f, 8.7645f, 2.5f, 11.5724f, 2.5f, 15.0f)
                curveTo(2.5f, 18.5899f, 5.4102f, 21.5f, 9.0f, 21.5f)
                curveTo(12.4276f, 21.5f, 15.2356f, 18.847f, 15.4824f, 15.4824f)
                curveTo(18.847f, 15.2356f, 21.5f, 12.4276f, 21.5f, 9.0f)
                curveTo(21.5f, 5.4102f, 18.5899f, 2.5f, 15.0f, 2.5f)
                close()
                moveTo(15.3234f, 13.4886f)
                curveTo(14.7575f, 11.1126f, 12.8874f, 9.2424f, 10.5114f, 8.6767f)
                curveTo(10.6772f, 6.3423f, 12.6234f, 4.5f, 15.0f, 4.5f)
                curveTo(17.4853f, 4.5f, 19.5f, 6.5147f, 19.5f, 9.0f)
                curveTo(19.5f, 11.3766f, 17.6577f, 13.3228f, 15.3234f, 13.4886f)
                close()
                moveTo(13.5f, 15.0f)
                curveTo(13.5f, 17.4853f, 11.4853f, 19.5f, 9.0f, 19.5f)
                curveTo(6.5147f, 19.5f, 4.5f, 17.4853f, 4.5f, 15.0f)
                curveTo(4.5f, 12.5147f, 6.5147f, 10.5f, 9.0f, 10.5f)
                curveTo(11.4853f, 10.5f, 13.5f, 12.5147f, 13.5f, 15.0f)
                close()
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 4.7909f, 4.7909f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                curveTo(5.8954f, 5.0f, 5.0f, 5.8954f, 5.0f, 7.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(19.0f, 17.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 19.2091f, 19.2091f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1046f, 19.0f, 19.0f, 18.1046f, 19.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_token-swap-line`!!
    }

private var `_token-swap-line`: ImageVector? = null
