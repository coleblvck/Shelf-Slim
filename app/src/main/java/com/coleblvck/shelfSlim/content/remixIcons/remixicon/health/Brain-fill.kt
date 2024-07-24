package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Brain-fill`: ImageVector
    get() {
        if (`_brain-fill` != null) {
            return `_brain-fill`!!
        }
        `_brain-fill` = Builder(name = "Brain-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.5351f)
                curveTo(10.4117f, 2.1948f, 9.7286f, 2.0f, 9.0f, 2.0f)
                curveTo(6.7909f, 2.0f, 5.0f, 3.7909f, 5.0f, 6.0f)
                verticalLineTo(7.7742f)
                curveTo(4.149f, 8.1164f, 3.4514f, 8.6479f, 2.9413f, 9.3493f)
                curveTo(2.2924f, 10.2415f, 2.0f, 11.3347f, 2.0f, 12.5f)
                curveTo(2.0f, 14.0614f, 2.7953f, 15.4356f, 4.0f, 16.242f)
                verticalLineTo(17.5f)
                curveTo(4.0f, 19.9853f, 6.0147f, 22.0f, 8.5f, 22.0f)
                curveTo(9.4251f, 22.0f, 10.285f, 21.7209f, 11.0f, 21.2422f)
                verticalLineTo(17.5f)
                curveTo(11.0f, 16.167f, 10.67f, 15.3147f, 10.1402f, 14.7408f)
                curveTo(9.5974f, 14.1528f, 8.7162f, 13.7165f, 7.3356f, 13.4864f)
                lineTo(7.6644f, 11.5136f)
                curveTo(8.966f, 11.7305f, 10.1058f, 12.1373f, 11.0f, 12.8271f)
                verticalLineTo(2.5351f)
                close()
                moveTo(13.0f, 2.5351f)
                verticalLineTo(12.8271f)
                curveTo(13.8942f, 12.1373f, 15.034f, 11.7305f, 16.3356f, 11.5136f)
                lineTo(16.6644f, 13.4864f)
                curveTo(15.2838f, 13.7165f, 14.4026f, 14.1528f, 13.8598f, 14.7408f)
                curveTo(13.33f, 15.3147f, 13.0f, 16.167f, 13.0f, 17.5f)
                verticalLineTo(21.2422f)
                curveTo(13.715f, 21.7209f, 14.5749f, 22.0f, 15.5f, 22.0f)
                curveTo(17.9853f, 22.0f, 20.0f, 19.9853f, 20.0f, 17.5f)
                verticalLineTo(16.242f)
                curveTo(21.2047f, 15.4356f, 22.0f, 14.0614f, 22.0f, 12.5f)
                curveTo(22.0f, 11.3347f, 21.7076f, 10.2415f, 21.0587f, 9.3493f)
                curveTo(20.5486f, 8.6479f, 19.8511f, 8.1164f, 19.0f, 7.7742f)
                verticalLineTo(6.0f)
                curveTo(19.0f, 3.7909f, 17.2091f, 2.0f, 15.0f, 2.0f)
                curveTo(14.2714f, 2.0f, 13.5883f, 2.1948f, 13.0f, 2.5351f)
                close()
            }
        }
        .build()
        return `_brain-fill`!!
    }

private var `_brain-fill`: ImageVector? = null
