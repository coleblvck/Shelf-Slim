package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Service-line`: ImageVector
    get() {
        if (`_service-line` != null) {
            return `_service-line`!!
        }
        `_service-line` = Builder(name = "Service-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1611f, 4.4688f)
                curveTo(5.5851f, 2.0448f, 9.4472f, 1.9355f, 12.0008f, 4.1409f)
                curveTo(14.5528f, 1.9355f, 18.4149f, 2.0448f, 20.8388f, 4.4688f)
                curveTo(23.2584f, 6.8884f, 23.3716f, 10.741f, 21.1785f, 13.2947f)
                lineTo(13.4142f, 21.0858f)
                curveTo(12.6686f, 21.8313f, 11.4809f, 21.8652f, 10.6952f, 21.1874f)
                lineTo(10.5858f, 21.0858f)
                lineTo(2.8214f, 13.2947f)
                curveTo(0.6283f, 10.741f, 0.7415f, 6.8884f, 3.1611f, 4.4688f)
                close()
                moveTo(4.5753f, 5.883f)
                curveTo(2.8682f, 7.5901f, 2.8194f, 10.3276f, 4.429f, 12.0937f)
                lineTo(4.5753f, 12.2469f)
                lineTo(12.0f, 19.6715f)
                lineTo(17.3026f, 14.3675f)
                lineTo(13.7677f, 10.8327f)
                lineTo(12.7071f, 11.8934f)
                curveTo(11.5355f, 13.0649f, 9.636f, 13.0649f, 8.4644f, 11.8934f)
                curveTo(7.2929f, 10.7218f, 7.2929f, 8.8223f, 8.4644f, 7.6507f)
                lineTo(10.5656f, 5.5482f)
                curveTo(8.8529f, 4.1771f, 6.3708f, 4.2399f, 4.7286f, 5.7366f)
                lineTo(4.5753f, 5.883f)
                close()
                moveTo(13.0606f, 8.7114f)
                curveTo(13.4511f, 8.3209f, 14.0843f, 8.3209f, 14.4748f, 8.7114f)
                lineTo(18.7168f, 12.9533f)
                lineTo(19.4246f, 12.2469f)
                curveTo(21.1819f, 10.4896f, 21.1819f, 7.6403f, 19.4246f, 5.883f)
                curveTo(17.7174f, 4.1758f, 14.9799f, 4.127f, 13.2139f, 5.7366f)
                lineTo(13.0606f, 5.883f)
                lineTo(9.8786f, 9.0649f)
                curveTo(9.516f, 9.4276f, 9.4901f, 9.9994f, 9.8009f, 10.3919f)
                lineTo(9.8786f, 10.4792f)
                curveTo(10.2413f, 10.8418f, 10.8131f, 10.8677f, 11.2056f, 10.5569f)
                lineTo(11.2929f, 10.4792f)
                lineTo(13.0606f, 8.7114f)
                close()
            }
        }
        .build()
        return `_service-line`!!
    }

private var `_service-line`: ImageVector? = null
