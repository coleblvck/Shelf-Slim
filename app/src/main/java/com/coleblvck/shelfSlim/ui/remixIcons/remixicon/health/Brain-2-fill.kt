package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Brain-2-fill`: ImageVector
    get() {
        if (`_brain-2-fill` != null) {
            return `_brain-2-fill`!!
        }
        `_brain-2-fill` = Builder(name = "Brain-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                curveTo(6.567f, 2.0f, 5.0f, 3.567f, 5.0f, 5.5f)
                curveTo(5.0f, 5.6802f, 5.0136f, 5.8571f, 5.0399f, 6.03f)
                curveTo(3.3244f, 6.2552f, 2.0f, 7.7229f, 2.0f, 9.5f)
                curveTo(2.0f, 10.4793f, 2.4022f, 11.3647f, 3.0505f, 12.0f)
                curveTo(2.4022f, 12.6353f, 2.0f, 13.5207f, 2.0f, 14.5f)
                curveTo(2.0f, 15.9018f, 2.8236f, 17.1104f, 4.0135f, 17.6693f)
                curveTo(4.0046f, 17.7785f, 4.0f, 17.8888f, 4.0f, 18.0f)
                curveTo(4.0f, 20.2091f, 5.7909f, 22.0f, 8.0f, 22.0f)
                curveTo(9.1947f, 22.0f, 10.2671f, 21.4762f, 11.0f, 20.6458f)
                verticalLineTo(3.0505f)
                curveTo(10.3647f, 2.4022f, 9.4793f, 2.0f, 8.5f, 2.0f)
                close()
                moveTo(13.0f, 3.0505f)
                verticalLineTo(20.6458f)
                curveTo(13.7329f, 21.4762f, 14.8053f, 22.0f, 16.0f, 22.0f)
                curveTo(18.2091f, 22.0f, 20.0f, 20.2091f, 20.0f, 18.0f)
                curveTo(20.0f, 17.8888f, 19.9954f, 17.7785f, 19.9865f, 17.6693f)
                curveTo(21.1764f, 17.1104f, 22.0f, 15.9018f, 22.0f, 14.5f)
                curveTo(22.0f, 13.5207f, 21.5978f, 12.6353f, 20.9495f, 12.0f)
                curveTo(21.5978f, 11.3647f, 22.0f, 10.4793f, 22.0f, 9.5f)
                curveTo(22.0f, 7.7229f, 20.6756f, 6.2552f, 18.9601f, 6.03f)
                curveTo(18.9864f, 5.8571f, 19.0f, 5.6802f, 19.0f, 5.5f)
                curveTo(19.0f, 3.567f, 17.433f, 2.0f, 15.5f, 2.0f)
                curveTo(14.5207f, 2.0f, 13.6353f, 2.4022f, 13.0f, 3.0505f)
                close()
            }
        }
        .build()
        return `_brain-2-fill`!!
    }

private var `_brain-2-fill`: ImageVector? = null
