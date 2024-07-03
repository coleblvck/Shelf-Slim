package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`User-voice-fill`: ImageVector
    get() {
        if (`_user-voice-fill` != null) {
            return `_user-voice-fill`!!
        }
        `_user-voice-fill` = Builder(name = "User-voice-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 22.0f)
                curveTo(1.0f, 17.5817f, 4.5817f, 14.0f, 9.0f, 14.0f)
                curveTo(13.4183f, 14.0f, 17.0f, 17.5817f, 17.0f, 22.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveTo(5.685f, 13.0f, 3.0f, 10.315f, 3.0f, 7.0f)
                curveTo(3.0f, 3.685f, 5.685f, 1.0f, 9.0f, 1.0f)
                curveTo(12.315f, 1.0f, 15.0f, 3.685f, 15.0f, 7.0f)
                curveTo(15.0f, 10.315f, 12.315f, 13.0f, 9.0f, 13.0f)
                close()
                moveTo(18.2463f, 3.1845f)
                curveTo(18.732f, 4.3603f, 19.0f, 5.6488f, 19.0f, 7.0f)
                curveTo(19.0f, 8.3512f, 18.732f, 9.6398f, 18.2463f, 10.8155f)
                lineTo(16.5694f, 9.596f)
                curveTo(16.8485f, 8.7819f, 17.0f, 7.9087f, 17.0f, 7.0f)
                curveTo(17.0f, 6.0914f, 16.8485f, 5.2181f, 16.5694f, 4.4041f)
                lineTo(18.2463f, 3.1845f)
                close()
                moveTo(21.5476f, 0.7836f)
                curveTo(22.4773f, 2.6565f, 23.0f, 4.7672f, 23.0f, 7.0f)
                curveTo(23.0f, 9.2328f, 22.4773f, 11.3435f, 21.5476f, 13.2165f)
                lineTo(19.9027f, 12.0201f)
                curveTo(20.6071f, 10.4928f, 21.0f, 8.7923f, 21.0f, 7.0f)
                curveTo(21.0f, 5.2077f, 20.6071f, 3.5072f, 19.9027f, 1.9799f)
                lineTo(21.5476f, 0.7836f)
                close()
            }
        }
        .build()
        return `_user-voice-fill`!!
    }

private var `_user-voice-fill`: ImageVector? = null
