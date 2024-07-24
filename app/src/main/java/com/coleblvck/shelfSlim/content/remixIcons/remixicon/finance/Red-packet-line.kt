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

public val FinanceGroup.`Red-packet-line`: ImageVector
    get() {
        if (`_red-packet-line` != null) {
            return `_red-packet-line`!!
        }
        `_red-packet-line` = Builder(name = "Red-packet-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.178f, 9.766f)
                curveTo(16.0334f, 9.3549f, 17.695f, 8.4283f, 19.0049f, 7.1442f)
                verticalLineTo(4.0028f)
                horizontalLineTo(5.0049f)
                verticalLineTo(7.1442f)
                curveTo(6.3147f, 8.4283f, 7.9763f, 9.3549f, 9.8317f, 9.766f)
                curveTo(10.2621f, 9.0115f, 11.0741f, 8.5028f, 12.0049f, 8.5028f)
                curveTo(12.9357f, 8.5028f, 13.7477f, 9.0115f, 14.178f, 9.766f)
                close()
                moveTo(14.3861f, 11.7666f)
                curveTo(14.0633f, 12.7737f, 13.1192f, 13.5028f, 12.0049f, 13.5028f)
                curveTo(10.8905f, 13.5028f, 9.9465f, 12.7737f, 9.6237f, 11.7666f)
                curveTo(7.9272f, 11.425f, 6.3602f, 10.7257f, 5.0049f, 9.7507f)
                verticalLineTo(20.0028f)
                horizontalLineTo(19.0049f)
                verticalLineTo(9.7507f)
                curveTo(17.6495f, 10.7257f, 16.0825f, 11.425f, 14.3861f, 11.7666f)
                close()
                moveTo(4.0049f, 2.0028f)
                horizontalLineTo(20.0049f)
                curveTo(20.5572f, 2.0028f, 21.0049f, 2.4505f, 21.0049f, 3.0028f)
                verticalLineTo(21.0028f)
                curveTo(21.0049f, 21.5551f, 20.5572f, 22.0028f, 20.0049f, 22.0028f)
                horizontalLineTo(4.0049f)
                curveTo(3.4526f, 22.0028f, 3.0049f, 21.5551f, 3.0049f, 21.0028f)
                verticalLineTo(3.0028f)
                curveTo(3.0049f, 2.4505f, 3.4526f, 2.0028f, 4.0049f, 2.0028f)
                close()
            }
        }
        .build()
        return `_red-packet-line`!!
    }

private var `_red-packet-line`: ImageVector? = null
