package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Police-badge-fill`: ImageVector
    get() {
        if (`_police-badge-fill` != null) {
            return `_police-badge-fill`!!
        }
        `_police-badge-fill` = Builder(name = "Police-badge-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9131f, 11.6739f)
                curveTo(3.2358f, 10.1953f, 3.5387f, 8.8081f, 2.0f, 6.5f)
                lineTo(5.5f, 2.5f)
                curveTo(5.5f, 2.5f, 9.0f, 4.0f, 12.0f, 1.5f)
                curveTo(15.0f, 4.0f, 18.5f, 2.5f, 18.5f, 2.5f)
                lineTo(22.0f, 6.5f)
                curveTo(20.4612f, 8.8081f, 20.7641f, 10.1954f, 21.0868f, 11.674f)
                curveTo(21.3933f, 13.0781f, 21.7177f, 14.5645f, 20.5f, 17.0f)
                curveTo(19.3425f, 19.315f, 17.3478f, 20.1227f, 15.4849f, 20.877f)
                curveTo(14.1289f, 21.4261f, 12.8428f, 21.9469f, 12.0003f, 23.0f)
                curveTo(11.1577f, 21.9469f, 9.8715f, 21.4261f, 8.5155f, 20.8771f)
                curveTo(6.6525f, 20.1227f, 4.6576f, 19.315f, 3.5f, 17.0f)
                curveTo(2.2822f, 14.5645f, 2.6066f, 13.078f, 2.9131f, 11.6739f)
                close()
                moveTo(14.3776f, 12.7725f)
                lineTo(16.7552f, 10.4549f)
                lineTo(13.4694f, 9.9775f)
                lineTo(11.9999f, 7.0f)
                lineTo(10.5304f, 9.9775f)
                lineTo(7.2446f, 10.4549f)
                lineTo(9.6223f, 12.7725f)
                lineTo(9.061f, 16.0451f)
                lineTo(11.9999f, 14.5f)
                lineTo(14.9388f, 16.0451f)
                lineTo(14.3776f, 12.7725f)
                close()
            }
        }
        .build()
        return `_police-badge-fill`!!
    }

private var `_police-badge-fill`: ImageVector? = null
