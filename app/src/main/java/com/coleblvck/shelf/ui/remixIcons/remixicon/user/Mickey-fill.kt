package com.coleblvck.shelf.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Mickey-fill`: ImageVector
    get() {
        if (`_mickey-fill` != null) {
            return `_mickey-fill`!!
        }
        `_mickey-fill` = Builder(name = "Mickey-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                curveTo(20.9853f, 2.0f, 23.0f, 4.0147f, 23.0f, 6.5f)
                curveTo(23.0f, 8.6831f, 21.4454f, 10.5032f, 19.3828f, 10.9134f)
                curveTo(19.7802f, 11.8623f, 20.0f, 12.9055f, 20.0f, 14.0f)
                curveTo(20.0f, 18.4183f, 16.4183f, 22.0f, 12.0f, 22.0f)
                curveTo(7.5817f, 22.0f, 4.0f, 18.4183f, 4.0f, 14.0f)
                curveTo(4.0f, 12.9055f, 4.2198f, 11.8623f, 4.6177f, 10.9121f)
                curveTo(2.5546f, 10.5032f, 1.0f, 8.6831f, 1.0f, 6.5f)
                curveTo(1.0f, 4.0147f, 3.0147f, 2.0f, 5.5f, 2.0f)
                curveTo(7.9028f, 2.0f, 9.8657f, 3.8832f, 9.9934f, 6.2541f)
                curveTo(10.6348f, 6.0881f, 11.3071f, 6.0f, 12.0f, 6.0f)
                curveTo(12.6929f, 6.0f, 13.3652f, 6.0881f, 14.0064f, 6.2537f)
                curveTo(14.1343f, 3.8832f, 16.0972f, 2.0f, 18.5f, 2.0f)
                close()
            }
        }
        .build()
        return `_mickey-fill`!!
    }

private var `_mickey-fill`: ImageVector? = null
