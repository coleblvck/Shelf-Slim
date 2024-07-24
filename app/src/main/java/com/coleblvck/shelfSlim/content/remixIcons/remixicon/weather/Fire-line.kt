package com.coleblvck.shelfSlim.content.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Fire-line`: ImageVector
    get() {
        if (`_fire-line` != null) {
            return `_fire-line`!!
        }
        `_fire-line` = Builder(name = "Fire-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(16.1421f, 23.0f, 19.5f, 19.6421f, 19.5f, 15.5f)
                curveTo(19.5f, 14.6345f, 19.2697f, 13.8032f, 19.0f, 13.0296f)
                curveTo(17.3333f, 14.6765f, 16.0667f, 15.5f, 15.2f, 15.5f)
                curveTo(19.1954f, 8.5f, 17.0f, 5.5f, 11.0f, 1.5f)
                curveTo(11.5f, 6.4995f, 8.204f, 8.7738f, 6.8618f, 10.0366f)
                curveTo(5.4079f, 11.4045f, 4.5f, 13.3462f, 4.5f, 15.5f)
                curveTo(4.5f, 19.6421f, 7.8579f, 23.0f, 12.0f, 23.0f)
                close()
                moveTo(12.7094f, 5.235f)
                curveTo(15.9511f, 7.9853f, 15.9666f, 10.1223f, 13.463f, 14.5086f)
                curveTo(12.702f, 15.8419f, 13.6648f, 17.5f, 15.2f, 17.5f)
                curveTo(15.8884f, 17.5f, 16.5841f, 17.2992f, 17.3189f, 16.9051f)
                curveTo(16.6979f, 19.262f, 14.5519f, 21.0f, 12.0f, 21.0f)
                curveTo(8.9624f, 21.0f, 6.5f, 18.5376f, 6.5f, 15.5f)
                curveTo(6.5f, 13.9608f, 7.1328f, 12.5276f, 8.2323f, 11.4932f)
                curveTo(8.3583f, 11.3747f, 8.9975f, 10.8081f, 9.0248f, 10.7836f)
                curveTo(9.4486f, 10.4021f, 9.7978f, 10.0663f, 10.1429f, 9.6968f)
                curveTo(11.3733f, 8.3793f, 12.2571f, 6.9163f, 12.7094f, 5.235f)
                close()
            }
        }
        .build()
        return `_fire-line`!!
    }

private var `_fire-line`: ImageVector? = null
